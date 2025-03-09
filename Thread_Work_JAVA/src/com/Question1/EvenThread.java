
package com.Question1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class EvenThread extends Thread {
    @Override 
    public void  run(){
        System.out.println("Thread Running...");
        System.out.println("Let's find even numbers");
        System.out.println("________________________");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(EvenThread.class.getName()).log(Level.SEVERE, null, ex);
        }
       for(int i=0; i<=20; i++){
       if(i%2 == 0){
           System.out.print(i + " - ");
            }
       }
            System.out.println("");
            System.out.println("_____________________________________ ");
    }
}
