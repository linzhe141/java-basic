package cn.linzhe.javaapi;

public class StudetTest {

    public static void main(String[] args) {
        Student s1 = new Student("淋着",18);
        s1.room = "高2016二班";
        System.out.println("s1.name:"+s1.getName()+"s1.age:"+s1.getAge());
        System.out.println(s1.room);
        System.out.println(s1.getId());
        System.out.println("============");
        Student s2 = new Student("IU",18);
        System.out.println("s2.name:"+s2.getName()+"s2.age:"+s2.getAge());
        System.out.println(s2.room);
        System.out.println(s2.getId());
    }
}
