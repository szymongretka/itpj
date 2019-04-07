package pl.polsl.szymongretka.Controller;

import pl.polsl.szymongretka.View.View;
import pl.polsl.szymongretka.model.FibonacciGenerator;

import java.time.Duration;
import java.time.Instant;
import java.util.InputMismatchException;

/**
 * Main controller class
 *
 * @author Szymon Gretka
 * @version 1.0
 */
public class Controller {


    private final FibonacciGenerator fibonacciGenerator;
    private final View view;
    private int n;


    public Controller(FibonacciGenerator fibonacciGenerator, View view) {
        this.fibonacciGenerator = fibonacciGenerator;
        this.view = view;
    }

    public void getFibonacciGeneratorRecursive() {
        try {
            n = view.readNumber(n);
            Instant before = Instant.now();
            this.fibonacciGenerator.fibonacciRecursive(n);
            Instant after = Instant.now();
            long delta = Duration.between(before, after).toMillis();
            view.print("Result for n = " + n + " is equal to: " + fibonacciGenerator.fibonacciRecursive(n));
            view.print("Duration of generating fibonacci sequence using recursive method: " + delta + " [ms]");
        }
        catch (InputMismatchException e){
            view.print("Error: "+ e.getMessage());
        }
    }

    public void getFibonacciGeneratorIterative() {
        try {
            n = view.readNumber(n);
            Instant before = Instant.now();
            this.fibonacciGenerator.fibonacciIterative(n);
            Instant after = Instant.now();
            long delta = Duration.between(before, after).toMillis();
            view.print("Result for n = " + n + " is equal to: " + fibonacciGenerator.fibonacciIterative(n));
            view.print("Duration of generating fibonacci sequence using iterative method: " + delta + " [ms]");
        }
        catch (InputMismatchException e){
            view.print("Error: "+ e.getMessage());
        }
    }
}
