package com.java.advance;

import java.util.ArrayList;
import java.util.function.BiFunction;

class InfosysEmployee{
    public int eno;
    public String name;

    public InfosysEmployee(int eno, String name){
        this.eno = eno;
        this.name = name;
    }

}
public class BiFunctionImpl {
    public static void main(String[] args) {
        ArrayList<InfosysEmployee> list = new ArrayList<>();
        BiFunction<Integer,String,InfosysEmployee> p = (eno,name)-> new InfosysEmployee(eno,name);
        list.add(p.apply(100,"Rahul"));
        list.add(p.apply(101,"Smita"));
        list.add(p.apply(102,"Ahalya"));
        list.add(p.apply(103,"Monoj"));

        for(InfosysEmployee e : list){
            System.out.println("Employee Id :" + e.eno);
            System.out.println("Employee name :" + e.name);
            System.out.println();
        }

    }
}
