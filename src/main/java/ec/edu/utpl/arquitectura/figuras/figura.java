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
public abstract class figura {
   
    private String descricion;
   
    public abstract String dibujar();

    public figura() {
    }

    public figura(String descricion) {
        this.descricion = descricion;
    }

    public String getDescricion() {
        return descricion;
    }

   
    
}
