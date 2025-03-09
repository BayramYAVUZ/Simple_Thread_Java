
package com.Question2;
import java.util.Random;

class RandomNumberThread implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        System.out.print("Random numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();
    }
}


