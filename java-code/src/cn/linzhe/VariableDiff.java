package cn.linzhe;
/*
* 局部变量和成员变量 diff
* 1、定义位置不同
* 成员变量：定义在类当中，方法外
* 局部变量：定义在方法中
*
* 2、作用于不一样
* 成员变量：整个类都可以使用
* 局部变量：只有在方法当中才能使用，除了方法外就不能使用
*
* 3、默认值不一样
* 成员变量：有默认值
* 局部变量：没有默认值
*
*
* */
public class VariableDiff {

    String name; //成员变量

    public void methodA(){
        int age = 20; // 局部变量
        System.out.println(age);
    }

    public void  methodB(){
//        int num;
//        System.out.println(num);//报错，必须赋值(初始化)
    }
}
