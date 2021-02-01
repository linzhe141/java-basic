package cn.linzhe.javaapi;

import cn.linzhe.Person;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // <E> 表示泛型：也就是装在在集合当中的所有元素，全都是统一的类型
        // 注意泛型只能是引用类型，不能是基本类型
        // 打印ArrayList 实例得到的不是地址值，而是[],加上add的内容
        ArrayList<String> list = new ArrayList<>();
        list.add("淋着"); // add() 返回值是布尔值，表示是否添加成功
        list.add("IU");
        list.add("李至安");
        list.add("张满月");
        System.out.println(list);
        System.out.println("========");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("========");
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println("======");
        // ArrayList 存储基本数据类型
        // 因为泛型只能是引用类型，所以需要使用基本数据类型的包装类
        /*
         * byte      Byte
         * short     Short
         * int       Integer
         * long      Long
         * float     Float
         * double    Double
         * char      Character
         * boolean   Boolean
         * */

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
        System.out.println("============");

        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person("TEST1", 12));
        list3.add(new Person("TEST2", 12));
        list3.add(new Person("TEST3", 12));
        System.out.println(list3);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        System.out.println("===========");
        System.out.println(printArrayList(list2));
    }

    public static String printArrayList(ArrayList arraylist) {
        String result = "{";
        for (int i = 0; i < arraylist.size(); i++) {
            if (i != arraylist.size() - 1) {
                result += arraylist.get(i) + "@";
            } else {
                result += arraylist.get(i) + "}";
            }
        }
        return result;
    }


}
