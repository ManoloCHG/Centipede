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
    
    public void champiñon(){
            Arc arc = new Arc();
            arc.setCenterX(150.0f);
            arc.setCenterY(150.0f);
            arc.setRadiusX(10.0f);
            arc.setRadiusY(10.0f);
            arc.setStartAngle(-45.0f);
            arc.setLength(270.0f);
            
//        Group cabeza = new Group();
        Rectangle cabeza = new Rectangle();
        prueba.add(arc,150,150); 
        prueba.add(cabeza,250,80);
    }
    
}

        
