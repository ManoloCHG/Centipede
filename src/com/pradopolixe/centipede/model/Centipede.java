
package com.pradopolixe.centipede.model;

import java.util.Random;

public class Centipede {
  
    //Creacion matriz
    public char [][] matrizTablero = new char[20][20];
    // Rellenar matriz con 0
    public Centipede() {
        for(int y=0; y<20; y++) {
            for(int x=0; x<20; x++) {
                matrizTablero[x][y] = '0';
            }
        }
        this.ponerObstaculos();
        //this.colocarEnemigo();
    }
    
    public void mostrarTablero() {
        //Mostrar la matriz y enemigo 
        for(int y=0; y<20; y++) {
            for(int x=0; x<20; x++) {
                if (x == xEnemigo && y == yEnemigo){
                    System.out.print("2");
                }else{
                    if (x == xNave && y == yNave){
                        System.out.print("3");
                    }else{
                      System.out.print(matrizTablero[x][y]);  
                    }
                } 
            }
            System.out.println();
        }       
    }
    //colocar elementos
    //colocar obtaculo
    //Valor de los obtaculos = 5
    public void ponerObstaculos() {
        Random rnd = new Random();
        for (int i=0; i<20; i++){
        int x = rnd.nextInt(20);
        int y = rnd.nextInt(16);
        while (matrizTablero[x][y] == '5'){
            x = rnd.nextInt(20);
            y = rnd.nextInt(16);
        } 
        matrizTablero[x][y] = '5';
        }
    }
    //Mover enemigo
    //Valor del enemigo = 2
    int xEnemigo = 1;
    int yEnemigo = 0;
    int velocidadCienpies = 1;
    public void moverEnemigo(){
        int xFutura = xEnemigo + velocidadCienpies;
        if (xEnemigo == 0){
            yEnemigo ++;
            velocidadCienpies = 1;
            xEnemigo += velocidadCienpies;
        }else{
            if(xEnemigo == 19){
              yEnemigo++;
              velocidadCienpies = -1;
              xEnemigo += velocidadCienpies;
            }else{
                if(matrizTablero[xFutura][yEnemigo] == '5' && velocidadCienpies == 1){
                yEnemigo++;
                velocidadCienpies = -1;
                xEnemigo += velocidadCienpies;
                }else{
                    if (matrizTablero[xFutura][yEnemigo] == '5' && velocidadCienpies == -1){
                        yEnemigo ++;
                        velocidadCienpies = 1;
                        xEnemigo += velocidadCienpies;
                    }else{
                        if (xEnemigo != 0 && xEnemigo != 19){
                        xEnemigo += velocidadCienpies;
                        }
                    }
                }
            }
        }
    }
    int xNave = 9;
    int yNave = 19;
    //Valor de la Nave = 3
    public void moverNave(int direcNave) {  
        try {
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: No existe la posición indicada");
        } catch(Exception e) {
            System.out.println("ERROR desconocido");
        }
        switch (direcNave){
            case 1 :
             //Movimiento para Arriba = 1
                if (yNave >= 17){
                yNave --;
                }
            break;
            case 2 :
            //Movimiento para Abajo = 2
                if (yNave < 19){
                yNave ++;
                }
            break;
            case 3 :
            //Movimiento para Izquierda = 3
                if (xNave > 0){
                xNave --;
                }
            break;
            case 4 :
            //Movimiento para Derecha = 4
                if (xNave < 19){
                xNave ++;
                }
            break;
        }
    }
}
