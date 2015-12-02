package sumahilos;

public class Printer implements Runnable{

	@Override
	public void run(){
		for (int i = 1; i <= 5; i++) 
			System.out.println("hilo print: "+Main.sumatorio);
	}
	
}
