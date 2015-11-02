/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author xuser
 */
public class Mayusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec =new Scanner(System.in);
        String palabra;
        System.out.println("Convertidor de mayúsculas");
 
        while((palabra=tec.next()).compareTo("fin")!=0)
            System.out.println(palabra.toUpperCase());
    }
    
}
