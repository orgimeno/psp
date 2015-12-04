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
    String paciente="";

    public Consulta(Semaphore semaforo, String pacient) {
        this.semaphore= semaforo;
        this.paciente=pacient;
    }
    
    @Override
	public void run(){
            
                try{
                    System.out.println("Hay "+semaphore.availablePermits()+ " sitios libres");
                    System.out.println("Entra en el vestuario el "+paciente);
                    semaphore.acquire();
                    System.out.println("Quedan "+semaphore.availablePermits()+ " sitios libres");
                    
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                System.out.println(paciente+" se está cambiando");
                semaphore.release();
                System.out.println("Quedan "+semaphore.availablePermits()+ " sitios libres, después de acabar el "+paciente);
            
    }
    
}
