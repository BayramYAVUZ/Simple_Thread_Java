
package com.Question1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String [] args){
        OddThread throdd = new OddThread();
        EvenThread threven = new EvenThread();
// _____________________________________________________________________________
         throdd.start();

        try {
            throdd.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         threven.start();
    }   
}
