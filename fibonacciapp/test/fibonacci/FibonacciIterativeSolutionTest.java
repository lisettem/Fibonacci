package fibonacci;

import org.junit.jupiter.api.*;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciIterativeSolutionTest implements FibonacciSolutionTest{

    public FibonacciSolution createInstance() {

        return new FibonacciIterativeSolution();
    }

    @Test
    void canary() { assertTrue(true); }

    @Test
    void computeForPosition50(){
        FibonacciSolution fibonacci = createInstance();

        assertEquals(BigInteger.valueOf(20365011074L), fibonacci.compute(50));
    }

    @Test
    void computeForPosition300(){
        FibonacciSolution fibonacci = createInstance();

        assertEquals("359579325206583560961765665172189099052367214309267232255589801",
                String.valueOf(fibonacci.compute(300)));
    }
}

