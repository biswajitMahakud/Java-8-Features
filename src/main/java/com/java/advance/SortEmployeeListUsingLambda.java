package com.java.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FlipkartEmployee{
    private String empName;
    private int empId;
    public FlipkartEmployee(String name , int id){
        this.empName = name;
        this.empId = id;
    }
    public void setEmpName(String name){
        this.empName = name;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpId(int id){
        this.empId = id;
    }
    public int getEmpId(){
        return empId;
    }

    @Override
    public String toString(){
        return empId + ": " + empName;
    }
}
public class SortEmployeeListUsingLambda {
    public static void main(String[] args) {
        //sort employees using their id's ... we're going to use comparator interface
        List<FlipkartEmployee> list = new ArrayList<>();
        list.add(new FlipkartEmployee("Biswajit",24563));
        list.add(new FlipkartEmployee("Rahul",56934));
        list.add(new FlipkartEmployee("Aradhya",12658));
        list.add(new FlipkartEmployee("Soumya",39874));
        list.add(new FlipkartEmployee("Manjit",968745));
        list.add(new FlipkartEmployee("Kesav",45986));

        System.out.println(list);
        Collections.sort(list,(e1,e2)->(e1.getEmpId()<e2.getEmpId())?-1:(e1.getEmpId()>e2.getEmpId())?1:0);

        System.out.println(list);
        //sort employees using their name alphabetical order...

        Collections.sort(list,(e1,e2)-> e1.getEmpName().compareTo(e2.getEmpName()) );
        System.out.println(list);

    }
}
