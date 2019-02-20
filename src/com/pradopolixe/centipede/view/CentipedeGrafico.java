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
import javafx.scene.shape.Rectangle;

/**
 *
 * @author josemanuel
 */
public class CentipedeGrafico {
    
    GridPane prueba = new GridPane();
    
//    public GridPane prueba(){
//        return prueba;
//    }
    
    public void celdas(){
        prueba.setMinSize(400, 200);    
    }
    
    public void champiñon(int x, int y, char seta){
        
        if(seta == '1'){
            Arc cabeza = new Arc(150.0f, 150.0f, 10.0f, 10.0f, -45.0f, 270.0f);
            cabeza.setFill(Color.AQUAMARINE);
//            CentipedeGrafico.add(cabeza,x,y);
     
            Rectangle ave = new Rectangle(x, y, Color.DARKSEAGREEN);
        }

            
            Rectangle ave = new Rectangle(x, y, Color.DARKSEAGREEN);
            
        Group cabezal = new Group();
            cabezal.getChildren().add(ave);
            cabezal.getChildren().add();

    }
    
}

        
