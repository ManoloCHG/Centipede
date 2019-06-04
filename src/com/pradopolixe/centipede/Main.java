/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede;

import com.pradopolixe.centipede.view.CentipedeGrafico;
import com.pradopolixe.centipede.model.Centipede;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 *
 * @author josemanuel
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        

        // Creación del metodo 'centipede' para llamar a los metodos de otra clase
        CentipedeGrafico centipedeGrafico = new CentipedeGrafico();
        // Creación del metodo 'union' para llamar a los metodos de las clases de mi compañero
        Centipede centipede = new Centipede();

        
        // Mostrar los diferentes metodos necesarios
//        centipede.getGridTablero();
        System.out.println("");
        centipedeGrafico.mostrarTablero();
//        centipede.ponerChampiñon(7,10);
        centipedeGrafico.cienpies(centipede.xEnemigo,centipede.yEnemigo);
        centipedeGrafico.nave(centipede.xNave,centipede.yNave);
        centipedeGrafico.disparo(centipede.xDisparo,centipede.yDisparo);
//  
//        
        // Bucle para unir mis elementos con mi compañero en el tablero
        for(int y=0; y<33; y++) {
            for(int x=0; x<33; x++) {
                switch(centipede.matrizTablero[x][y]) {
                    // Caso 2: union del tablero con el cienpies
                    case '2':
                        centipedeGrafico.cienpies(x,y);
                    break;
                    // Caso 3: union del tablero con la nave
                    case '3':
                        centipedeGrafico.nave(x,y);
                    break;
                    // Caso 4: union del tablero con el disparo
                    case '4':
                        centipedeGrafico.disparo(x, y);
//                    break;
                    // Caso 5: union del tablero con los champiñones
                    case '5':
                        centipedeGrafico.ponerChampiñon(x,y);
                    break;
                }
            }            
        }


        StackPane root = new StackPane();
        root.getChildren().add(centipedeGrafico.getGridTablero());
        

        // Creación del metodo escena para que aparezca en pantalla el juego
        Scene scene = new Scene(root, 660, 660);
        
        AnimationTimer prueba = new AnimationTimer(){
            @Override
            public void handle(long now) {
                for(int y=0; y<33; y++) {
                    for(int x=0; x<33; x++) {
                        if (centipede.matrizTablero[x][y]=='2'){
                        centipede.moverEnemigo();
                        centipedeGrafico.cienpies(x,y);
                        }   
                    }
                }
            }
        };
        
        prueba.start();
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()){
                case LEFT:
                    System.out.println("LEFT");
                    centipede.moverNave(3);
                    centipedeGrafico.nave(centipede.xNave,centipede.yNave);
                    break;
                case RIGHT:
                    centipede.moverNave(4);
                    break;
                case UP:
                    centipede.moverNave(1);
                    break;
                case DOWN:
                    centipede.moverNave(2);
                    break;

            }
        });
        scene.setOnKeyReleased((KeyEvent event) -> {
            centipede.xNave = 0;
            centipede.yNave = 0;
        });
        
        
        
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