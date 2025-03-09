package com.Question5;

class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon Thread Running");
        }
    }
}