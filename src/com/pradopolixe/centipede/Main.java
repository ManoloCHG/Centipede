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
        Centipede union = new Centipede();

        
//        centipede.getGridTablero();
//        System.out.println("");
        centipede.mostrarTablero();
//        centipede.ponerChampiñon(20,20);
        centipede.cienpies(15,5);
//        centipede.cienpies2(16,5);
////        centipede.patas(16,5);
//        centipede.parteNave(18,31);
//        centipede.disparo(18,30);
//        
//        union.ponerObstaculos();
//        
        
        for(int y=0; y<33; y++) {
            for(int x=0; x<33; x++) {
                switch(union.matrizTablero[x][y]) {
//                    case '2':
//                        centipede.cienpies(x,y);
//                    break;
//                    case '3':
//                        centipede.parteNave(x, y);
//                    break;
//                    case '4':
//                        centipede.disparo(x, y);
//                    break;
                    case '5':
                        centipede.ponerChampiñon(x,y);
                    break;
                }
            }            
        }
    prueba = new AnimationTimer(){
        
    }
        
        
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