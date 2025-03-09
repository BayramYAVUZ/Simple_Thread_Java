
package com.Question3;


class MessageThread extends Thread {
    private Thread dependency;

    public MessageThread(Thread dependency) {
        this.dependency = dependency;
    }

    @Override
    public void run() {
        try {
            dependency.join(); // Wait for finish
            System.out.println("Thread Finished");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
