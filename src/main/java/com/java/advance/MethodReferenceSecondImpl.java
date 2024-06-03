package com.java.advance;

@FunctionalInterface
interface InterfTwo{
    public void add(int a, int b);
}
public class MethodReferenceSecondImpl {
    //return type can be anything but argument should be same as interface abstract method arguments...
    public static int func(int x ,int y){
        System.out.println("The sum of Two no is: " + (x+y));
        return 0;
    }
    public static void main(String[] args) {
        InterfTwo i1 = (a,b)->System.out.println("The sum is: " + (a+b));
        i1.add(30,45);
        //by using method reference...
        InterfTwo i2 = MethodReferenceSecondImpl :: func;
        i2.add(96,89);
    }
}
