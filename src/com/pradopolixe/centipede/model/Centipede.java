
package com.pradopolixe.centipede.model;

import java.util.ArrayList;
import java.util.Random;
import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;

public class Centipede {
  
    //Creacion matriz
    public char [][] matrizTablero = new char[33][33];
    // Rellenar matriz con 0 (Metodo cosntructor)
    public Centipede() {
        for(int y=0; y<33; y++) {
            for(int x=0; x<33; x++) {
                matrizTablero[x][y] = '0';
            }
        }
        this.ponerObstaculos();
    }
    ArrayList<Point> listaEnemigo = new ArrayList();
    public void mostrarTablero() {
        //Mostrar la matriz y diferentes elementos colocados sobre la matriz
        for(int y=0; y<33; y++) {
            for(int x=0; x<33; x++) {
                if (x == xEnemigo && y == yEnemigo){
                    System.out.print("2");
                }else{
                    if (x == xNave && y == yNave){
                        System.out.print("3");
                    }else{
                        if (disparo == true && x == xDisparo && y == yDisparo){
                            System.out.print("4");
                        }else{
                            System.out.print(matrizTablero[x][y]);
                        }
                    }
                } 
            }
            System.out.println();
        }       
    }
    
    //---------------------------colocar elementos-------------------------
    //colocar obtaculo de manera aleatoria (elementos fijos)
    //Valor de los obtaculos = 5
    public void ponerObstaculos() {
        Random rnd = new Random();
        for (int i=0; i<33; i++){
        int x = rnd.nextInt(33);
        int y = rnd.nextInt(29);
        while (matrizTablero[x][y] == '5'){
            x = rnd.nextInt(33);
            y = rnd.nextInt(29);
        } 
        matrizTablero[x][y] = '5';
        }
    }
    
    //Arraylist del enemigo (cuerpo del enemigo)
    public void Enemigo(){
        int s = 0;
        Point point = new Point();
        listaEnemigo.add (new Point(xEnemigo,yEnemigo,0,Color.BLACK));
        listaEnemigo.add (new Point(6,0,0,Color.BLACK));
        listaEnemigo.add (new Point(5,0,0,Color.BLACK));
        listaEnemigo.add (new Point(4,0,0,Color.BLACK));
        listaEnemigo.add (new Point(3,0,0,Color.BLACK));
        listaEnemigo.add (new Point(2,0,0,Color.BLACK));
        listaEnemigo.add (new Point(1,0,0,Color.BLACK));
        System.out.println("Posicion Inicial");
    }
    //Mover enemigo con todas las colisiones 
    //Valor del enemigo = 2
    public int xEnemigo = 7;
    public int yEnemigo = 0;
    public int velocidadCienpies = 1;
    public void moverEnemigo(){
        int xFutura = xEnemigo + velocidadCienpies;
        if (xEnemigo == 0){
            yEnemigo ++;
            velocidadCienpies = 1;
            xEnemigo += velocidadCienpies;
        }else{
            if(xEnemigo == 32){
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
                        if (xEnemigo != 0 && xEnemigo != 32){
                        xEnemigo += velocidadCienpies;
                        }
                    }
                }
            }
        }
        //este bucle comprueva todas las posiciones del cienpies depues de realizar un movimiento 
        listaEnemigo.add (0,new Point(xEnemigo,yEnemigo,0,Color.BLACK));
        listaEnemigo.remove (7);
        for(int i=0; i<listaEnemigo.size(); i++ ){
            Point p = listaEnemigo.get(i);
            System.out.println("PX:"+p.getX()+ ","+"PY:"+ p.getY());
        }
    }
    
    public int xNave = 9;
    public int yNave = 32;
    //Valor de la Nave = 3
    // con los diferentes movimientos  
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
                if (yNave >= 29){
                yNave --;
                }
            break;
            case 2 :
            //Movimiento para Abajo = 2
                if (yNave < 32){
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
                if (xNave < 32){
                xNave ++;
                }
            break;
        }
    }
    // el disparo  que va a realizar la nave
    public int yDisparo = 0;
    public int xDisparo = 0;
    boolean disparo = false;
    public void disparar(){
        disparo = true;
        yDisparo = yNave-1;
        xDisparo = xNave;
        System.out.println(disparo);
    }
   //metodo que mueve el disparo en vertical
    public void moverdisparo(){
         yDisparo --;
    }
   //este metodo comprueva si el disparo ha colisionado con alguno de los elementos del arrays list y retorna un boolean 
    public boolean colisiondisparo(){
        boolean choque = false;
        for(int i=0; i<listaEnemigo.size(); i++ ){
            Point p = listaEnemigo.get(i);
            if (p.getX()== xDisparo && p.getY()==yDisparo){
            choque = true;
            }
        }
        return choque;
    }
}
