package com.java.advance;
import java.lang.*;

interface Parent{
    void m1(int x, int y);
    default int squareIt(int x){
        return x*x;
    }
    static void m2(){
        System.out.println("THis is a static method inside interface");
    }
    private void privateMethod(){
        System.out.println("This is a private method inside interface...");
    }
}
public class MixedPractice01
{
    public static void main(String[] args){
        System.out.println("Lambda Expression...");
        Parent ob = (x,y)-> {
            int sum = x + y;
            System.out.println("Sum is " + sum);
        };

        ob.m1(12,23);
        System.out.println("Square of a number: "+ ob.squareIt(5));


        //Test some code in multithrading concepts
        try{
            Thread thread = null;

            Runnable runableImpl = () -> {
                for(int i=0;i<10;i++){
                    System.out.println("Inside Child Thread...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            thread = new Thread(runableImpl);
            thread.start();

        }catch(Exception ex){
            ex.printStackTrace();
        }

        for(int i=0;i<10;i++){
            System.out.println("Inside Main Thread...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

