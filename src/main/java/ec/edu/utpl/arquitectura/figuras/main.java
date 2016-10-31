/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.arquitectura.figuras;

/**
 *
 * @author Rafael
 */
public class main {
 
    
    public static void main(String[] args) {
        figura cuadrado = new cuadrado();
        
        figura cuadradoBorde = new borde(cuadrado);
        
        figura cuadradoBordeFondo = new fondo(cuadradoBorde);
        
        
        System.out.println(cuadradoBordeFondo.dibujar());
    }
}
