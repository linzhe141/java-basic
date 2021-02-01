package cn.linzhe;

/*
* 注意事项
* 1、构造方法的名称必须和所在类名称完全一样，大小写一必须一样
* 2、构造方法不要写返回值类型，连void都不写
* 3、构造方法不能return一个具体的返回值
* 4、如果没写构造方法，编译器会默认写一个构造方法
*   public Person(){}
* 5、一旦写了至少一个构造方法，那么编译器不在赠送
* 6、构造方法也可以进行重载
* */
public class Person {
    // 成员变量
    private String name;
    private int age;

    // 构造方法
    public Person(){
        System.out.println("无参数的构造方法");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("有参数的构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

