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
public class borde extends condimntoFigura{
    
    public borde(figura condimentoFigura) {
        super(condimentoFigura);
    }
    
    public String borde(){
    return super.dibujar().concat("rojo");
    }
    
}
