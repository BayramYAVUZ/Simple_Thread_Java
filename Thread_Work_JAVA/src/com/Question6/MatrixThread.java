
package com.Question6;

class MatrixThread extends Thread {
    private int row;
    private int col;
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] result;

    public MatrixThread(int row, int col, int[][] matrixA, int[][] matrixB, int[][] result) {
        this.row = row;
        this.col = col;
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = result;
    }

    @Override
    public void run() {
        // Matrix çarpımını yapıyoruz
        result[row][col] = matrixA[row][0] * matrixB[0][col] + matrixA[row][1] * matrixB[1][col];
    }
}