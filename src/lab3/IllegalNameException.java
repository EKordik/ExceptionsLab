/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author emmakordik
 */
public class IllegalNameException extends IllegalArgumentException {
    private final static String MESSAGE = "Improperly Formatted Name";
    
    /**
     * Constructor that sends custom message to getMessage() and accepts a String message
     * @param message 
     */
    public IllegalNameException(String message){
        super(MESSAGE);
    }
    
    /**
     * Constructor that sends custom message to getMessage()
     */
    public IllegalNameException(){
        super(MESSAGE);
    }
}
