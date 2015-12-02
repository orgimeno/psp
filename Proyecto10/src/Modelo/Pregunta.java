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
public class Pregunta implements Serializable {

    private String pregunta;
    private String respuesta;
    private char categoria;
/**
 * 
 * @param pregunta
 * @param respuesta
 * @param categoria 
 */
    public Pregunta(String pregunta, String respuesta, char categoria) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.categoria = categoria;
    }
/**
 * 
 * @return 
 */
    public char getCategoria() {
        return categoria;
    }
/**
 * 
 * @return 
 */
    public String getPregunta() {
        return pregunta;
    }
/**
 * 
 * @return 
 */
    public String getRespuesta() {
        return respuesta;
    }
   public void print(){
        System.out.println("Categoria: " + categoria + "\n " +pregunta + " Respuesta-> " +respuesta);
    }    
}
