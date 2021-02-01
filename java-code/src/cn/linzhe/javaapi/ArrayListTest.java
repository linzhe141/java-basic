package cn.linzhe.javaapi;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int x = new Random().nextInt(11);
            list.add(x);
        }
        System.out.println(list);
        System.out.println(getSamllList(list));
    }

    public static ArrayList<Integer> getSamllList(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
