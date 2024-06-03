package com.java.Stream;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private long empId;
    private String name;
    private int age;
    private double salary;
    private String city;
    private String pincode;


    public Employee(long empId, String name, int age, double salary, String city, String pincode) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
        this.pincode = pincode;
    }

    public long getEmpId() {
        return empId;
    }
    public void setEmpId(long empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + ", city=" + city
                + ", pincode=" + pincode + "]";
    }
    
}
public class StreamUsedOnCollection {
    public static void main(String[] args) {
        List<Employee> listOfEmp = new ArrayList<>();
        listOfEmp.add(new Employee(101, "Biswajit Mahakud", 25, 30000, "Hyderabad", "785694"));
        listOfEmp.add(new Employee(102, "Aradhya", 24, 30000, "Hyderabad", "745896"));
        listOfEmp.add(new Employee(103, "Priyanka", 25, 35000, "Bangalore", "896745"));
        listOfEmp.add(new Employee(104, "Krishna", 23, 40000, "Chennai", "236547"));
        listOfEmp.add(new Employee(105, "Navjit", 24, 20000, "Bangalore", "569863"));
        listOfEmp.add(new Employee(106, "Dolagovinda", 26, 50000, "Chennai", "639857"));
        listOfEmp.add(new Employee(107, "Jayashree" ,  35, 25000, "Hyderabad", "589635"));
        listOfEmp.add(new Employee(108, "Smruti", 45, 10000, "Bangalore", "968745"));
        listOfEmp.add(new Employee(109, "Santosh", 23, 30000, "Pune", "547965"));


        //OK, so we have list of employees, and we need list of name of employees... see how to  do it using stream...
        /*
         * By using regular java method...
         */
        List<String> empNames = new ArrayList<>();
        for(Employee emp : listOfEmp){
            empNames.add(emp.getName());
        }
        System.out.println("Emp names using regular java method: " + empNames.toString());

        //By using stream api concept
        /*
         * Remember: Stream is a pipeline, we're using Stream api for process collection object...Stream is not a data structure...
         *  It cant hold object inside it... It just referes objects from the collection object....
         * Only one operation can be perfomed of any stream object of their entire life cycle... we can't use more than one stream pipeline operation on same stream object....
         * There are several methods are present to create Stream object...
         * 
         */
        /*
         * find the names of employees from the list...
         * Here map(), takes Function ... think carefully,
         * interface Function<T,R>{
         *      public R apply(T t);
         * }
         * map(), takes list of employee object, and perform operation and return employee names
         * those employee names are stored inside a Stream object,
         * when we call the terminal operation, the stream object converted to list...
         * where, listOfEmp = datasource
         *        stream().map(emp->emp.getName()) = intermediate operations
         *        .toList() = Terminal operation...
         * 
         * always remember that, which methods returns a stream object those are considered/involved in Intermediate operation and which are associate to produce collection object or print are called Terminal functions..
         */

        List<String> empName2 = listOfEmp.stream().map(emp-> emp.getName()).toList(); // the above 85-89 lines are kept inside a single line... This is the power of Stream api...
        System.out.println("Employees names using stream api: " + empName2.toString());

        //give me the cities of employees... which is distinct in nature...

        List<String> citiesOfEmp = listOfEmp.stream().map(emp->emp.getCity()).distinct().toList();
        System.out.println("Distinct cities name: " + citiesOfEmp.toString());
        
        //give me the name of employees whoose age is greater than 25...

        List<String> listOfEmpAgeIsGreater25 = listOfEmp.stream().filter(emp -> emp.getAge() > 25).map(emp -> emp.getName()).toList();
        System.out.println("List of employees whoose age is greater than 25: " + listOfEmpAgeIsGreater25.toString());

        //Filter employee list to print those employee name whoose age is less than 25 and salary is greater than 25000
        System.out.println("Employee name whoose age is less than 25 and salary is greater than 25000: ");
        listOfEmp.stream().filter(emp -> (emp.getAge()< 25 && emp.getSalary() > 25000))
                          .forEach(emp -> System.out.println(emp.getName()));

        System.out.println("Print name of employess who working in Hyderabad: ");
        List<String> empNameResidesInHyd = listOfEmp.stream().filter(emp-> emp.getCity().equals("Hyderabad")).map(emp-> emp.getName()).toList();
        System.out.println(empNameResidesInHyd);

        
    }
}
