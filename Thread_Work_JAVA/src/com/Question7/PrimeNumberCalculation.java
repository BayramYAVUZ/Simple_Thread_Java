
package com.Question7;

public class PrimeNumberCalculation {
    public static void main(String[] args) throws InterruptedException {
        int limit = 10;
        int range = limit / 2;

        PrimeThread thread1 = new PrimeThread(1, range);
        PrimeThread thread2 = new PrimeThread(range + 1, limit);

 
        thread1.start();
        thread2.start();

        
        thread1.join();
        thread2.join();

        int totalSum = thread1.getSum() + thread2.getSum();
        System.out.println("Sum of primes up to " + limit + ": " + totalSum);
    }
}

