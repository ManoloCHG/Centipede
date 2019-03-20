/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede.view;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class CentipedeGrafico {
    
    GridPane gridTablero = new GridPane();
    
    public GridPane getGridTablero() {
        return gridTablero;
    }
    
    public void ponerChampiñon(int x, int y) {
        Rectangle casilla = new Rectangle (0, 0, 100, 100);
        casilla.setFill(Color.BEIGE);
        casilla.setStroke(Color.BROWN);
        gridTablero.add(casilla,1,0);
    }
    
    public void mostrarTablero(){
        for(int y=0; y<7; y++){
            for(int x=0; x<7; x++){
                dibujarTablero(x,y);
            }
        }
    }

    private void dibujarTablero(int x, int y) {
        
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