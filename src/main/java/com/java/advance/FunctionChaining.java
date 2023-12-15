package com.java.advance;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer,Integer> mul = i-> i*i;
        Function<Integer,Integer> add = num-> num+20;
        Function<Integer,Integer> divide = x-> x/5;
        int result = mul.andThen(add).andThen(divide).apply(5);
        System.out.println("The value is: " + result);

    }
}
