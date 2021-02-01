package cn.linzhe.javaapi;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        // System.in 表示从键盘输入
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 从键盘获取int整数
        System.out.println("输入的整数是" + num);

        String str = sc.next();
        System.out.println("输入的字符串是" + str);

        System.out.println("===========");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println("val1+val2=" + (val1 + val2));


        System.out.println("=========");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = num1 > num2 ? num1 : num2;

        max = max > num3 ? max : num3;
        System.out.println("max---->" + max);

    }

}
