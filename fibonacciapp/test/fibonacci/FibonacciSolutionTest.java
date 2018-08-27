package fibonacci;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public interface FibonacciSolutionTest {

    FibonacciSolution createInstance();

    @Test
    default void computePositions0To5And10(){
        FibonacciSolution fibonacci = createInstance();

        assertAll(
                () -> assertEquals(BigInteger.valueOf(1), fibonacci.compute(0)),
                () -> assertEquals(BigInteger.valueOf(1), fibonacci.compute(1)),
                () -> assertEquals(BigInteger.valueOf(2), fibonacci.compute(2)),
                () -> assertEquals(BigInteger.valueOf(3), fibonacci.compute(3)),
                () -> assertEquals(BigInteger.valueOf(5), fibonacci.compute(4)),
                () -> assertEquals(BigInteger.valueOf(8), fibonacci.compute(5)),
                () -> assertEquals(BigInteger.valueOf(89), fibonacci.compute(10))
        );
    }
}