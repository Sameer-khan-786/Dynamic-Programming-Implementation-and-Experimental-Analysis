import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Fibonacci_Memorized_top_down 
{
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fib(int n) 
    {
        if (n <= 1) 
        {
            return n;
        }
        long prev1 = 0, prev2 = 1;
        for (int i = 2; i <= n; i++) 
        {
            long temp = prev1 + prev2;
            prev1 = prev2;
            prev2 = temp;
        }
        return prev2;
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

        for (int n : inputs) 
        {
            long startTime = System.nanoTime();
            long result = fib(n);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000;

            System.out.printf("Fibonacci(%d) = %d, took %d microseconds%n", n, result, duration);
        }
    }
}
