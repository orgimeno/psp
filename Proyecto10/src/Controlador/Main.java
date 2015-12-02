/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugador;
import Vista.Tablero;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author Oscar
 */
public class Main extends JFrame{
   /**
    * @see Jugador, Tablero
    * @param args 
    */
    public static void main(String[] args) {
        Juego juego = new Juego();
        int opt;                 
        do {
            System.out.println("Binevenido al Test\n"
                    + "1. Añadir pregunta\n"
                    + "2. Jugar\n"
                    + "3. Mostar Máximas Puntuaciones\n"
                    + "4. Salir");
            opt = new Scanner(System.in).nextInt();
            switch (opt) {

                case 1:
                    juego.generarPreguntas();
                    juego.guardarPreguntas();
                    juego.mostrarPreguntas();
                    break;
                case 2:
                    Tablero tablero = new Tablero();
                    System.out.println("Introduzca nombre del jugador");
                    Jugador j = new Jugador(new Scanner(System.in).nextLine());
                    do {
                        tablero.recorrerTablero();
                        tablero.mostrarTablero();
                        String p = juego.buscarPregunta(tablero.categoriaActual());
                        juego.comprobarRespuesta(new Scanner(System.in).nextLine(), j, p);
                    } while (tablero.categoriaActual() != 'W');
                    juego.incorporarJugador(j);
                    juego.ordenarJugadores();
                    break;
                case 3:
                    juego.mostrarJugadores();break;
                default: 
                    System.out.println("Gracias por jugar al Test\n"
                            + "Recuerde: elija una opción de la existentes, presione un numero entre 1 y 4");
            }
        } while (opt != 4);
    }
}