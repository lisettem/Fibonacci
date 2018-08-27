package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;

public class FibonacciMemoizedSolution extends FibonacciRecursiveSolution {

    private HashMap<Integer, BigInteger> memoizedSeries = new HashMap<>();

    @Override
    public BigInteger compute(int position) {

        if (!memoizedSeries.containsKey(position))
            memoizedSeries.put(position, super.compute(position));

        return memoizedSeries.get(position);
    }
}