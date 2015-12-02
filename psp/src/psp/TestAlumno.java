/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp;

import java.util.*;
public class TestAlumno {
    static Scanner tec= new Scanner(System.in);
    static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    
    private static void leerAlumno(){
        String nombre, apellido, dni;
        float media;
        Alumno aux;
        System.out.println("Cuantos alumnos vas a introducir");
        int n=tec.nextInt();
        for(int i=0; i<n;i++){
            System.out.println("Alumno " + (i+1));
            System.out.println("Introduzca Nombre");
            nombre=tec.next();
            System.out.println("Introduzca el apellido");
            apellido=tec.next();
            System.out.println("Introduzca DNI");
            dni=tec.next();
            System.out.println("introduzca la media");
            media=tec.nextFloat();
            aux = new Alumno();
            aux.setNombre(nombre);
            aux.setApellido(apellido);
            aux.setDni(dni);
            aux.setMedia(media);
            alumnos.add(aux);
        }
    }
    
    private static void mostrarAlumnos(){
        for(int i=0; i<alumnos.size();i++){
            System.out.println(alumnos.get(i));
        }
        
    }
    
    
    public static void main(String[] args) {
        leerAlumno();
        mostrarAlumnos();
    }
    
}

