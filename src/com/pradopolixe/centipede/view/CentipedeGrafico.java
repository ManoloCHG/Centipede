/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pradopolixe.centipede.view;

import com.pradopolixe.centipede.model.Centipede;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;




// Creación de la clase CentipedeGráfico
public class CentipedeGrafico {
    // Creación del objeto union
    Centipede union = new Centipede();
    // Creación del objeto gridTablero
    GridPane gridTablero = new GridPane();
    
    public GridPane getGridTablero() {
        return gridTablero;
    }
    
    
    
    // Método para la creacion del champiñon
    public void ponerChampiñon(int x, int y) {
        // Creación del champiñon con la clase Arc
        Arc champiñon = new Arc();
            champiñon.setCenterX(150.0f);
            champiñon.setCenterY(150.0f);
            champiñon.setRadiusX(10.0f);
            champiñon.setRadiusY(10.0f);
            champiñon.setStartAngle(-45.0f);
            champiñon.setLength(270.0f);
        // Paso para pintar el champiñon de color rosa oscuro
        champiñon.setFill(Color.DEEPPINK);
        // Pasos para escalar el champiñon
        champiñon.setScaleX(0.8);
        champiñon.setScaleY(0.8);
        // Llamamos al champiñon y lo añadimos al gridTablero
        gridTablero.add(champiñon,x,y);
    }
    
    // Método para la creacion de la cabeza del cienpies
    public void cienpies(int x, int y){
        // Creacion del grupo bicho(enemigo)
        Group bicho = new Group();
            //Pasos para la creación de la cabeza del cienpies
            Circle cabezaCienpies = new Circle(50, 50, 10, Color.GREEN);
            // Pasos para la creacion de los ojos en la cabeza del cienpies
            Circle ojo1 = new Circle (49.5, 46, 2, Color.BROWN);
            Circle ojo2 = new Circle (49.5, 53, 2, Color.BROWN);
            // Pasos para añadir la cabeza y los ojos al grupo 'bicho'
            bicho.getChildren().add(cabezaCienpies);
            bicho.getChildren().add(ojo1);
            bicho.getChildren().add(ojo2);
            // Llamamos a la cabeza del cienpies y lo añadimos al gridTablero
            gridTablero.add(bicho,x,y);      
    }
    
    // Método para la creación del cuerpo del cienpies
    public void cienpies2 (int x, int y){
        // Creación del cuerpo del cienpies con un circulo
        Circle cuerpoCienpies = new Circle (64, 50, 8, Color.GREEN);
        // Llamamos al cuerpo del cienpies y lo añadimos al gridTablero
        gridTablero.add(cuerpoCienpies,x,y);  
    }
    
    // Método para la creación de la nave
    public void nave (int x, int y){
        // Creamos la nave con la clase Polygon
        Polygon nave = new Polygon (new double[]{
            150.0, 155.0,      // Puntos iniciales y finales para la creacion de la nave //
            140.0, 170.0,   
            150.0, 170.0,
            150.0, 155.0,
            160.0, 170.0,
            150.0, 170.0,
            150.0, 175.0,
            140.0, 170.0,
            150.0, 170.0,
            150.0, 175.0,
            160.0, 170.0,
            150.0, 170.0,});  // Puntos iniciales y finales para la creacion de la nave //
        // Paso para pintar la nave de color azul claro
        nave.setFill(Color.LIGHTBLUE);
        // Llamamos a la nave y lo añadimos al gridTablero
        gridTablero.add(nave,x,y);
    }
    
    // Método para la creación del disparo
    public void disparo (int x, int y){
        // Paso para crear el tiro con la clase Circle
        Circle tiro = new Circle(0, 0, 10, Color.ORANGE);
        // Llamamos al disparo y lo añadimos al gridTablero
        gridTablero.add(tiro,x,y);
    }
    
    // Método para la creación de mostrar el tablero
    public void mostrarTablero(){
        // Bucle para hacer la rejilla con sus correspondientes divisiones tanto en el eje X como en el Y
        for(int y=0; y<33; y++){
            for(int x=0; x<33; x++){
                dibujarTablero(x,y);
            }
        }
    }
    
    // Método para la creación del tablero
    public void dibujarTablero(int x, int y) {
        Rectangle rejilla = new Rectangle(0, 0, 20, 20);
        // Paso para dar color al fondo
        rejilla.setFill(Color.BLACK);
        // Paso para dar color al borde
        rejilla.setStroke(Color.BROWN);
        // Añadimos la rejilla al gridTablero 
        gridTablero.add(rejilla, x, y);
    }
}