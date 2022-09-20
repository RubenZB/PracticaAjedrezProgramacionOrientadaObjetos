/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.Serializable;
import javax.swing.ImageIcon;

public class Alfil extends Pieza implements Serializable {

    public Alfil(char n, ColorPieza c) {
        super(n, c);
    }

    public char getInicial() {
        return super.getInicial();
    }

    public ColorPieza getColor() {
        return super.getColorPieza();
    }
}
