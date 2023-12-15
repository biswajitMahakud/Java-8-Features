package com.java.collection;

public class ResizableArray {
    int size = 10;
    int[] arr = new int[size];
    int index = 0;

    public void add(int num) {
        if (index == size) {
            // Resize the array
            size += 10;
            int[] newArr = new int[size];
            // Copy elements from the old array to the new array
            System.arraycopy(arr, 0, newArr, 0, index);
            arr = newArr;
        }
        arr[index] = num;
        index++;
    }

    public static void main(String[] args) {
        ResizableArray array = new ResizableArray();

        for (int i = 0; i < 100; i++) {
            array.add(i + 10);
        }
        System.out.print("[ ");
        for (int i = 0; i < array.index; i++) {
            System.out.print(  array.arr[i] + ",");
        }
        System.out.print("] ");
    }
}
