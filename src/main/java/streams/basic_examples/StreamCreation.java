package streams.basic_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Sophia", "Alex", "Eva");
        Stream<String> streamFromList = names.stream();
        streamFromList.forEach(System.out::println);

        String[] array = {"Angel", "Adri", "Nathan"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);

        Stream<String> streamBuilder = Stream.<String>builder()
                .add("A")
                .add("B")
                .add("C")
                .build();

        streamBuilder.forEach(System.out::println);

        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n+2)
                .limit(5);
        infiniteStream.forEach(System.out::println);
    }
}
