import pl.polsl.szymongretka.Controller.Controller;
import pl.polsl.szymongretka.View.View;
import pl.polsl.szymongretka.model.FibonacciGenerator;
import pl.polsl.szymongretka.model.Generic;

import java.util.Map;

/**
 * Main class
 *
 * @author Szymon Gretka
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        //Generic generic = new Generic();
        /*View view = new View();
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        Controller controller = new Controller(fibonacciGenerator, view);

        controller.getFibonacciGeneratorRecursive();
        controller.getFibonacciGeneratorIterative();*/


        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        fibonacciGenerator.fibonacciRecursive(5);

        //for(Map.Entry<Integer, Long> s : fibonacciGenerator.getResult().entrySet())
            //System.out.println(s);


    }
}
