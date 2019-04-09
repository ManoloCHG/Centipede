/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede.view;

import com.pradopolixe.centipede.model.Centipede;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class CentipedeGrafico {
    Centipede union = new Centipede();
    GridPane gridTablero = new GridPane();
    
    public GridPane getGridTablero() {
        return gridTablero;
    }
    
    public void ponerChampiñon(int x, int y) {
        Arc champiñon = new Arc();
            champiñon.setCenterX(150.0f);
            champiñon.setCenterY(150.0f);
            champiñon.setRadiusX(10.0f);
            champiñon.setRadiusY(10.0f);
            champiñon.setStartAngle(-45.0f);
            champiñon.setLength(270.0f);
        champiñon.setFill(Color.DEEPPINK);
//        Rectangle cuerpoChampiñon = new Rectangle(145,155,10,10);
        champiñon.setScaleX(0.8);
        champiñon.setScaleY(0.8);
        gridTablero.add(champiñon,x,y);

    }
    
    
    public void cienpies(int x, int y){
        Group bicho = new Group();
            Circle cabezaCienpies = new Circle(50, 50, 10, Color.GREEN);
            Circle ojo1 = new Circle (49.5, 46, 2, Color.BROWN);
            Circle ojo2 = new Circle (49.5, 53, 2, Color.BROWN);
            bicho.getChildren().add(cabezaCienpies);
            bicho.getChildren().add(ojo1);
            bicho.getChildren().add(ojo2);
            gridTablero.add(bicho,x,y);      
    }
    
    public void cienpies2 (int x, int y){
        Circle cuerpoCienpies = new Circle (64, 50, 8, Color.GREEN);
        gridTablero.add(cuerpoCienpies,x,y);  
    }
    
    public void parteNave (int x, int y){
        Polygon nave = new Polygon (new double[]{
            150.0, 155.0,
            140.0, 170.0,
            150.0, 170.0,
            150.0, 155.0,
            160.0, 170.0,
            150.0, 170.0,
            150.0, 175.0,
            140.0, 170.0,
            150.0, 170.0,
            150.0, 175.0,
            160.0, 170.0,
            150.0, 170.0,});
        nave.setFill(Color.LIGHTBLUE);
        gridTablero.add(nave,x,y);
    }
    
    public void disparo (int x, int y){
        Circle tiro = new Circle(0, 0, 10, Color.ORANGE);
        gridTablero.add(tiro,x,y);
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
            prueba.setFill(Color.BLACK);
            // Le damos color al borde
            prueba.setStroke(Color.BROWN);
            // Añadimos el tablero al panel 
            gridTablero.add(prueba, x, y);
        }
    }