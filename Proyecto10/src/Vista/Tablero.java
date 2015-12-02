/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author Oscar
 */
import java.util.Random;
public class Tablero {
    char [][] tabla = new char [2][2];
    int [] posicion=new int[2];
    
    public Tablero(){
        crearTablero();
    }
    /**
     * El tablero se rellena automáticamente com caracteres de la tabla asci entre 
     */
  private void crearTablero(){
       
       Random r= new Random();
       for(int i=0; i<tabla.length; i++){
           for(int j=0; j<tabla[i].length;j++)
               tabla[i][j]= (char)(r.nextInt((69 - 65) + 1) + 65);
       }
       tabla[0][0]='X';tabla[tabla.length-1][tabla[0].length-1]='W';
   }
   
   public void mostrarTablero(){

       for(int i=0; i<tabla.length;i++){
           for(int j=0; j<tabla[i].length; j++)
               System.out.print(" |"+tabla[i][j]+"| ");
            System.out.println();
           }
       System.out.println();
   }
   
   public void recorrerTablero(){
       tabla[posicion[0]][posicion[1]]=(char)33;
       posicion[1]++;
       if(posicion[1]==tabla[0].length){
           posicion[0]++;
           posicion[1]=0;
       } 
   }
   /**
    * 
    * @return 
    */
   public char categoriaActual(){
       return tabla[posicion[0]][posicion[1]];
   }
   /**
    * 
    * @return 
    */
    public char[][] getTabla() {
        return tabla;
    }
    /**
     * 
     * @return 
     */
    public int[] getPosicion() {
        return posicion;
    }   
}