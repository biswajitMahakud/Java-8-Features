package com.java.advance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
class Employee{
    private String name;
    private int age;
    private int salary;

    public Employee(String name , int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "studentName: " + this.name + " age: " + this.age + " sid: " + this.salary;
    }

}
public class SalaryComparisionUsingPredicae {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Biswajit",23,30000));
        employees.add(new Employee("Durga",33,140000));
        employees.add(new Employee("Manish",53,80000));
        employees.add(new Employee("Suresh",43,60000));
        employees.add(new Employee("Dilip",33,20000));

        Predicate<Employee> employeePredicate = emp -> emp.getSalary()>30000 ;

        for(Employee emp : employees){
            if(employeePredicate.test(emp))
                    System.out.println(emp.getName() + " :" + emp.getSalary());
        }
    }
}
