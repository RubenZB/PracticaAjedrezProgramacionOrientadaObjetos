/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.Serializable;

public class Casilla implements Serializable {

    private char x;
    private int y;
    private boolean libre = true;
    private Pieza pieza;

    public Casilla() {
        this.libre = true;

    }

    public Casilla(char x, int y) {
        this.x = x;
        this.y = y;
        this.libre = true;

    }

    public Casilla(char x, int y, Pieza p) {
        this(x, y);
        this.libre = false;
        this.pieza = p;

    }

    public void asignarPieza(String s) throws MiExcepcion {
        char ini;
        ColorPieza color = null;
        Pieza p = null;

        ini = s.charAt(1);
        // instrucción switch con tipo de datos int
        switch (ini) {
            case 'B':
                color = ColorPieza.BLANCA;
                break;
            case 'N':
                color = ColorPieza.NEGRA;
                break;
            default:
                throw new MiExcepcion("Tablero invalido");
        }
        ini = s.charAt(0);
        switch (ini) {
            case 'A':
                p = new Alfil(ini, color);
                break;
            case 'C':
                p = new Caballo(ini, color);
                break;
            case 'D':
                p = new Dama(ini, color);
                break;
            case 'P':
                p = new Peon(ini, color);
                break;
            case 'R':
                p = new Rey(ini, color);
                break;
            case 'T':
                p = new Torre(ini, color);
                break;
            default:
                throw new MiExcepcion("Tablero invalido");
        }
        p.asignarImagen();
        this.setPieza(p);
    }

    public void setX(char x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

}
