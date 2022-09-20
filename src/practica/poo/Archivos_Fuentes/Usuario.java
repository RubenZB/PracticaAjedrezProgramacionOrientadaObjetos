/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Usuario implements Comparable<Usuario>, Serializable {

    private String login;
    private String pwd;
    private int problemas_intentados;
    private int problemas_resueltos;
    private int errores;
    private double porcentaje_exito;
    private static final double PORCENTAJEMIN = 0;
    private static final double PORCENTAJEMAX = 1;
    private ArrayList<Integer> resueltos;

    public Usuario() {
        resueltos = new ArrayList<>();
    }

    public Usuario(String log, String pass) {
        login = log;
        pwd = pass;
        resueltos = new ArrayList<>();
        this.porcentaje_exito= 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Usuario u = (Usuario) obj;
        return (u.login.equals(this.getLogin()));

    }

    public boolean equalsContra(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Usuario u = (Usuario) obj;
        return (u.login.equals(this.getLogin()) && u.pwd.equals(this.getPwd()));

    }

    public void intento(boolean jugar, int nivel) {
        this.problemas_intentados++;
        if (jugar) {
            this.problemas_resueltos++;
            this.hacerPorcentaje();
            this.resueltos.add(nivel + 1);
        } else {
            this.errores++;
            this.hacerPorcentaje();
        }
    }

    public String getLogin() {
        return login;
    }

    public int getProblemas_intentados() {
        return problemas_intentados;
    }

    public int getErrores() {
        return errores;
    }

    public String getPwd() {
        return pwd;
    }

    public double getPorcentaje_exito() {
        this.hacerPorcentaje();
        return porcentaje_exito;
    }

    public boolean containsResuelto(int n) {
        return resueltos.contains(n);
    }

    public int getResueltos() {
        return problemas_resueltos;
    }

    public void hacerPorcentaje() {
        double i = this.problemas_resueltos;
        double j = this.problemas_intentados;
        if((i>0)&&(j>0)){
            double por = i / j;
            this.setPorcentaje_exito(por * 100);
        }
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setProblemas_intentados(int problemas_intentados) {
        this.problemas_intentados = problemas_intentados;
    }

    public void setProblemas_resueltos(int problemas_resueltos) {
        this.problemas_resueltos = problemas_resueltos;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public void setPorcentaje_exito(double porcentaje_exito) {
        this.porcentaje_exito = porcentaje_exito;
    }

    public void setResueltos(ArrayList<Integer> resueltos) {
        this.resueltos = resueltos;
    }

    public void metodoAuxBackUpAñadirResuelto(int i) {
        this.resueltos.add(i);
    }

    @Override
    public int compareTo(Usuario u) {
        if (porcentaje_exito > u.porcentaje_exito) {
            return -1;
        }
        if (porcentaje_exito < u.porcentaje_exito) {
            return 1;
        }
        return 0;
    }

}
