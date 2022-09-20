/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class MiExcepcion extends Exception {

    public MiExcepcion() {
        super();
    }

    public MiExcepcion(String mensaje) {
        super(mensaje);
        JOptionPane.showMessageDialog(null, "Tablero no valido");
    }
}
