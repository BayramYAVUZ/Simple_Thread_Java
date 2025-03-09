
package com.Question5;

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        DaemonThread daemon = new DaemonThread();
        
        daemon.setDaemon(true);
        
        daemon.start();
        
        Thread.sleep(5000);
        System.out.println("Main thread ends.");
    }
}
