package fibonacci;

import java.math.BigInteger;

public class FibonacciIterativeSolution implements FibonacciSolution {

    @Override
    public BigInteger compute(int position) {
        if(position < 2)
            return BigInteger.valueOf(1);

        BigInteger current = new BigInteger("1");
        BigInteger next = new BigInteger("1");

        for(int i = 2; i <= position; i++) {
            BigInteger temp = next;
            next = current.add(temp);
            current = temp;
        }

        return next;
    }
}

