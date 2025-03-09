
package com.Question6;


public class MatrixMultiplication {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        int[][] result = new int[2][2];

        Thread[] threads = new Thread[4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                threads[i * 2 + j] = new MatrixThread(i, j, matrixA, matrixB, result);
                threads[i * 2 + j].start();
            }
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
