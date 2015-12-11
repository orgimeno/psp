/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relevo;

/**
 *
 * @author oscar
 */
public class Relevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Testigo testigo = new Testigo();
        
        Corredor corredores[] = new Corredor(4);
        for(int i=0; i<4;i++){
            corredores[]=new Corredor(i+1,testigo);
            corredores[i].start();
        }
        System.out.println("Todos los hilos creados");
        
        testigo.next(1);
        System.out.println("Doy la salida!!");
        
        try{
            for(int i=0; i<4;i++)
                corredores[i].join();
            
        }catch(InterruptedException ex){
            System.out.println("Hilo principal interrumpido");
        }
        System.out.println("Todos los hilos terminados");
    }
    
}

class Testigo{
    private int siguiente;
    
    Testigo(){
        this.siguiente=0;
    }
    
    synchronized public void next(int id){
        this.siguiente=id;
        notifyAll();
    }
    
    synchronized public void check(int id) throws InterruptedException{
        while(siguiente != 0)
            wait();
    }
}

class Corredor extends Thread{
    private static final int MAX_DELAY = 1000;
    private int id;
    private Testigo testigo;
    
    Corredor(int id, Testigo t){
        this.id=id;
        this.testigo=t;
    }
    
    public void run(){
        try{
            testigo.check(id);
            System.out.println("Soy el thread "+id+ "corriendo...");
            Thread.sleep(int)Math.random();
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
