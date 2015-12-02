/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;
/**
 *
 * @author oscar
 */
public class TiraAlfanum {
    protected static String[] tiras = new String [3];
    
    protected static void separar(String tira){
        
        TiraAlfanum.tiras[0]="";
        TiraAlfanum.tiras[1]="";
        for(int i=0; i<tira.length();i++){
            if(tira.charAt(i)>=64 && tira.charAt(i)<=122 )
                TiraAlfanum.tiras[0]+=tira.charAt(i);
            else
                TiraAlfanum.tiras[1]+=tira.charAt(i);
        }
    }
    
    protected static String[] sumar(){
        int suma=0;
        for(int i=0; i<TiraAlfanum.tiras[1].length();i++)
            suma+=Integer.parseInt(Character.toString(TiraAlfanum.tiras[1].charAt(i)));
        TiraAlfanum.tiras[2]=Integer.toString(suma);
        return TiraAlfanum.tiras;
    }
}
