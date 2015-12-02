package sumahilos;

public class Main {
	
	public static int sumatorio=0;
	
	public static void main(String[] args) throws InterruptedException {		
		//Creo los hilos de las clases
		Thread hiloSuma = new Thread(new Suma());
		Thread hiloPrint = new Thread(new Printer());
		
		//Establezco la prioridad de cada hilo para establecer el orden de ejecución
		hiloSuma.setPriority(Thread.NORM_PRIORITY + 1);
		hiloPrint.setPriority(Thread.NORM_PRIORITY);

		//Lanzo los hilos una vez establecidas las prioridades
		hiloSuma.start();
		hiloPrint.start();
	}
}
