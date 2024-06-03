package com.java.advance;

public class MethodReferenceImpl {
    public static void m1(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread...");
        }
    }
    public void m3(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread>>>");
        }
    }

    //reference method can be any return type and modifiers but It should be equal argument type as abstract method
    private static int m2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread:::::::::::::");
        }
        return 10;
    }

    public static void main(String[] args) {
        //This below implementaion of runnable interface run method using lambda expression...
        /*Runnable r1 = ()-> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };*/
        //But here we are going to write code using method reference
        Runnable r2 = MethodReferenceImpl :: m1;
        //If the reference method is instance type than we should use obj ...
        MethodReferenceImpl obj = new MethodReferenceImpl();
        Runnable r3 = obj :: m3;

        //If the reference method has different return type and modifiers , then It also works but It shouldn't have different argument type...
        Runnable r4 = MethodReferenceImpl :: m2;
        Thread thread = new Thread(r4);
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Parent Thread:::::::::");
        }
    }
}
