/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;
import java.awt.Graphics;
import java.util.*;
/**
 *
 * @author oscar
 */
public class Practica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tiras= new String[2];
        System.out.println("Introduza una tira");
        TiraAlfanum t = new TiraAlfanum();
        Scanner tec = new Scanner(System.in);
        t.separar(tec.next());
        tiras=t.sumar();
        /*Graphics g = null;
        int width = g.getFontMetrics().stringWidth(tiras[0]);*/
        for(String i: tiras){   
            System.out.println("\t"+i);
        }
        //System.out.println("ancho: "+width);
    }
    
}