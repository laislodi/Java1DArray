package com.laislodi.hackerrank;

import java.util.Scanner;

public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        int max1together = 0;
        for (int i = 0, count = 0; i < game.length; i++) {
            if (game[i] == 1) {
                count++;
            } else {
                if (max1together < count) {
                    max1together = count;
                }
                count = 0;
            }
        }

        return max1together < leap;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
