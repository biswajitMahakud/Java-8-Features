package com.java.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HeroinNameSorting {
    public static void main(String[] args) {
        ArrayList<String> actress = new ArrayList<>();
        actress.add("AAA");
        actress.add("AAAA");
        actress.add("AA");
        actress.add("A");
        actress.add("AAAAA");
        actress.add("AAA");
        Comparator<String> c = (str1,str2)-> {
            int len1 = str1.length();
            int len2 = str2.length();
            int i = (len1 < len2) ? -1 : (len1 > len2) ? 1 : 0;
            return i;
        };
        System.out.println("Before sorting: " + actress);
        List<String> sortedList= actress.stream().sorted(c).collect(Collectors.toList());
        System.out.println("After sorting: " + sortedList);

        //System.out.println(actress.get(0).compareTo(actress.get(1)));
    }
}
