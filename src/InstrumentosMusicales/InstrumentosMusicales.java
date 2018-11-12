/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstrumentosMusicales;

/**
 *
 * @author Mario Yair Calzadillas Ogaz 18550362
 */
abstract public class InstrumentosMusicales {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    abstract public void TocarInstrumento();
    
}
