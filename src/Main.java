import pl.polsl.szymongretka.Controller.Controller;
import pl.polsl.szymongretka.View.View;
import pl.polsl.szymongretka.model.FibonacciGenerator;

/**
 * Main class
 *
 * @author Szymon Gretka
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        View view = new View();
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        Controller controller = new Controller(fibonacciGenerator, view);

        controller.getFibonacciGeneratorRecursive();
        controller.getFibonacciGeneratorIterative();

    }
}
