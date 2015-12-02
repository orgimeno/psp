/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp;

/**
 *
 * @author Oscar
 */
public class Alumno {
    protected String nombre, apellido, dni;
    protected float media;
    
    protected void setNombre(String n){
        this.nombre=n;
    }
    
    protected String getNombre(){
        return nombre;
    }
    
    protected void setApellido(String a){
        this.apellido=a;
    }
    
    protected String getApellido(){
        return apellido;
    }
    
    protected void setDni(String d){
        this.dni=d;
    }
    
    protected String getDni(){
        return dni;
    }
    
    
    protected void setMedia(float m){
        this.media=m;
    }
    
    protected float getMedia(){
        return media;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(dni);
        sb.append(apellido);
        sb.append(nombre);
        sb.append(media);
        return sb.toString();
    }
    
}
