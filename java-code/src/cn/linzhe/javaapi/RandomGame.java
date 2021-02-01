package cn.linzhe.javaapi;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        int r = new Random().nextInt(11); // 0~10


        while (true) {
            System.out.println("请输入");
            int x = new Scanner(System.in).nextInt();
            if (x>r) {
                System.out.println("过大");
            } else if(x<r){
                System.out.println("过小");
            } else {
                System.out.println("BINGO!!");
                break;
            }

        }

    }
}
