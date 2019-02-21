
package com.pradopolixe.centipede.model;


public class NewMain {

    public static void main(String[] args) {
        Centipede centipede = new Centipede();
        System.out.println("");
        centipede.mostrarTablero();
        for (int i=0; i<40; i++){
        centipede.moverEnemigo();
        System.out.println("");
        centipede.mostrarTablero();
        }
    }           
}
