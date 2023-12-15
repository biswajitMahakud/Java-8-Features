package com.java.advance;

//Runnable is a Functional interface i.e we can use lambda expressions...
//Thread implementation by using Interface
class ThreadExample implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child");
        }
    }
}

//Thread implementation by using class

class ThreadExample2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child");
        }

    }
}
public class ThreadImpl {

    public static void main(String[] args){

        //Thread thread = new Thread(new ThreadExample());
        ThreadExample2 thread2 = new ThreadExample2();
        thread2.start();
        //thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Parent");
        }
    }

}
