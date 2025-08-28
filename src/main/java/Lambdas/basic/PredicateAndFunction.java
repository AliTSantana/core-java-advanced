package Lambdas.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateAndFunction {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sophia", "Alex", "Eva", "Angel", "Adri", "Nathan");
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Function<String, Integer> lengthFunc = String::length;
        Consumer<String> printer = System.out::println;
        Supplier<String> supplier = () -> "Generated String";
        names.stream().filter(startsWithA).forEach(printer);
        names.stream().map(lengthFunc).forEach(System.out::println);

        System.out.println("Supplier: " + supplier.get());
    }
}
