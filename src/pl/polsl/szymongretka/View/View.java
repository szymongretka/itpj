package pl.polsl.szymongretka.View;


import java.util.InputMismatchException;
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
     *
     * @param n defines which number to read
     * @return coefficient value
     * @throws InputMismatchException thrown if the given coefficient is not an integer
     */
    public int readNumber(int n) {
        System.out.println("Please type which number of fibonacci sequence you want to display: ");
        int number = 0;

        try{
            number = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please insert integer value!");
            scanner.next();
        }

        if(number < 0){
            throw new IllegalArgumentException(String.format("You cannot obtain fibonacci sequence ", number));
        }

        return number;
    }

    /**
     * Displays message on standard output
     *
     * @param message message to be displayed
     */
    public void print(String message) {
        System.out.println(message);
    }

}
