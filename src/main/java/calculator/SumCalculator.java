package calculator;

import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n){
        if (n < 1){
            throw new IllegalArgumentException("Can't calculate sum for n: " + n);
        }
        return IntStream.range(1, n+1)
                .sum();
    }
}
