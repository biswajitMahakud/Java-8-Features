package com.java.advance;
import java.util.function.Predicate;
//without using lambda exptession
 class PredicateImpl implements  Predicate<Integer>{
     @Override
    public boolean test(Integer age){

        /*
        if(age>=18){
            System.out.println("You are eligible to go to pub.");
            return true;
        }else{
            System.out.println("You aren't eligible to go to pub.");
            return false;
        }*/

        //And we can write above if...else statement using ternary operator
         boolean result = (age >= 18) ? true : false;
        System.out.println(result?"Adult":"Not Adult");

         return result;
    }
}
public class PredicateInJava {
    public static void main(String[] args) {
   // PredicateImpl ob1 = new PredicateImpl();
   // System.out.println(ob1.test(87));

    //now see by using lambda expression implementation code will be decreased...

        Predicate<Integer> predicateImplByLambda = age-> (age >= 18) ? true : false;
       boolean result = predicateImplByLambda.test(20);
    System.out.println(result);
    }
}
