
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
        //Mostrar la matriz
        for(int y=0; y<20; y++) {
            for(int x=0; x<20; x++) {
                if (matrizTablero[x][y] == matrizTablero[xEnemigo][yEnemigo]){
                    matrizTablero [x][y] = '2';
                     System.out.print(matrizTablero[x][y]);
                }else{
                    if (matrizTablero[x][y] != matrizTablero[xEnemigo][yEnemigo]){
                        System.out.print(matrizTablero[x][y]);
            }
          }
                
            }
            System.out.println();
        }       
    }
    //colocar elementos
    //colocar obtaculo
    public void ponerObstaculos() {
        Random rnd = new Random();
        for (int i=0; i<20; i++){
        int x = rnd.nextInt(20);
        int y = rnd.nextInt(20);
        while (matrizTablero[x][y] == '5'){
            x = rnd.nextInt(20);
            y = rnd.nextInt(20);
        } 
        matrizTablero[x][y] = '5';
        }
    }
   
    //Colocar enemigo
//    public void colocarEnemigo(){
//        matrizTablero[xEnemigo][yEnemigo] = '2';
//    }
    //Mover enemigo
    int xEnemigo = 1;
    int yEnemigo = 0;
    int velocidadCienpies = 1;
    public void moverEnemigo(){
        if (xEnemigo == 0){
            //matrizTablero[xEnemigo][yEnemigo] = '0';
            yEnemigo ++;
            //matrizTablero[xEnemigo][yEnemigo] = '0';
            velocidadCienpies = 1;
            xEnemigo += velocidadCienpies;
            //this.colocarEnemigo();
        }else{
            if(xEnemigo == 19){
              //matrizTablero[xEnemigo][yEnemigo] = '0';
              yEnemigo++;
              //matrizTablero[xEnemigo][yEnemigo] = '0';
              velocidadCienpies = -1;
              xEnemigo += velocidadCienpies;
              //this.colocarEnemigo();
            }else{
            if (xEnemigo != 0 && xEnemigo != 19){
                //matrizTablero[xEnemigo][yEnemigo] = '0';
                xEnemigo += velocidadCienpies;
                //this.colocarEnemigo();
            }
          }
        }
    }
}
