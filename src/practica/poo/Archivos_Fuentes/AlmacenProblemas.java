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
import javax.swing.JOptionPane;

public class AlmacenProblemas implements Serializable {

    private ArrayList<Problema> Problemas;

    public AlmacenProblemas() {
        Problemas = new ArrayList<>();
    }

    public ArrayList<Problema> getProblemas() {
        return Problemas;
    }

    public void subirProblema(String str) throws MiExcepcion {
        if (this.validarProblema(str)) {
            Problema aux = new Problema();
            aux.asignarTablero(str);
            aux.setNombre(this.Problemas.size() + 1);
            this.Problemas.add(aux);
        } else {
            JOptionPane.showMessageDialog(null, "Tablero no valido");
        }
    }

    public boolean validarProblema(String str) throws MiExcepcion {
        Tablero t = new Tablero();
        t.LeerTableroRuta(str);
        Casilla[][] aux = new Casilla[8][8];
        aux = t.getMatriz();
        int cBlanco = 0;
        int cNegro = 0;
        int fila = 0;
        int columna = 0;

        while ((cBlanco <= 1) && (cNegro <= 1) && (fila < 8)) {
            columna = 0;
            while ((cBlanco <= 1) && (cNegro <= 1) && (columna < 8)) {
                if (aux[fila][columna].getPieza() != null) {
                    if ((aux[fila][columna].getPieza().getInicial() == 'R') && (aux[fila][columna].getPieza().getColorPieza() == ColorPieza.BLANCA)) {
                        cBlanco++;
                    }
                    if ((aux[fila][columna].getPieza().getInicial() == 'R') && (aux[fila][columna].getPieza().getColorPieza() == ColorPieza.NEGRA)) {
                        cNegro++;
                    }
                }
                columna++;
            }
            fila++;
        }

        if ((cBlanco == 1) && (cNegro == 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hacerBackUp() {
        try {
            FileOutputStream fos = new FileOutputStream("ficheroProblemas.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this.Problemas);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public boolean restaurarBackUp() {
        try {
            FileInputStream fis = new FileInputStream("ficheroProblemas.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            this.Problemas = (ArrayList<Problema>) ois.readObject();

            ois.close();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public String[] problemasGuardados() {
        String[] nombres = new String[this.Problemas.size()];
        for (int j = 0; j < this.Problemas.size(); j++) {
            nombres[j] = Integer.toString(j + 1);
        }
        return nombres;
    }
public void metodoAuxParaProbar(Problema p){
    this.Problemas.add(p);
}
}
