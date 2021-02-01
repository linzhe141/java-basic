package cn.linzhe;

public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("linzhe",18);

        System.out.println(p2.getName());
        System.out.println(p2.getAge());

    }
}
