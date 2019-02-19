
package com.pradopolixe.centipede.model;

import java.util.Random;

public class Centipede {
    //Creacion y mostrado por consola de la matriz 
    public char [][] matrizTablero = new char[20][20];
    
    public void mostrarTablero() {
        System.out.println("hola2");
        for(int y=0; y<20; y++) {
            for(int x=0; x<20; x++) {
                System.out.print(matrizTablero[x][y]);
            }
            System.out.println();
        }       
    }
    //colocar elemento
    public void ponerObstaculo() {
        Random rnd = new Random();
        int x = rnd.nextInt(20);
        int y = rnd.nextInt(20);
        matrizTablero[x][y] = '5';
    }    
    
}
