package cn.linzhe.javaapi;

public class StaticMethod {
    /*
    * 一旦使用了static关键字修饰成员方法后，那么这个方法就变成静态方法
    * 静态方法不属于对象，而是属于类
    *
    * 如果没有static关键字，那么必须创建对象，才能使用方法
    * 如有有了static关键字，那么可以通过类去使用该方法
    *
    * 推荐写法
    * 静态变量：类名称.静态变量
    * 静态方法：类名称.静态方法()
    * 虽然也可以通过对象去使用静态方法和静态变量，
    * 但是不推荐，因为javac在编译时还是通过类去调用的
    *
    * 静态不能访问非静态
    * 静态方法中不能使用this，因为this代表调用的对象，
    * 而静态方法是通过类调用的，不是通过实例化对象调用的
    * */
    int age;// 成员变量
    static String room; // 静态变量

    /*
    * 静态代码块
    * static {
    *   //静态代码块的内容
    * }
    * 特点：当第一次用到本类时，静态代码块执行唯一的一次
    * 静态内容总是优先于非静态，所以静态代码块比构造方法先执行
    * */

    static {
        System.out.println("静态代码块内容！！！");
    }

    public StaticMethod() {
        System.out.println("构造方法");
    }

    public void method(){
        System.out.println("成员方法");
        System.out.println(age); // 成员方法可以访问静态和非静态
        System.out.println(room);
    }

    public static void staticMehtod(){
        System.out.println("静态方法");
        System.out.println(room);
        //System.out.println(age);// error age是非静态 不能访问
    }
}