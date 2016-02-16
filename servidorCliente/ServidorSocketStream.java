import java.io.IOException; 

import java.io.InputStream; 

import java.io.OutputStream; 

import java.net.InetSocketAddress; 

import java.net.Socket; 

import java.net.ServerSocket; 

public class ServidorSocketStream { 

	public static void main(String[] args) {

		try { 

			System.out.println("Creando socket servidor"); 

			ServerSocket serverSocket = new ServerSocket(); 

			System.out.println("Realizando el bind"); 

			InetSocketAddress addr = new InetSocketAddress ("localhost", 5555); 

			serverSocket.bind(addr) ; 

			System .out.println("Aceptando conexiones "); 

			Socket newSocket = serverSocket.accept(); 

			System .out.println("Conexión recibida"); 

			InputStream is = newSocket.getInputStream(); 

			OutputStream os = newSocket .getOutputStream(); 

			byte[] mensaje = new byte[125]; 

			is.read(mensaje); 

			String preguntaCliente = new String(mensaje);

			for (int i=0;i<preguntaCliente.length();i++) {
				if (preguntaCliente.charAt(i)=='?')
					preguntaCliente=preguntaCliente.substring(0,i+1);
			}

			String respuesta = "No he entedido la pregunta";

			switch(preguntaCliente.toLowerCase()){
				case "¿cómo te llamas?":
						respuesta = "Soy el ejercicio 2";
					break;
				case "cómo te llamas?":
						respuesta = "Soy el ejercicio 2";
					break;
				case "como te llamas?":
						respuesta = "Soy el ejercicio 2";
					break;
				case "¿como te llamas?":
						respuesta = "Soy el ejercicio 2";
					break;

				case "¿cuántas líneas de código tienes?":
						respuesta = "10000";
					break;
				case "cuántas líneas de código tienes?":
						respuesta = "10000";
					break; 

				case "¿cuantas lineas de codigo tienes?":
						respuesta = "10000";
					break;
				case "cuantas lineas de codigo tienes?":
						respuesta = "10000";
					break; 
			}

			System.out.println("Mensaje recibido: "+ preguntaCliente);

			System.out.println(respuesta);  

			os.write(respuesta.getBytes());

			System.out.println("Cerrando el nuevo socket"); 

			newSocket.close(); 

			System.out.println("Cerrando el socket servidor"); 

			serverSocket.close();
			System.out.println("Terrninado") ; 

		}catch (IOException e) { 

			e.printStackTrace() ;
		}
	}
}