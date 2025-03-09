
package com.Question2;

public class Main {
    public static void main(String[] args) {
        Thread randomThread = new Thread(new RandomNumberThread());
        randomThread.start();
    }
}
 