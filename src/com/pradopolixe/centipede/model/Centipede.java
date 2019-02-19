
package com.pradopolixe.centipede.model;

public class Centipede {
    char [][] matrizTablero = new char[20][20];
    
    public void mostrarTablero() {
        for(int y=0; y<20; y++) {
            for(int x=0; x<20; x++) {
                System.out.print(matrizTablero[x][y]);
            }
            System.out.println();
        }       
    }
    
    public void ponerFicha(int x, int y, int jugador) {
        matrizTablero[x][y] = jugador;
    }    
    
}
