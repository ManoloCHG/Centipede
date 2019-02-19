/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede;

import com.pradopolixe.centipede.view.CentipedeGrafico;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author PC04
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
   
        CentipedeGrafico prueba = new CentipedeGrafico();
        prueba.champiñon();
        
        StackPane root = new StackPane();
        root.getChildren().add(prueba.prueba());
         
        Scene scene = new Scene(root, 1366, 760);
        
        primaryStage.setTitle("Tres en raya");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
