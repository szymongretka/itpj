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
    public int readNumber(int n)
            throws InputMismatchException {
        System.out.println("Please type which number of fibonacci sequence you want to display: ");
        return scanner.nextInt();
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
