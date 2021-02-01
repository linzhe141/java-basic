package cn.extendtest;

public class Parent {
    int num = 1;
    public void methodParent(){
        System.out.println("这是父类的方法");
    }

    public void method(){
        System.out.println("重名父类的方法");
    }

    public void accessPvar(){
        System.out.println(num);
    }
}
