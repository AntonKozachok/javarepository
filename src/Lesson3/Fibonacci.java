package Lesson3;

public class Fibonacci {
    public Fibonacci() {    }

    public static void printFibonacciNumbers(int howMany) {
        int[] fibonacciNumbers = new int[howMany];
        if (howMany <= 0) System.out.println("Enter positive number");
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i <= howMany - 1; i++)
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        for (int j = 0; j <= howMany; j++) System.out.println(fibonacciNumbers[j] + " ");
    }

    public static void main(String[] args) {
        printFibonacciNumbers(4);
    }
}

