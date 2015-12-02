/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;

/**
 *
 * @author Oscar
 */
public class Jugador implements Serializable{
    private String nombre;
    private int puntos;
    /**
     * 
     * @param nombre 
     */
    public Jugador(String nombre){
        puntos=0;
        this.nombre=nombre;
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return 
     */
    
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(){
        puntos++;
    }
}
