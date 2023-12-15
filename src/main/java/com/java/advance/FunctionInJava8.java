package com.java.advance;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;
    public Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }

}
public class FunctionInJava8 {
    public static void main(String[] args) {
        //return square of a number...
        Function<Integer,Integer> func = num-> num*num;
       int result =  func.apply(4);
       System.out.println(result);
       //return length of the string...
       Function<String,Integer> lengthStringFunc = str->str.length();
       System.out.println(lengthStringFunc.apply("durga software solution"));
       //return uppercase of given string...
        Function<String,String> uppercase = str->str.toUpperCase();
        System.out.println(uppercase.apply("durgasoftwaresolution"));

        //creating objects of student
        System.out.println("Printing student grades...");
        Student s1 = new Student("Ram",50);
        Function<Student,String> studentGrade =
                student -> (s1.marks>=80)?"Distinction":(s1.marks>=60)?"First Class":(s1.marks>=50)?"Second Class":
                        (s1.marks>=35)?"Third Class":"Failed";
        System.out.println(studentGrade.apply(s1));

        //another way to write above student grades code...
        System.out.println("Another way to Printing student grade ..........>>>>>>>>>>>");
        Function<Student,String> newStudentGrade = newStudent-> {
            int marks = newStudent.marks;
            String grade = "";
            if(marks>=80) grade = "A[Distinction]";
            else if(marks>=60) grade = "B[First Class]";
            else if(marks>=50) grade = "C[Second Class]";
            else if(marks>=35) grade = "D[Third Class]";
            else grade = "E[Failed]";
            return grade;
        };

        Student[] listOfStudent = {
                new Student("Ram",80),
                new Student("Suresh",65),
                new Student("Monoj",54),
                new Student("Managobinda",40),
                new Student("Bonu",25)
        };

        for(Student std : listOfStudent){
            System.out.println(std.name);
            System.out.println(std.marks);
            System.out.println(newStudentGrade.apply(std));
            System.out.println();
        }

        //print student whoose marks are greater than 60
        System.out.println("Students whoose have more than 60 marks: ");
        Predicate<Student> passedStudent = std -> std.marks>=60;
        for(Student std : listOfStudent){
            if(passedStudent.test(std)) {
                System.out.println("Student name: " +  std.name);
                System.out.println("Student marks : " + std.marks);
                System.out.println("Student standard: " + newStudentGrade.apply(std));
                System.out.println();
            }
        }
    }
}
