
package com.Question4;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread with priority " + getPriority() + " is running.");
    }
}