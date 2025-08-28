package Lambdas.advance;

public class ClosuresAndScopes {
    public static void main(String[] args) {
        String greeting = "Hello"; // effectively final
        Runnable r = () -> System.out.println(greeting + ", Eva");
        r.run();
    }
}