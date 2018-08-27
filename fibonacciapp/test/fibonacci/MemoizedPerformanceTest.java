package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MemoizedPerformanceTest {

    long measureTime(FibonacciSolution fibonacciSolution){
        long startTime = System.nanoTime();
        fibonacciSolution.compute(25);

        return System.nanoTime() - startTime;
    }

    @Test
    void checkIfMemoizedTimeLessThanRecursive(){
        long recursiveTime = measureTime(new FibonacciRecursiveSolution());
        long memoizedTime = measureTime(new FibonacciMemoizedSolution());

        assertTrue(memoizedTime < recursiveTime / 10);

    }
}