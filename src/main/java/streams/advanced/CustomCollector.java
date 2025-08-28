package streams.advanced;

import java.util.*;
import java.util.stream.Collector;

public class CustomCollector {
    public static void main(String[] args){
        List<String> names = List.of("Eva", "Alex", "Sophia", "Adri", "Angel", "Nathan");

        // Custom collector: collect names into a single string separated by '-'
        String result = names.stream()
                .collect(StringBuilder::new,
                        (sb, s) -> sb.append(s).append('-'),
                        StringBuilder::append)
                .toString();

        // Remove trailing '-'
        if (result.endsWith("-")) {
            result = result.substring(0, result.length() - 1);
        }

        System.out.println("CustomCollector result: " + result);

        // Custom collector: group names by first letter into a Map<Character, Set<String>>
        Map<Character, Set<String>> groupedNames = names.stream()
                .collect(Collector.of(
                        HashMap::new,                     // supplier
                        (map, name) -> map
                                .computeIfAbsent(name.charAt(0), k -> new HashSet<>())
                                .add(name.toUpperCase()), // accumulator
                        (map1, map2) -> map1
                ));
        System.out.println("Grouped Names result: " + groupedNames);
    }
}

