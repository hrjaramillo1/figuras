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
public abstract class condimntoFigura extends figura{
    
    protected figura condimentoFigura;

    public condimntoFigura(figura condimentoFigura) {
        this.condimentoFigura = condimentoFigura;
    }
    
    @Override
    public String dibujar(){
    
        return condimentoFigura.dibujar();
    }
}
