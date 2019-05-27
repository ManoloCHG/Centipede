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
        CentipedeGrafico centipede = new CentipedeGrafico();
        // Creación del metodo 'union' para llamar a los metodos de las clases de mi compañero
        Centipede union = new Centipede();

        
        // Mostrar los diferentes metodos necesarios
//        centipede.getGridTablero();
        System.out.println("");
        centipede.mostrarTablero();
//        centipede.ponerChampiñon(7,10);
        centipede.cienpies(union.xEnemigo,union.yEnemigo);
        centipede.cienpies2(union.xEnemigo + 1,union.yEnemigo);
        centipede.nave(union.xNave,union.yNave);
        centipede.disparo(union.xDisparo,union.yDisparo);
//  
//        
        // Bucle para unir mis elementos con mi compañero en el tablero
        for(int y=0; y<33; y++) {
            for(int x=0; x<33; x++) {
                switch(union.matrizTablero[x][y]) {
                    // Caso 2: union del tablero con el cienpies
                    case '2':
                        centipede.cienpies(x,y);
                    break;
                    // Caso 3: union del tablero con la nave
                    case '3':
                        centipede.nave(x,y);
                    break;
                    // Caso 4: union del tablero con el disparo
                    case '4':
                        centipede.disparo(x, y);
//                    break;
                    // Caso 5: union del tablero con los champiñones
                    case '5':
                        centipede.ponerChampiñon(x,y);
                    break;
                }
            }            
        }
        AnimationTimer prueba = new AnimationTimer(){
            @Override
            public void handle(long now) {
           for(int y=0; y<33; y++) {
            for(int x=0; x<33; x++) {
            if (union.matrizTablero[x][y]=='2'){
                union.moverEnemigo();
                centipede.cienpies(x,y);
                        }
                    }
                }
            }
        };

        StackPane root = new StackPane();
        root.getChildren().add(centipede.getGridTablero());
//        centipede.mostrarTablero();
//        
//        CentipedeGrafico.ponerChampiñon();
        
        
        // Creación del metodo escena para que aparezca en pantalla el juego
        Scene scene = new Scene(root, 660, 660);
        
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