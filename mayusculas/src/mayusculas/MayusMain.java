/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author xuser
 */
public class MayusMain {
    public static void main(String[] args) throws IOException {
        Process pb= new ProcessBuilder("java","Mayusculas","build/classes/mayusculas").start();
        InputStream is = pb.getInputStream();
        InputStreamReader isr= new InputStreamReader(is);
        BufferedReader bsr = new BufferedReader(isr);
        String linea;

        while((linea=bsr.readLine())!=null)
            System.out.println(linea);
        
    }
    
}
