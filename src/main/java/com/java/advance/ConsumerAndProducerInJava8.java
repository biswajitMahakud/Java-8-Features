package com.java.advance;
//Consumer interface be like .... It's defined in java.util.function package
/*
* interface Consumer<T> {
*   public void accept(T t);
* }
* */

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Movie{
    public String name;
    public Date dateOfRelease;

    public Movie(String name, Date date){
        this.name = name;
        this.dateOfRelease = date;
    }
}
public class ConsumerAndProducerInJava8 {
    public static void main(String[] args) {
        //Consumer interface abstract method(accept()) only take input but doesn't return anything...
        Consumer<Movie> c1 = movie -> System.out.println(movie.name + " will released next week!!!"+ movie.dateOfRelease);
        Consumer<Movie> c2 = movie -> System.out.println(movie.name + " will going to a big floop this year...");
        c1.andThen(c2).accept(new Movie("Spyder", new Date(2024,2,20)));

        //otp creation using Supplier interface... It'll generate otp
        Supplier<String> s = ()->{
            String otp = "";

            for(int i=0;i<6;i++){
                otp = otp + (int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println("Generated otp is: " + s.get());
    }
}
