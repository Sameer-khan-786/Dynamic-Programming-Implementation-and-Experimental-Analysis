import java.util.Scanner;
class Fibonacci_Recursive 
{
    public static long fib(int n) 
    {
        if (n <= 1) 
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a comma-separated list of Fibonacci numbers to compute: ");
        String input = sc.nextLine();
        String[] tokens = input.split(",");
        int[] inputs = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) 
        {
            inputs[i] = Integer.parseInt(tokens[i].trim());
        }

        for (int n : inputs) {
            long startTime = System.nanoTime();
            long result = fib(n);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000;

            System.out.printf("Fibonacci(%d) = %d, took %d microseconds%n", n, result, duration);
        }
    }
}
