package pl.polsl.szymongretka.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Model class generating Fibonacci sequence using iterative or recursive methods
 *
 * @author Szymon Gretka
 * @version 1.0
 */
public class FibonacciGenerator {

    private final Map<Integer, Long> fibMap = new HashMap<>();

    public Map<Integer, Long> getResult() {
        return fibMap;
    }

    public FibonacciGenerator() {
        this.fibMap.put(0, 0L);
    }
    /**
     *method which returns the result of fibonacci sequence
     * using recursive method
     * @param n defines which number to read
     * @return result from fibonacci sequence
     */
    public Long fibonacciRecursive(int n) {

        if(n==1) {
            fibMap.put(1, 1L);
            return 1L;
        } else if(n==2){
            fibMap.put(1, 1L);
            return 1L;
        } else {
            return fibMap.computeIfAbsent(n, key -> fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2));
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
