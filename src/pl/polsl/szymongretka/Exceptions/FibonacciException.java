package pl.polsl.szymongretka.Exceptions;

/**
 * Exception class that is generated when user tries to put negative number.
 *
 * @author Szymon Gretka
 * @version 1.0
 */
public class FibonacciException extends Exception{
    /** Constructor
     *	@param message display message
     */
    public FibonacciException(String message){
        super(message);
    }
    /** Constructor without params */
    public FibonacciException(){}
}
