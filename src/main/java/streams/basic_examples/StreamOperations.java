package streams.basic_examples;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Eva", "Alex", "Sophia", "Adrid", "Angel", "Nathan");

        //Transform
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Filter
        names.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(System.out::println);

        //Distinct (Remove duplicated)
        names.stream()
                .distinct()
                .forEach(System.out::println);

        //Sorter
        names.stream()
                .sorted()
                .forEach(System.out::println);

        //Concat
        String concatenated = names.stream()
                .reduce(" ", (a,b) -> a + b + " ");

        System.out.println("Concatenates: " + concatenated);
    }
}
