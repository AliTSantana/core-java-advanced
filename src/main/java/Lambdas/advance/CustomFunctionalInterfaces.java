package Lambdas.advance;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class CustomFunctionalInterfaces {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Add: " + add.operate(5, 3));
        System.out.println("Multiply: " + multiply.operate(5, 3));
    }
}
