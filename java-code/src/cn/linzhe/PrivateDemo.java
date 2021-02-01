package cn.linzhe;
/*
* 面向对象的三大特性：封装，继承，多态
* 封装包括
* 1、方法
* 2、关键字private
*
* 使用private关键字可以对*成员变量*进行修饰
* 一旦使用private进行修饰，只有本类才能访问(就是通过.的形式)
*
* 如果要访问private的成员变量，可以通过Getter/Setter
* */
public class PrivateDemo {
    String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
