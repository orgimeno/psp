/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
1.
Escribe una clase llamada Ejecuta que reciba como argumentos el comando
y las opciones del comando que se quiere ejecutar. El programa debe crear un
proceso hijo que ejecute el comando con las opciones
correspondientes mostrando un mensaje de error
en el caso de que no se realizase correctamente la
ejecución. El padre debe esperar a que el hijo termine de informar si se produjo
alguna anomalía en la ejecución del hijo.
*/
package proceso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.*;
/**
 *
 * @author oscar
 */
public class Proceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        			
        Process process = new ProcessBuilder("ls", "-l").start();

        InputStream is = process.getInputStream();

        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(isr);

        String line;

        System.out.println("Salida del proceso " + Arrays.toString(args) + ":");

        while ((line = br.readLine()) != null) {
            
            System.out.println("");

            Process process2 = new ProcessBuilder("tr", "d", "D").start();
            OutputStream stdin = process2.getOutputStream ();
            PrintStream ps = new PrintStream(stdin);
            ps.println();

        }

    }
}
 
