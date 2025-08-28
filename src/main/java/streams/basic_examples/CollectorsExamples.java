package streams.basic_examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main (String[] args){
        List<String> names = Arrays.asList("Eva", "Alex", "Sophia", "Adri", "Angel", "Nathan");

        //To List
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("toList (Unmodifiable): " + upperNames);

        //To Set
        Set<String> uniqueNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toUnmodifiableSet());

        System.out.println("ToSet (Unmodifiable): " + uniqueNames);

        //Joins
        String joined = names.stream()
                .collect(Collectors.joining(", "));

        //Other version: String joined = String.join(", ", names);
        System.out.println("Joins: " + joined);

        //Counts
        Long count = names.stream().count();
        //Other version: Long count = (long) names.size();
        System.out.println("Count: " + count);

        //Group
        Map<Integer,List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Group: " + groupedByLength);

        //Partition
        //Divide the elements into two groups: those that meet the condition (true)
        // and those that do not (false).
        Map<Boolean, List<String>> partition = names.stream()
                .collect(Collectors.partitioningBy(n -> n.startsWith("A")));

        System.out.println("Partition: " + partition);

        //Grouped and Transform
        Map<Integer, Set<String>> groupedAndUppercase = names.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(String::toUpperCase, Collectors.toSet())
                ));
    }
}
