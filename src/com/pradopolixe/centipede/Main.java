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
import javafx.stage.Stage;

/**
 *
 * @author javier
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        CentipedeGrafico gridPane = new CentipedeGrafico();
        Centipede centipede = new Centipede();
        System.out.println("");
        centipede.mostrarTablero();
        
        
        
        
        // Contenedor para alinear el tablero en centro horizontalmente
        HBox hBox = new HBox(gridPane.getGridTablero());
        hBox.setAlignment(Pos.CENTER);
        

        StackPane root = new StackPane();
        root.getChildren().add(gridPane.getGridTablero());
        centipede.mostrarTablero();
        
//        CentipedeGrafico.ponerChampiñon();
        
        
         
        Scene scene = new Scene(root, 700, 700);
        
        primaryStage.setTitle("Centipede");
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
