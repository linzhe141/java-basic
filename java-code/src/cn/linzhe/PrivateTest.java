package cn.linzhe;

public class PrivateTest {
    public static void main(String[] args) {
        PrivateDemo test = new PrivateDemo();
        test.name = "linzhe";

        // test.age = 18; // error 不能直接访问，
        test.setAge(18);
        System.out.println(test.name+test.getAge());
    }
}
