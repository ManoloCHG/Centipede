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
        Rectangle casilla = new Rectangle (50, 50);
        casilla.setFill(Color.BEIGE);
        casilla.setStroke(Color.BROWN);
        gridTablero.add(casilla,x,y);
//        Circle ola = new Circle (20, Color.CHOCOLATE);
//        ola.setFill(Color.BURLYWOOD);
//        gridTablero.add(ola,x,y);

    Group grupito = new Group();
        Arc arc = new Arc();
            arc.setCenterX(150.0f);
            arc.setCenterY(150.0f);
            arc.setRadiusX(10.0f);
            arc.setRadiusY(10.0f);
            arc.setStartAngle(-45.0f);
            arc.setLength(270.0f);
        arc.setFill(Color.DEEPPINK);
        gridTablero.add(grupito,x,y);
        Rectangle prueba = new Rectangle(145,155,10,10);
        prueba.setFill(Color.DEEPPINK);
        Circle redondo = new Circle(5,Color.BLUE);
        grupito.getChildren().add(arc);
        grupito.getChildren().add(prueba);
        
    }
    
    
    public void mostrarTablero(){
        for(int y=0; y<7; y++){
            for(int x=0; x<7; x++){
                dibujarTablero(x,y);
            }
        }
    }

    public void dibujarTablero(int x, int y) {
        
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