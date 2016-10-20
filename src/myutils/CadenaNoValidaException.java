package myutils;



/**
 *
 * @author ALUMNEDAM
 */
public class CadenaNoValidaException extends Exception {
    public CadenaNoValidaException (){
        super(" La temperatura no puede se menor que -273 o C ");
    }
    
}
