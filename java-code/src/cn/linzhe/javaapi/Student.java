package cn.linzhe.javaapi;

public class Student {
    private int id;
    private String name;
    private int age;
    /*
     * 如果一个成员变量使用了static关键字，那么这个变量不在属于对象自己，而是属于所在的类，多个对象共享同一份数据
     * */
    static String room;
    static int idCount= 1;

    public Student() {
        this.id = idCount++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idCount++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
