package cn.extendtest;

public class Son extends Parent {
    int num = 10;

    public void methodSon() {
        System.out.println("这是子类的方法");

    }

    public void method() {
        System.out.println("重名父类的方法");
    }

    public void accessSvar(){
        System.out.println(num);
    }

    public void test(){
        int num = 100;
        System.out.println("局部变量-->"+num);
        System.out.println("子类变量-->"+this.num);
        System.out.println("父类变量-->"+super.num);
    }

}
