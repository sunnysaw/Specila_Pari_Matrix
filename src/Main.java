/*
Given an n x n matrix mat[n][n] of integers, find the maximum value of mat(c, d) – mat(a, b) over all choices of
indexes such that both c > a and d > b.

Example:

Input:
mat[N][N] = {{ 1, 2, -1, -4, -20 },
             { -8, -3, 4, 2, 1 },
             { 3, 8, 6, 1, 3 },
             { -4, -1, 1, 7, -6 },
             { 0, -4, 10, -5, 1 }};
Output: 18
The maximum value is 18 as mat[4][2]
- mat[1][0] = 18 has maximum difference.
 */

import java.util.Scanner;

public class Main {
    static int maximum_Pair(int[][] matrix){
        int n = matrix.length;
        int maxDiff = Integer.MIN_VALUE;

        for (int a = 0; a < n - 1; a++) {
            for (int b = 0; b < n - 1; b++) {
                for (int c = a + 1; c < n; c++) {
                    for (int d = b + 1; d < n; d++) {
                        int diff = matrix[c][d] - matrix[a][b];
                        if (diff > maxDiff) {
                            maxDiff = diff;
                        }
                    }
                }
            }
        }

        return maxDiff;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Row of 2d matrix :");
        int length = input.nextInt();
        System.out.println("Enter the column of 2d matrix :");
        int column = input.nextInt();
        int [][] Matrix = new int[length][column];
        System.out.println("Enter the element inside 2d matrix :");
        for (int start = 0; start < length; start++){
            for (int second_start = 0; second_start < column; second_start++){
                 Matrix[start][second_start] = input.nextInt();
            }
        }
        System.out.println("Printing the result :");
        System.out.println(maximum_Pair(Matrix));
    }
}