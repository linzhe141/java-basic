package cn.linzhe.javaapi;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println(r.nextInt()); // int 范围的随机数

        System.out.println(r.nextInt(10)); // [0,10)之间的随机数int类型就是 0~9

    }
}
