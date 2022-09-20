/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class Tablero implements Serializable {

    private Casilla[][] matriz = new Casilla[TAMAÑO][TAMAÑO];
    private static final int TAMAÑO = 8;
    private String solucion;
    private static final String SEPARATOR = ",";

    public Tablero() {
        for (int fila = 0; fila < TAMAÑO; fila++) {
            for (int columna = 0; columna < TAMAÑO; columna++) {
                Casilla aux = new Casilla(numeroaChar(columna), 8 - fila);
                matriz[fila][columna] = aux;
            }
        }
    }

    public void LeerTableroRuta(String ruta) throws MiExcepcion {
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);

            for (int fila = 0; fila < TAMAÑO; fila++) {
                String lineaTablero = br.readLine();
                String[] paginas = lineaTablero.split(SEPARATOR);
                int pagina = 0;
                for (int columna = 0; columna < TAMAÑO; columna++) {
                    String caracter = paginas[pagina];
                    pagina++;
                    if (!caracter.equals("VV")) {
                        this.addPieza(caracter, fila, columna);
                        matriz[fila][columna].setLibre(false);
                    }
                }
            }
            this.solucion = br.readLine();
        } catch (Exception e) {
            System.out.println("Problema con el nivel seleccionado");
        }
    }

    public String getSolucion() {
        return this.solucion;
    }

    public void addPieza(String pieza, int fila, int columna) throws MiExcepcion {
        this.matriz[fila][columna].asignarPieza(pieza);
    }

    public char numeroaChar(int n) {
        char col = ' ';
        switch (n) {
            case 0:
                col = 'a';
                break;
            case 1:
                col = 'b';
                break;
            case 2:
                col = 'c';
                break;
            case 3:
                col = 'd';
                break;
            case 4:
                col = 'e';
                break;
            case 5:
                col = 'f';
                break;
            case 6:
                col = 'g';
                break;
            case 7:
                col = 'h';
                break;
        }
        return col;
    }

    public int charaNumero(char c) {
        int col = -1;
        switch (c) {
            case 'a':
                col = 0;
                break;
            case 'b':
                col = 1;
                break;
            case 'c':
                col = 2;
                break;
            case 'd':
                col = 3;
                break;
            case 'e':
                col = 4;
                break;
            case 'f':
                col = 5;
                break;
            case 'g':
                col = 6;
                break;
            case 'h':
                col = 7;
                break;
        }
        return col;
    }

    public Casilla[][] getMatriz() {
        return matriz;
    }

    public Casilla getCasilla(int i, int j) {
        return this.matriz[i][j];
    }
}
