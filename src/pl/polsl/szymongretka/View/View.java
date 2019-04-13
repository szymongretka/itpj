package pl.polsl.szymongretka.View;


import pl.polsl.szymongretka.Exceptions.FibonacciException;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * View class handling UI
 *
 * @author Szymon Gretka
 * @version 1.0
 */
public class View {
    /**
     * Scanner used for reading from standard input stream
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Read input number
     * @return coefficient value
     * @throws InputMismatchException thrown if the given coefficient is not an integer
     */
    public int readNumber() throws InputMismatchException, FibonacciException {
        System.out.println("Please type which number of fibonacci sequence you want to display: ");
        int number;
        number = scanner.nextInt();

        if(number < 0){
            throw new FibonacciException("Type number which is greater than 0!");
        } else {
            return number;
        }
    }

    /**
     * Displays message on standard output
     *
     * @param message message to be displayed
     */
    public void print(String message) {
        System.out.println(message);
    }

    public <K, V> void printMap(Map<K, V> map){
        for(Map.Entry<K, V> s : map.entrySet()){
            System.out.println(s.getKey()+ " : " + s.getValue());
        }
    }

}
