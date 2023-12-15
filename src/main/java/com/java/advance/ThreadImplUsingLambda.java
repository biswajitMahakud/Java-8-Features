package com.java.advance;

public class ThreadImplUsingLambda {
    public static void main(String[] args) {

        //creating child thread imlementing Runnable Interface i.e lambda expression
        //public void run(); is implemented using lambda expression
        Runnable thread = ()-> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread!!!");
            };
        };
        Thread childThread = new Thread(thread);
        childThread.start();

        for(int i =0;i<10;i++){
            System.out.println("Parent Thread!!!");
        }
    }
}
