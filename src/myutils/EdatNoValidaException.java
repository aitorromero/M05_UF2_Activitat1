package myutils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNEDAM
 */
public class EdatNoValidaException extends Exception {
    
    public EdatNoValidaException (){
        super(" La edat no pot ser mes gran de 150 anys o no haber nascut encara ");
    }
}
