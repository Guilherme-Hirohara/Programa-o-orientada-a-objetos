/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package modelo.exceptions;

/**
 *
 * @author User
 */
public class NotExistsException extends Exception {

    /**
     * Creates a new instance of <code>NotExistsException</code> without detail
     * message.
     */
    public NotExistsException() {
    }

    /**
     * Constructs an instance of <code>NotExistsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotExistsException(String msg) {
        super(msg);
    }
}
