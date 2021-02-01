package cn.linzhe;

/*
* 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用
*
* 1、导包
*   格式 import 包名称.类名称;
*   import cn.linzhe.Student;
*   对于和当前类属于同一个包的情况下，可以省略导包语句
*
* 2、创建
* 格式 类名称 对象名 = new 类名称();
*     Student stu = new Student();
* 3、使用
* */
public class StudentDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name); // null
        System.out.println(stu.age);  // 0
        stu.name = "linzhe";
        stu.age = 18;
        System.out.println("=======");
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
    }
}
