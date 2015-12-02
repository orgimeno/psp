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
public class Consulta extends Thread{
    Semaphore semaphore;

    public Consulta(Semaphore semaforo) {
        this.semaphore= semaforo;
    }
    
    @Override
	public void run(){
        System.out.println("que es esta");
    }
    
}
