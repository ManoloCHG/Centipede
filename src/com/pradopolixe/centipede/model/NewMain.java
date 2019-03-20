
package com.pradopolixe.centipede.model;


public class NewMain {

    public static void main(String[] args) {
        Centipede centipede = new Centipede();
        System.out.println("");
        centipede.mostrarTablero();
        for (int i=0; i<15; i++){
        centipede.moverEnemigo();
        centipede.moverNave(4);
        System.out.println("");
        centipede.mostrarTablero();
        }
    }           
}
