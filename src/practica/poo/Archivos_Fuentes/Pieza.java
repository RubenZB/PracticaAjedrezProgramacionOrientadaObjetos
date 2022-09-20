/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Pieza implements Serializable {

    private final char inicial;
    private final ColorPieza color;
    private ImageIcon icono;

    public Pieza(char n, ColorPieza c) {
        inicial = n;
        color = c;
    }

    public char getInicial() {
        return this.inicial;
    }

    public ColorPieza getColorPieza() {
        return this.color;
    }

    public void asignarImagen() {
        ImageIcon aux = new ImageIcon(this.toStringIcono());
        this.icono = aux;
    }

    public String toStringIcono() {
        return ( ""+this.getInicial() + this.getColorPieza() + ".png");
    }

    public ImageIcon getIcono() {
        return icono;
    }

}
