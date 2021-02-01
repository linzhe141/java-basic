package cn.extendtest;

public class TestMain {
    public static void main(String[] args) {
        Son son = new Son();
        son.methodParent();
        son.methodSon();
        System.out.println(son.num); //  优先用子类的成员变量10
        System.out.println("========");
        son.test();
        System.out.println("======");
        son.accessSvar(); // 10
        son.accessPvar(); // 1
    }
}
