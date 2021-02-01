package cn.linzhe.javabean;
/*
* 标准的类包含
* 1、所有成员变量都要使用private关键字进行修饰
* 2、为每一个成员变量写一对getter/setter方法
* 3、编写一个无参的构造方法
* 4、编写一个有参数构造方法
*
* 一个标准的类也叫做 Java Bean
* */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
