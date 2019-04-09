
package com.pradopolixe.centipede.model;


public class NewMain {

    public static void main(String[] args) {
        Centipede centipede = new Centipede();
        System.out.println("");
        centipede.mostrarTablero();
        centipede.disparar();
        centipede.mostrarTablero();
        centipede.Enemigo();
        for (int i=0; i<20; i++){
            centipede.moverEnemigo();
            centipede.moverNave(3);
            centipede.moverdisparo();
            System.out.println("");
            centipede.mostrarTablero();
        }
    }           
}
