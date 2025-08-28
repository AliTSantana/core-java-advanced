package Lambdas.basic;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sophia", "Alex", "Eva", "Angel", "Adri", "Nathan");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        names.forEach(System.out::println);
        names.stream().map(Person::new).forEach(System.out::println);
    }
}

class Person {
    String name;
    Person(String name) { this.name = name; }
    public String toString() { return "Person: " + name; }
}