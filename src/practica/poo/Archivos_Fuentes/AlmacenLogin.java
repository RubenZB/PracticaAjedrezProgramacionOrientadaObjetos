/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AlmacenLogin implements Serializable {

    private ArrayList<Usuario> Usuarios;

    public AlmacenLogin() {
        Usuarios = new ArrayList<>();
    }

    public void registrar(Usuario u) {
        if (!(Usuarios.contains(u))) {
            Usuarios.add(u);
        }
    }

    public boolean Autenticar(Usuario u) {
        boolean sePuede = false;
        for (Usuario user : Usuarios) {
            sePuede = (u.equalsContra(user));
            if (sePuede) {
                return sePuede;
            }
        }
        return sePuede;
    }

    public int getIndex(Usuario u) {
        return Usuarios.indexOf(u);
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public boolean hacerBackUp() {
        try {
            FileOutputStream fos = new FileOutputStream("ficheroUsuarios.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this.Usuarios);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public boolean restaurarBackUp() {
        try {
            FileInputStream fis = new FileInputStream("ficheroUsuarios.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            this.Usuarios = (ArrayList<Usuario>) ois.readObject();

            ois.close();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public Usuario getUsuario(int i) {
        return Usuarios.get(i);
    }

    public String[] solucionado(int i) {
        String[] nombres = new String[this.Usuarios.size()];
        for (int j = 0; j < this.Usuarios.size(); j++) {
            if (this.Usuarios.get(j).containsResuelto(i)) {
                nombres[j] = Usuarios.get(j).getLogin();
            }
        }
        return nombres;
    }

    public String[] solucionadoPro(String[] nom) {
        int cont = 0;
        for (int j = 0; j < this.Usuarios.size(); j++) {
            if (nom[j] != null) {
                cont++;
            }
        }
        String[] nombres = new String[cont];
        int conta = 0;
        for (int m = 0; m < this.Usuarios.size(); m++) {
            if (nom[m] != null) {
                nombres[conta] = nom[m];
                conta++;
            }
        }
        return nombres;
    }

    public int buscarUsuarioXnombre(String n) {
        int i = 0;
        int j = 0;
        boolean encontrado = false;
        Usuario aux = new Usuario();
        aux.setLogin(n);
        while ((i < this.Usuarios.size()) && (!encontrado)) {
            if (this.Usuarios.get(i).equals(aux)) {
                encontrado = true;
                j = i;
            }
            i++;
        }
        return j;
    }
}
