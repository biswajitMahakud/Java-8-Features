package com.java.advance;

import java.util.*;


/*class MyComparator implements Comparator<Integer>{
    public int compare(Integer I1, Integer I2){
        //if(I1<I2){
           // return -1;
       // }
       // else if(I1>I2){
           // return 1;
       // }
      //  else{
        //    return 0;
        //}

         return (I1<I2)?-1:(I1>I2)?1:0; // The above if...else statement replaced with this one line ternary operator...
    }
}*/

public class SortListUsingComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(15);
        list.add(65);
        list.add(56);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(100);
        list.add(80);
        list.add(25);
        System.out.println(list);
      /*  Collections.sort(list, new MyComparator());
        System.out.println(list);*/

        // The above compare method can overrided using lambda expression

        Comparator<Integer> comp = (I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;

        Collections.sort(list,comp);
        System.out.print(list);
    }
}
