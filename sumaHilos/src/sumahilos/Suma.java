package sumahilos;

public class Suma implements Runnable{

	@Override
	public void run(){
		for (int i = 1; i <= 5; i++) 
			System.out.println("hilo Suma: "+(Main.sumatorio++));
		
	}

}
