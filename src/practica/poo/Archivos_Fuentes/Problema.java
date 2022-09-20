/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.Serializable;

public class Problema implements Serializable {

    private int nombre;
    private int veces_resuelto;
    private int veces_intentado;
    private double porcentaje_exito;
    private String jugada_ganadora;
    private boolean valido;
    private Tablero tablero;

    public Problema(Tablero t, int n) {
        tablero = t;
        nombre = n;
    }

    public Problema() {
    }

    public boolean jugar(String jugada, boolean contains) {
        if (contains) {
            if (this.jugada_ganadora.equals(jugada)) {
                return true;

            } else {
                return false;
            }
        } else {
            this.veces_intentado++;
            if (this.jugada_ganadora.equals(jugada)) {
                this.veces_resuelto++;
                this.actuPorcentaje();
                return true;
            } else {
                this.actuPorcentaje();
                return false;
            }
        }
    }

    public void actuPorcentaje() {
        double i = this.veces_resuelto;
        double j = this.veces_intentado;
        double por = i / j;
        this.setPorcentaje_exito(por * 100);
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void asignarTablero(String ruta) throws MiExcepcion {
        Tablero aux = new Tablero();
        aux.LeerTableroRuta(ruta);
        this.tablero = aux;
        this.jugada_ganadora = aux.getSolucion();
    }

    public int getVecesResuelto() {
        return veces_resuelto;
    }

    public int getVecesIntentado() {
        return veces_intentado;
    }

    public double getPorcentajeExito() {
        return porcentaje_exito;
    }

    public void setVeces_resuelto(int veces_resuelto) {
        this.veces_resuelto = veces_resuelto;
    }

    public void setPorcentaje_exito(double porcentaje_exito) {
        this.porcentaje_exito = porcentaje_exito;
    }

}
