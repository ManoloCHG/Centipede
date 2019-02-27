
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
                    System.out.print("3");
                }else{
                  System.out.print(matrizTablero[x][y]);
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
        int y = rnd.nextInt(18);
        while (matrizTablero[x][y] == '5'){
            x = rnd.nextInt(20);
            y = rnd.nextInt(18);
        } 
        matrizTablero[x][y] = '5';
        }
    }
    //Mover enemigo
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
    public void moverNave(int xOrigen) {  
        try {
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: No existe la posición indicada");
        } catch(Exception e) {
            System.out.println("ERROR desconocido");
        }
    }
}
