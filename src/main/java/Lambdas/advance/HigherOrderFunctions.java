package Lambdas.advance;

import java.util.function.Function;

public class HigherOrderFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> doubleValue = x -> x * 2;

        System.out.println(applyFunction(5, square));
        System.out.println(applyFunction(5, doubleValue));

        Function<Integer, Integer> triple = multiplier(3);
        System.out.println(triple.apply(5));
    }

    static int applyFunction(int value, Function<Integer, Integer> func) {
        return func.apply(value);
    }

    static Function<Integer, Integer> multiplier(int factor) {
        return x -> x * factor;
    }
}
