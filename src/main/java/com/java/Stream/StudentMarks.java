package com.java.Stream;

import java.util.stream.*;
import java.util.*;
public class StudentMarks
{
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(35);
        marks.add(45);
        marks.add(25);
        marks.add(15);
        marks.add(65);
        marks.add(85);
        List<Integer> passedStudent =  marks.stream().filter(i->i>=30).collect(Collectors.toList());
        System.out.println("All Student marks: " + marks);
        System.out.println("Passed Students marks: "+ passedStudent);
        List<Integer> marksIncrement = marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println("After graced Students marks: "+ marksIncrement);

        Long noOfStudentPassed = passedStudent.stream().count();
        System.out.println("Count of no. of student passed :" + noOfStudentPassed);

        //I just want to get list in sorted order

        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted marks: " + sortedMarks);

    }

}