package com.java.advance;
interface SecondTestInterf{
    public Test get(String str);
}
interface TestInterf{
    public Test interFunc();

}
class Test{
    Test(){
        System.out.println("Test class default constructor is called ..........Constructor reference");
    }
    Test(String str){
        System.out.println("Test class argumented constructor called..... ;and the value is: " + str );
    }
}
public class ConstructorReferenceImpl {

    public static void main(String[] args) {
        TestInterf i1 = Test :: new;
        Test t1 = i1.interFunc();//here interFunc() abstract method uses Test class constructor to execute...
        SecondTestInterf i2 = Test :: new;
        i2.get("Input Text...");
    }
}
