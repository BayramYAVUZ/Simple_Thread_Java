
package com.Question4;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        thread1.setPriority(Thread.MAX_PRIORITY); // Maksimum öncelik (10)
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal öncelik (5)
        thread3.setPriority(Thread.MIN_PRIORITY); // Minimum öncelik (1)

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

