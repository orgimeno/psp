/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author oscar
 */
public class Semaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem= new Semaphore(1);
        Thread hilo = new Thread(new Consulta(sem));
        hilo.start();
    }
    
}
