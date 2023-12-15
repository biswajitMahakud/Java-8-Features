package com.java.advance;

 @FunctionalInterface
interface Interf{
    public  void add(int a , int b );
}
interface Interf2{
     public int squareIt(int n);
}

/*class child implements Interf{
    public  void add(int a , int b){        //( a, b) -> System.out.println("sum is : " + (a+b));
        System.out.println("sum is : " + (a+b));
    }
}*/
public class Main {

    public static void main(String[] args) {
        /*child ob = new child();
         ob.add(21,32);*/
        //lamda expression for Interface Interf
        Interf i = (a, b) -> System.out.println("sum is : " + (a+b)); //lambda expression
        i.add(25,36);
        i.add(250,456);

        //lamda expression for Interface Interf2
        Interf2 i2 = n -> n*n;
        System.out.println(i2.squareIt(6));
        System.out.println(i2.squareIt(12));

    }
}