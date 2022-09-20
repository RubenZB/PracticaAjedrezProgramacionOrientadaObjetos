/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Clasificacion implements Serializable {

    private ArrayList<Usuario> copiaUsuarios;

    public Clasificacion(ArrayList<Usuario> users) {
        copiaUsuarios = new ArrayList<>(users);
    }

    public void ordenadaPorcentaje2() {
        Collections.sort(copiaUsuarios);
    }

    public void ordenadaResueltos2() {
        Collections.sort(copiaUsuarios, new OrdenarProblemasResueltos());

    }

    public ArrayList<Usuario> getCopia() {
        return copiaUsuarios;
    }

}
