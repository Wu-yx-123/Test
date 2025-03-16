package com.itheima.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
            test1();
    }
    public static void test1() {
        Scanner sc =new Scanner(System.in);
        double [] scores=new double[8];

        for (int i =0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生成绩");
            scores[i]=sc.nextDouble();

        }
        double sum=0;
        double max=scores[0];
        double min=scores[0];
        for (int i =0;i<scores.length;i++){
            sum+=scores[i];
            double score=scores[i];
            if (score>max){
                max=score;
            }
            if (score<min){
                min=score;
            }
        }
        System.out.println("最大成绩为："+max);
        System.out.println("最小成绩为："+min);
        System.out.println("平均成绩为："+sum/scores.length);

    }

}
