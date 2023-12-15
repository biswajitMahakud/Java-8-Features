package com.java.advance;
import java.util.function.*;
public class PredicateJoining {
    public static void main(String[] args) {
        int[] arr = {0,21,8,24,25,32,48,50,87,96,27,5,9};
        Predicate<Integer> p1 = num->num%2==0; //checks which no is even
        Predicate<Integer> p2 = num->num>10; //checks which no > 10

        //finally It iterates over the array and checks both the predicate
        System.out.println("Print no's which are even and greater than 10...");
        for(int x : arr){
            if(p1.and(p2).test(x)){ //p1 and p2 predicates should true... and()
                System.out.println(x);
            }
        }
        //only one of the predicate or both should be true... or()
        System.out.println("Print no's which are even or greater than 10...");
        for(int x : arr){
            if(p1.or(p2).test(x)){ //either p1 and p2 or both predicates should true... and()
                System.out.println(x);
            }
        }
        System.out.println("Print no's which are odd");
        for(int x : arr){
            if(p1.negate().test(x)){ //opposite of a number even-->odd
                System.out.println(x);
            }
        }
    }
}
