import java.io.IOException;

import java.io.InputStream; 

import java.io.OutputStream; 

import java.net.InetSocketAddress; 

import java.net.Socket;
import java.util.*; 

public class ClienteSocketStream{

	public static void main(String[] args) {


		try { 

			System.out.println("Creando objeto de clase escaner"); 

			Scanner tec = new Scanner(System.in);

			System.out.println("Creando socket cliente"); 

			Socket clientSocket = new Socket(); 

			System.out.println("Estableciendo la conexión"); 

			InetSocketAddress addr = new InetSocketAddress("localhost", 5555); 

			clientSocket.connect(addr) ; 

			InputStream is = clientSocket.getInputStream(); 

			OutputStream os = clientSocket.getOutputStream(); 

			System.out.println("Escribir mensaje"); 

			String mensaje = tec.nextLine(); 

			os.write(mensaje.getBytes()); 

			System.out.println("Mensaje enviado"); 

			byte[] mensajeRecibido = new byte[125]; 

			is.read(mensajeRecibido);

			System.out.println("Respuesta: " + new String(mensajeRecibido)); 

			System.out.println("Cerrando el socket cliente"); 

			clientSocket.close() ; 

			System.out.println("Terminado"); 

		}catch (IOException e){ 

			e.printStackTrace() ;
		}
	}
}