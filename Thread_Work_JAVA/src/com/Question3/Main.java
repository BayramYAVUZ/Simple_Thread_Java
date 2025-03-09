
package com.Question3;

public class Main {
    
    public static void main(String [] args){
        
        Thread n_th = new Thread(new NumberThread());
        MessageThread m_th = new Thread(numberth);
        //______________________________________
        
        n_th.start();
        m_th.start();
    } 
}
