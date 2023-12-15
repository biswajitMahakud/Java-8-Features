package com.java.advance;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class IbmEmployee{

    public String name;
    public double salary;

    public IbmEmployee( String name , double salary){
        this.salary = salary;
        this.name = name;
    }

}
public class BiConsumerImpl {
    public static void main(String[] args) {
        ArrayList<IbmEmployee> list = new ArrayList<>();
        BiConsumer<IbmEmployee,Double> consumer = (emp,salary)->emp.salary += salary;
        addIbmEmployee(list);
        //increment employees salary
        for(IbmEmployee e : list){
            consumer.accept(e,500.0);
        }

        //Final incremented employees salary
        System.out.println("Incremented salary by 500:-------------------- ");
        for(IbmEmployee e : list){
            System.out.println("Employee name: " + e.name);
            System.out.println("Employee salary: " + e.salary);
            System.out.println();
        }

    }
    public static void addIbmEmployee(ArrayList<IbmEmployee> list){
        list.add(new IbmEmployee("Durga",20000.0));
        list.add(new IbmEmployee("Rahul",30000.0));
        list.add(new IbmEmployee("Swati",35000.0));
        list.add(new IbmEmployee("Monoj",40000.0));
    }
}
