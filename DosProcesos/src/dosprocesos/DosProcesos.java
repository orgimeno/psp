/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosprocesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/**
 *
 * @author Óscar Rodríguez Gimeno
 */
public class DosProcesos {
    
    public static void main(String args[]) throws IOException {
        
        //Primer Proceso
        Process process = new ProcessBuilder("ls", "-l").start();
        
        InputStream is = process.getInputStream();

        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(isr);
        //Segundo Proceso
        Process process2 = new ProcessBuilder("tr", "d", "D").start();
        OutputStream opt= process2.getOutputStream();
        
        
        PrintStream ps = new PrintStream(opt);
        
        
        String line;

        System.out.println("Salida del proceso " + Arrays.toString(args) + ":");

        while ((line = br.readLine()) != null) {
            ps.println(line);
            
        }
        //Vacío y cierro el printStream:
        ps.flush();
        ps.close();
        //Creo el bufer con la salida del segundo proceso
        BufferedReader bfr2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
        String line2;
        while ((line2 = bfr2.readLine()) != null){
            System.out.println(line2);
        }
    }
}