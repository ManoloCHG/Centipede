/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede;

import com.pradopolixe.centipede.view.CentipedeGrafico;
import com.pradopolixe.centipede.model.Centipede;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author josemanuel
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        CentipedeGrafico centipede = new CentipedeGrafico();

        
        centipede.getGridTablero();
        System.out.println("");
        centipede.mostrarTablero();
        centipede.ponerChampiñon(10,5);
        
        
        
        
        // Contenedor para alinear el tablero en centro horizontalmente
//        HBox hBox = new HBox(centipede.getGridTablero());
//        hBox.setAlignment(Pos.CENTER);
        

        StackPane root = new StackPane();
        root.getChildren().add(centipede.getGridTablero());
//        centipede.mostrarTablero();
        
//        CentipedeGrafico.ponerChampiñon();
        
        
         
        Scene scene = new Scene(root, 693, 693);
        
        primaryStage.setTitle("Centipede");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CentipedeGrafico.ponerChampiñon();
        launch(args);
    }
    
}

//        Arc arc = new Arc();
//            arc.setCenterX(150.0f);
//            arc.setCenterY(150.0f);
//            arc.setRadiusX(10.0f);
//            arc.setRadiusY(10.0f);
//            arc.setStartAngle(-45.0f);
//            arc.setLength(270.0f);
//            
//        Rectangle prueba = new Rectangle(145,155,10,10);