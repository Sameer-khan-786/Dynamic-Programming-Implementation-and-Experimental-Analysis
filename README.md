# Dynamic-Programming-Implementation-and-Experimental-Analysis
In this assignment, we will develop a deeper understanding of dynamic programming by coding (1) a straightforward recursive solution (2) memorized top- down version (3) a bottom-up version, to solve the following problems: a) Computation of the nth Fibonacci number b) optimal parenthesization for a matrix chain multiplication

# Dynamic Programming
# Introduction:
•	Dynamic programming is a powerful algorithmic technique that is used to solve problems by breaking them down into subproblems, solving each subproblem only once, and storing the solutions in a table for future reference. 
•	This approach can significantly reduce the time complexity of the algorithm and make it much faster than a recursive approach.
•	It is commonly used in optimization problems, machine learning, and artificial intelligence.
•	We will Compare the performance of different dynamic programming algorithms for solving Fibonacci number and matrix chain multiplication problems.
•	By comparing the results and execution time of different implementations, we can identify the most efficient and effective implementation for each problem.
Why is dynamic programming interesting/useful?
•	Dynamic programming is interesting and useful because it allows us to solve complex problems in a more efficient manner. By breaking a problem down into smaller subproblems and using previously computed solutions, we can avoid repeating the same calculations and reduce the overall time and space complexity of the algorithm.
•	This is particularly useful when the problem has overlapping subproblems, meaning that the same subproblems are encountered multiple times in the process of solving the larger problem.
•	By using dynamic programming, we can avoid redundant computations and significantly reduce the time complexity of our algorithm.
Expected vs Actual Results and Timing:
# 1. Fibonacci number ( Recursive Version )
INPUT	OUTPUT	TIME TAKEN 
( Microseconds )
2	1	1
4	3	0
6	8	1
8	21	1
10	55	32
20	6765	58
30	832040	2996
50	12586269025	41593977
52	32951280099	108564045
55	139583862445	460579212
57	365435296162	1212506159

•	Looking at the data in the table, we can see that the recursive version of the Fibonacci algorithm has a significantly increasing time taken for larger input values. For example, the time taken for input value 10 is only 32 microseconds, but it increases to 41593977 microseconds for input value 50.
•	This is because the recursive algorithm computes the same sub-problems multiple times, leading to exponential time complexity. As a result, the time taken increases very quickly as the input value gets larger.
•	Additionally, we can observe that the output values follow the Fibonacci sequence.
•	However, due to the exponential increase in time taken, the recursive algorithm is not efficient for computing Fibonacci numbers for large input values. 
 
# 2. Fibonacci number ( Memorized Top-Down Version )
INPUT	OUTPUT	TIME TAKEN 
( Microseconds )
2	1	1
4	3	0
6	8	0
8	21	0
10	55	0
20	6765	0
30	832040	0
50	12586269025	1
52	32951280099	1
55	139583862445	1
57	365435296162	1

•	Memorized top-down version of the Fibonacci algorithm has a constant time taken for all input values.
•	This is because the algorithm stores the values of previously computed sub-problems in a table, avoiding the need to recompute them. As a result, the time taken for each input value is very low and almost constant.
•	We can observe that the output values follow the Fibonacci sequence.
•	Comparing this version of the algorithm to the recursive version, we can see that the memorized top-down version is significantly more efficient for computing Fibonacci numbers for large input values.
 
# 3. Fibonacci number ( Bottom-Up Version )
INPUT	OUTPUT	TIME TAKEN 
( Microseconds )
2	1	2
4	3	1
6	8	1
8	21	1
10	55	1
20	6765	1
30	832040	1
50	12586269025	2
52	32951280099	2
55	139583862445	2
57	365435296162	2

•	We can see that the bottom-up version of the Fibonacci algorithm also has a low and almost constant time taken for all input values.
•	This is because the algorithm computes the values of sub-problems iteratively from the bottom-up, starting with the smallest sub-problems and building up to the larger ones.
•	We can observe that the output values follow the Fibonacci sequence.
•	Comparing this version of the algorithm to the memorized top-down and recursive versions, we can see that the bottom-up version is also efficient for computing Fibonacci numbers for large input values.
•	However, it may be less space-efficient as it requires storing all computed values in a table, whereas the memorized top-down version only stores the values of previously computed sub-problems.
 
# 4. Matrix chain multiplication ( Recursive Version )
INPUT	SCALAR MULTIPLICATION	OPTIMAL PARENTHESIZATION	TIME TAKEN
1, 2, 3, 4, 5, 4, 3, 2, 1	78	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	95 microseconds
10, 20, 30, 40, 50, 40, 30, 20, 10	78000	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	100 microseconds
100,200,300,400,500,400,300,200,100	78000000	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	208 microseconds

•	We can observe that the optimal parenthesization for all inputs is the same, and follows the order of multiplying the matrices from left to right.
•	We can also see that the time taken by the algorithm increases as the size of the input increases. This is expected, as the recursive version of the algorithm has an exponential time complexity of O(2^n). Therefore, for large input sizes, the time taken can become prohibitively high.
•	The algorithm recursively breaks down the matrix chain into sub-problems until a base case is reached, and then returns the optimal parenthesization and scalar multiplication for the entire matrix chain.
 
# 5. Matrix chain multiplication ( Memorized Top-Down Version )
INPUT	SCALAR MULTIPLICATION	OPTIMAL PARENTHESIZATION	TIME TAKEN
1, 2, 3, 4, 5, 4, 3, 2, 1	78	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	10 microseconds
10, 20, 30, 40, 50, 40, 30, 20, 10	78000	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	10 microseconds
100,200,300,400,500,400,300,200,100	78000000	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	10 microseconds

•	Memoized Top-Down version of the matrix chain multiplication algorithm has significantly reduced the time taken for the calculations compared to the Recursive version, especially for larger inputs.
•	Memoized Top-Down approaches are more efficient than the Recursive approach for these algorithm.
 
# 6. Matrix chain multiplication ( Bottom-Up Version )
INPUT	SCALAR MULTIPLICATION	OPTIMAL PARENTHESIZATION	TIME TAKEN
1, 2, 3, 4, 5, 4, 3, 2, 1	78	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	6 microseconds
10, 20, 30, 40, 50, 40, 30, 20, 10	78000	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	6 microseconds
100,200,300,400,500,400,300,200,100	78000000	(A1 x (A2 x (A3 x (A4 x (A5 x (A6 x (A7 x A8)))))))	6
microseconds

•	Bottom-up version stores the results of previously computed subproblems in a table.
•	This results in a similar time complexity as the memorized top-down version, and for the largest input size, the time taken is only 6 microseconds, which is the fastest among the three implementations.
 
Overall, the bottom-up implementation is the most efficient implementation for matrix chain multiplication.
The memorized top-down and bottom-up versions of the algorithms often have similar time complexity, but the bottom-up approach tends to be slightly faster in some cases.

# Any Anomalies and Explanation for the Anomalies:
•	There are a few anomalies in the results. For example, in the Fibonacci recursive version table, we see that the time taken for input 10 is significantly higher than the expected value. This could be due to the overhead of function calls and the recursive nature of the algorithm, which can lead to a large number of function calls for larger inputs.
•	Another example of an anomaly is seen in the matrix chain multiplication calculations using the recursive version. Here, we see that the time taken for input size 100,200,300,400,500,400,300,200,100 is much higher than what we would expect based on the pattern of the results for other input sizes. This could be due to the fact that the recursive implementation has to calculate many subproblems and therefore, leads to a higher number of recursive calls and a longer execution time.
•	The memorized top-down and bottom-up versions, on the other hand, store the solutions for each subproblem and use them to solve larger problems, leading to fewer computations and function calls.
Any Special Observations According to Above Tables:
•	Looking at the results, we can observe that the dynamic programming algorithms provide significant performance improvements over the recursive approach. 
•	Additionally, the memorized top-down and bottom-up versions of the algorithms are generally comparable in terms of time complexity, but the bottom-up approach can be slightly faster in some cases. 
•	We can also observe that the optimal parenthesization and scalar multiplication values are consistent across all implementations of the dynamic programming algorithms.

# Bonus part for Fibonacci numbers :
Identify the largest n for the nth Fibonacci number that you feel is practical in each approach, and the time it took for that case.
 
I calculated: 
50th Fibonacci number and it takes around 41593977 Microseconds  (0.69 Minutes )
53th Fibonacci number and it takes around 108564045 Microseconds  (1.8 Minutes )
55th Fibonacci number and it takes around 460579212 Microseconds (7.67 Minutes )
57th Fibonacci number and it takes around 1212506159 Microseconds (20.20 Minutes )
I also tried for 100th Fibonacci number but after 1 hour i quit the task and realized that it will take hours to calculate 100th Fibonacci Number.
For the recursive approach, the time taken for calculating the 50th Fibonacci number was approx. 40 Seconds, which is significantly longer than the other approaches. Therefore, it may not be practical to calculate Fibonacci numbers beyond the 50th using this approach, as this approach will take long time to generate results.
For the memorized top-down and bottom-up approaches, the time taken for calculating the 50th Fibonacci number was around 2 microseconds, which is much faster than the recursive approach. 
 
This approach can handle values of n up to around 1000000000 within a reasonable amount of time.
 
This approach can handle values of n up to around 1000000000 within a reasonable amount of time.
Both ( Memorized and Bottom Up ) of this approach have same time complexity of O(n).
