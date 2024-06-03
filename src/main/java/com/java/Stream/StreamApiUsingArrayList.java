package com.java.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class StreamApiUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        //Filter concept......
        //System.out.println("After adding elements: "+list);
        //List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        //System.out.println("After filtering elements of even no: "+evenList);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(200);
        newList.add(100);
        newList.add(250);
        newList.add(300);
        newList.add(350);
        //map concept....
        System.out.println("After adding elements: "+newList);
        List<Integer> updatedMarks = newList.stream().map(i-> i+50).collect(Collectors.toList());
        System.out.println("After filtering elements by incrementing their marks: "+updatedMarks);



    }
}
