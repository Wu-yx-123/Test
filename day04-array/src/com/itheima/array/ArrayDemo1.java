package com.itheima.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
            test2();
    }
    public static void test1(){
        String [] a={"123","234","456"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void test2(){
        int [] a ={1,2,3,4,5,6,7};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
