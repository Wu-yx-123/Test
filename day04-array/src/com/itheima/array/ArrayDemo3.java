package com.itheima.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int [] a={45,22,3,89,5,6,7,8,91,10};
        int max=test1(a);
        System.out.println("最大值为："+max);
    }
    public static int test1(int [] a) {
           int max=a[0];

        for (int i=0;i<a.length;i++){
            int score=a[i];
            if (score>max){
                max=a[i];
            }

        }
        return max;
    }
}
