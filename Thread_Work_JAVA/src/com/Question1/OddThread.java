
package com.Question1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OddThread extends Thread {
     @Override
    public  void run(){
        System.out.println("Thread Running...");
        System.out.println("Let's find odd numbers");
         System.out.println("________________________");
         try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(OddThread.class.getName()).log(Level.SEVERE, null, ex);
        }
       for(int i=0; i<=20; i++){
       if(i%2 == 1){
           System.out.print(i + " - ");
            }
       }
            System.out.println("");
            System.out.println("_____________________________________ ");
    }
}
