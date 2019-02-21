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
import javafx.scene.Scene;
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
        
        for(int y=0; y<1; y++) {
            for(int x=0; x<1; x++) {
                switch(centipede.matrizTablero[x][y]) {
//                    case '0':
//                        tableroView.rellenarCasilla(x, y);
//                        break;
                    case '5':
                        gridPane.ponerChampiñon(x, y, '5');
                        break;
                    
                }
            }            
        }  
        
        StackPane root = new StackPane();
        root.getChildren().add(gridPane.getGridTablero());
         
        Scene scene = new Scene(root, 1366, 768);
        
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
