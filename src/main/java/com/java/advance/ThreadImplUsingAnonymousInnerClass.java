package com.java.advance;

public class ThreadImplUsingAnonymousInnerClass {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Child Thread");
                }
            }
        };

       /* Class<?> clazz = r.getClass();
        System.out.println("The type of the object is: " + clazz);*/

        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
