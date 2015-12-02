/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Psp {

    public static void main(String[] args) {
        System.out.println("Elija una operación aritmetica:\n 1-Suma \n 2-Multiplicacion \n 3-División \n 4-potencia \n 5-Raiz cuadrada");
        Scanner tec= new Scanner(System.in);
        int opcion= tec.nextInt();
        float d1,d2;
      
        switch(opcion){
            case 1:
                System.out.println("Introduzca el primer valor a operar\t");
                d1=tec.nextFloat();
                System.out.println("Introduzca el segundo valor a operar\t");
                d2=tec.nextFloat();
                System.out.println("El resultado es: "+(d1+d2));
                break;
            case 2:
                System.out.println("Introduzca el primer valor a operar\t");
                d1=tec.nextFloat();
                System.out.println("Introduzca el segundo valor a operar\t");
                d2=tec.nextFloat();
                System.out.println("El resultado es: "+(d1*d2));
                break;
            case 3:
                System.out.println("Introduzca el primer valor a operar\t");
                d1=tec.nextFloat();
                System.out.println("Introduzca el segundo valor a operar\t");
                d2=tec.nextFloat();
                System.out.println("El resultado es: "+(d1/d2));
                break;                
            case 4:
                System.out.println("Introduzca el primer valor a operar\t");
                d1=tec.nextFloat();
                System.out.println("Introduzca el segundo valor a operar\t");
                d2=tec.nextFloat();
                System.out.println("El resultado es: "+ Math.pow(d1,d2));
                break;
            case 5:
                System.out.println("Introduzca el primer valor a operar\t");
                d1=tec.nextFloat();
                System.out.println("El resultado es: "+Math.sqrt(d1));
                break;
        }
    }
    
}
