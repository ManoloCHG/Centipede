/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede.view;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class CentipedeGrafico {
    
    GridPane gridTablero = new GridPane();
    
    public GridPane getGridTablero() {
        return gridTablero;
    }
    
    public void ponerChampiñon(int x, int y) {
//        Rectangle casilla = new Rectangle (50, 50);
//        casilla.setFill(Color.BEIGE);
//        casilla.setStroke(Color.BROWN);
//        gridTablero.add(casilla,x,y);
//        Circle ola = new Circle (20, Color.CHOCOLATE);
//        ola.setFill(Color.BURLYWOOD);
//        gridTablero.add(ola,x,y);

    Group champiñon = new Group();
        Arc cabezaChampiñon = new Arc();
            cabezaChampiñon.setCenterX(150.0f);
            cabezaChampiñon.setCenterY(150.0f);
            cabezaChampiñon.setRadiusX(10.0f);
            cabezaChampiñon.setRadiusY(10.0f);
            cabezaChampiñon.setStartAngle(-45.0f);
            cabezaChampiñon.setLength(270.0f);
        cabezaChampiñon.setFill(Color.DEEPPINK);
        gridTablero.add(champiñon,x,y);
        Rectangle cuerpoChampiñon = new Rectangle(145,155,10,10);
        cuerpoChampiñon.setFill(Color.DEEPPINK);
//        Circle redondo = new Circle(5,Color.BLUE);
        champiñon.getChildren().add(cabezaChampiñon);
        champiñon.getChildren().add(cuerpoChampiñon);
        
    }
    
    
    public void mostrarTablero(){
        for(int y=0; y<33; y++){
            for(int x=0; x<33; x++){
                dibujarTablero(x,y);
            }
        }
    }

    public void dibujarTablero(int x, int y) {
            Rectangle prueba = new Rectangle(0, 0, 20, 20);
            // Le damos color a la casilla
            prueba.setFill(Color.BEIGE);
            // Le damos color al borde
            prueba.setStroke(Color.BROWN);
            // Añadimos el tablero al panel 
            gridTablero.add(prueba, x, y);
        }
    }


  
//    
//    public void champiñon(int x, int y, char seta){
//        
//        if(seta == '1'){
//            Arc cabeza = new Arc(150.0f, 150.0f, 10.0f, 10.0f, -45.0f, 270.0f);
//            cabeza.setFill(Color.AQUAMARINE);
////            CentipedeGrafico.add(cabeza,x,y);
//     
//            Rectangle ave = new Rectangle(x, y, Color.DARKSEAGREEN);