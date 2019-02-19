/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede.view;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author josemanuel
 */
public class CentipedeGrafico {
    
    GridPane prueba = new GridPane();
    
    public GridPane prueba(){
        return prueba;
    }
    
    public void champiñon(int x, int y){

            
        Group cabeza = new Group();
            Rectangle cabeza = new Rectangle(10,10,5,5);
            Arc arc = new Arc();
            arc.setCenterX(150.0f);
            arc.setCenterY(150.0f);
            arc.setRadiusX(10.0f);
            arc.setRadiusY(10.0f);
            arc.setStartAngle(-45.0f);
            arc.setLength(270.0f);
//        prueba.add(arc,x,y); 
//        prueba.add(cabeza,x,y);
    }
    
}

        
