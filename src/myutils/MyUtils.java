/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Lluis Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        if(!cadena.equals(resultat)){
            for (int i = cadena.length()-1; i >=0; i--) {
                resultat=resultat + cadena.charAt(i);
            }
        }else{
            resultat="null";
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;
        int año = Calendar.getInstance().get(Calendar.YEAR)-year;
        int mes = Calendar.getInstance().get(Calendar.MONTH)-month+1;
        int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)-day;
        
        if(año<0){
            resultat=-2;
        }else if(año>150){
            resultat=-1;
        }else{
            if(mes<0){
                resultat=año-1;
            }else if(mes>0){
                resultat=año;
            }else{
                if(dia<0){
                    resultat=año-1;
                }else{
                    resultat=año;
                }
            }
        }

        System.out.print(año+", ");
        System.out.print(mes+", ");
        System.out.print(dia+"  --  ");
        
        System.out.println(resultat);
        
        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(int numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
        }
        
}

