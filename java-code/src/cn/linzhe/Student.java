package cn.linzhe;
/**
 *
 * 类是一个抽象的模板
 * 包含属性和行为
 *
 * 成员变量（属性）
 *  String name;
 *  int age;
 * 成员方法（行为）
 *  public void eat(){} 对比普通的方法去掉static 关键字（静态方法是类方法不是成员方法）
 *
 * 注意事项
 * 1、成员变量是直接定义在类当中的，在方法外边
 * 2、成员方法不要写static关键字
 *
 */
public class Student {
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭！！！");
    }
}
