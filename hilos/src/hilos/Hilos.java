/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author oscar
 */
public class Hilos extends Thread {
    Thread t;
    int contador;
    Hilos(int i){
        System.out.println("soy i"+i);
        t=new Thread(this, "nuevo thread");
        this.contador=i;
    }
       
    public void run(){
        System.out.println("Hola desde el hilo creado!"+contador);
        
    }
}
    /**
     * @param args the command line arguments
     */
class RunThread{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            new Hilos(i).start();
            System.out.println("Hola desde el hilo principal número: "+i);
            System.out.println("Proceso acabando: "+i);
        }
    }
    
}
