package com.java.advance;
import java.util.function.*;
public class CheckStringLengthUsingPredicate {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = (str)-> str.length() > 5 ;
        boolean result = stringPredicate.test("Hello ");
        System.out.println(result);

        //using the above predicate to check which string elements in an array is greater than 5...
        System.out.println("List of strings greater than 5:------------");
        String[] s = {"Subhasree", "Dibyashree", "Ram", "Sita", "Hariprasad", "Laxman"};
        for(String str : s){
            if(stringPredicate.test(str)){
                System.out.println(str);
            }
        }

        //If we're asking print the string which length is even
        System.out.println("Even String:------------------");
        Predicate<String> p = str -> str.length()%2==0;
        for(String str : s){
            if(p.test(str)){
                System.out.println(str);
            }
        }
    }
}
