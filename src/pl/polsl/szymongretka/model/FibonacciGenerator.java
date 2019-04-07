package pl.polsl.szymongretka.model;

/**
 * Model class generating Fibonacci sequence using iterative or recursive methods
 *
 * @author Szymon Gretka
 * @version 1.0
 */
public class FibonacciGenerator {

    /**
     *method which returns the result of fibonacci sequence
     * using recursive method
     * @param n defines which number to read
     * @return result from fibonacci sequence
     */
    public int fibonacciRecursive(int n){

        if(n==0){
            return 0;
        } else if((n==1)||(n==2)) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    /**
     *method which returns the result of fibonacci sequence
     * using iterative method
     * @param n defines which number to read
     * @return result from fibonacci sequence
     */
    public int fibonacciIterative(int n){

        /**
         * @param coeffA coefficient a
         * @param coeffB coefficient b
         * @param coeffC coefficient c
         */
        int coeffA = 0;
        int coeffB = 1;
        int coeffC = 1;

        if(n==0)
            return 0;
        if((n==1)||(n==2))
            return 1;

        else {
            for (int i = 0; i < n; i++) {
                coeffA = coeffB;
                coeffB = coeffC;
                coeffC = coeffA + coeffB;
            }
            return coeffA;
        }
    }


}
