package Lambdas.basic;

import java.util.concurrent.Callable;

@FunctionalInterface
interface GreetingService {
    void sayMessage(String message);
}

public class FunctionalInterfaces {
    public static void main(String[] args) throws Exception {
        GreetingService greet = message -> System.out.println("Hello, " + message);
        greet.sayMessage("Eva");

        Runnable runExample = () -> System.out.println("Running in a thread");
        new Thread(runExample).start();

        Callable<Integer> callable = () -> 42;
        System.out.println("Callable result: " + callable.call());
    }
}