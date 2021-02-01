package cn.linzhe.javaapi;

import cn.linzhe.Person;

public class ArrayTest {

    public static void main(String[] args) {
        Person[] arr = new Person[3];
        Person p1 = new Person("linzhe",18);
        Person p2 = new Person("iu",18);
        Person p3 = new Person("zhian",18);
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        System.out.println("=========");
        System.out.println(arr[0].getName());
        System.out.println(arr[1].getName());
        System.out.println(arr[2].getName());

    }
}
