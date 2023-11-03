import java.util.Scanner;

class MatrixChainMultiplication_BottomUp 
{
    static int[][] matrixChainOrder(int[] p) 
    {
        int n = p.length;
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

        for (int len = 2; len < n; len++) 
        {
            for (int i = 1; i < n - len + 1; i++) 
            {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) 
                {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) 
                    {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }

        return s;
    }

    static int matrixChainOrderCost(int[] p) 
    {
        int n = p.length;
        int[][] m = new int[n][n];

        for (int len = 2; len < n; len++) 
        {
            for (int i = 1; i < n - len + 1; i++) 
            {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) 
                {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) 
                    {
                        m[i][j] = q;
                    }
                }
            }
        }

        return m[1][n - 1];
    }

    static String printOptimalParen(int[][] s, int i, int j) 
    {
        if (i == j) 
        {
            return "A" + i;
        } 
        else 
        {
            return "(" + printOptimalParen(s, i, s[i][j]) + " x " + printOptimalParen(s, s[i][j] + 1, j) + ")";
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a comma-separated list For MatrixChainMultiplication : ");
        String input = sc.nextLine();
        String[] tokens = input.split(",");
        int[] inputs = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) 
        {
            inputs[i] = Integer.parseInt(tokens[i].trim());
        }
        
        int[][] s = matrixChainOrder(inputs);
        String optimalParen = printOptimalParen(s, 1, s.length - 1);
        long startTime = System.nanoTime();
        int cost = matrixChainOrderCost(inputs);
        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime) / 1000;

        System.out.println("Optimal number of scalar multiplications: " + cost);
        System.out.println("Optimal parenthesization: " + optimalParen);
        System.out.println("Time taken: " + elapsedTime + " microseconds");
    }
}
