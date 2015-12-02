package Controlador;
import Modelo.Pregunta;
import Modelo.Jugador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Oscar
 */
public class Juego{
    private final ArrayList<Pregunta> listaPreguntas= new ArrayList();
    private final ArrayList<Jugador> listaJugadores= new ArrayList();
    public Juego() {
        cargarPreguntas();
        cargarJugadores();
    }
    /**
     * Solo operaciones con Preguntas
     */
    public void generarPreguntas() {
        System.out.println("Introduza la categoria de la pregunta \n"+ "A: Arte y Literatura \t" 
                + "B: Geografia\n" + "C: Historia\t" + "D: Ciencia\n" + "E: Filosofia\t" + "F: Deportes");
        char c = new Scanner(System.in).next().toUpperCase().charAt(0);          
        System.out.println("Introduzca la pregunta");
        String p = new Scanner(System.in).nextLine();
        System.out.println("Introduzca la respuesta");
        String r = new Scanner(System.in).nextLine();
     
        listaPreguntas.add(new Pregunta(p, r, c));
    }
    public void guardarPreguntas() {
        try {
            FileOutputStream fs = new FileOutputStream("Preguntas.obj");
            ObjectOutputStream oss = new ObjectOutputStream(fs);
            for (int i = 0; i < listaPreguntas.size(); i++) {
                oss.writeObject(listaPreguntas.get(i));
            }
        } catch (IOException e) {
        }
    }
    private void cargarPreguntas() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Preguntas.obj"));
            Pregunta a = (Pregunta) ois.readObject();
            while (a != null) {
                listaPreguntas.add(a);
                a = (Pregunta) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException eof) {
        }
    }
    /**
     * 
     * @param categoria
     * @return 
     */
    public String buscarPregunta(char categoria){
        ArrayList <Pregunta>lista = new ArrayList();
        for(int i=0; i< listaPreguntas.size();i++)
            if(listaPreguntas.get(i).getCategoria()==categoria)
                lista.add(listaPreguntas.get(i));
            System.out.println(lista.get(0).getPregunta());
    return lista.get(0).getPregunta();
    }
    public void mostrarPreguntas() {
        for(int i =0; i<listaPreguntas.size();i++)
            listaPreguntas.get(i).print();
    }
/**
 * 
 * @param resp
 * @param j
 * @param prg
 * @return 
 */
    public boolean comprobarRespuesta(String resp, Jugador j, String prg) {
        for (int i = 0; i < listaPreguntas.size(); i++) {
            if (listaPreguntas.get(i).getRespuesta().equalsIgnoreCase(resp) && listaPreguntas.get(i).getPregunta().equalsIgnoreCase(prg)) {
                j.setPuntos();
                return true;
            }
        }
        return false;
    }
    /**
     * @see Jugador
     * Solo operaciones con Jugadores a partir de aqui
     */
    private void cargarJugadores() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Maxima Puntuacion.obj"));
            Jugador a = (Jugador) ois.readObject();
            while (a != null) {
                listaJugadores.add(a);
                a = (Jugador) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException eof) {
        }
    }
    public void guardarJugadores() {
        try {
            FileOutputStream fs = new FileOutputStream("Maxima Puntuacion.obj");
            ObjectOutputStream oss = new ObjectOutputStream(fs);
            for (int i = 0; i < listaJugadores.size(); i++) {
                oss.writeObject(listaJugadores.get(i));
            }
        } catch (IOException e) {
        }
    }
    public void ordenarJugadores(){
        Jugador aux;
        for(int i =0; i<listaJugadores.size()-1; i++)
            for(int j=0; j<listaJugadores.size()-i-1;j++)
                if(listaJugadores.get(j+1).getPuntos()>listaJugadores.get(j).getPuntos()){
                    aux=listaJugadores.get(j);
                    listaJugadores.set(j, listaJugadores.get(j+1));
                    listaJugadores.set(j+1, aux);
                }
        guardarJugadores();
    }
/**
 * @see Jugador
 * @param j 
 */
    public void incorporarJugador(Jugador j){
        listaJugadores.add(j);
    }
    public void mostrarJugadores(){
        for(int i =0; i<listaJugadores.size(); i++){
            System.out.println("Jugador: " + listaJugadores.get(i).getNombre() + " Puntuación: " + listaJugadores.get(i).getPuntos());
        }        
    }
}