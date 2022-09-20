/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.util.Comparator;

public class OrdenarProblemasResueltos implements Comparator<Usuario> {

    @Override
    public int compare(Usuario u1, Usuario u2) {
        if (u1.getResueltos() > u2.getResueltos()) {
            return -1;
        }
        if (u1.getResueltos() < u2.getResueltos()) {
            return 1;
        }
        return 0;
    }

}
