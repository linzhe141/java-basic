package cn.linzhe.javaapi;
/*
* 字符串特点：
*   1、字符串内容用不可变
*   2、字符串因为不可变，所以是共享的
*   3、字符串效果上相当于是char[] 字符数组，底层是byte[]数组
*
*
* 创建字符串的 3+1 方式
*   构造方法没有返回类型*
*   1、public String() : 空字符串
*   2、public String(Char[] array) : 根据字符数组内容创建字符串
*   3、public String(Byte[] array) : 根据字节数组内容创建字符串
*
*   4、 String str = "fdasfasd" : 直接创建
* */
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] arr1 = {'A','B','C'};
        String s2 = new String(arr1);
        System.out.println(s2);

        byte[] arr2 = {97,98,99};
        String s3 = new String(arr2);
        System.out.println(s3);

        /*
        * 字符串常量池: 程序当中直接写上双引号的字符串，之间存储在常量池中
        *
        * 对于基本类型 == 进行数值的比较
        * 对于引用类型 == 进行地址值的比较
        * */
        String str1 = "abc";
        String str2 = "abc";
        char[] carr = {'a','b','c'};
        String str3 = new String(carr);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false


        System.out.println("===========");
        /*
        * public boolean equals(Object obj): 参数可以是任何对象
        * */
        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str1)); // true
        System.out.println(str1.equals(str3)); // true

        System.out.println("abc".equals(str3)); // true // 推荐这个写法
        System.out.println(str1.equals("abc")); // true // 不推荐这个写法 当str1为null时，会出现空指针异常
        String str4 = "ABC";
        System.out.println(str4.equalsIgnoreCase(str1)); // true 忽略大小写进行内容比较

        System.out.println("==============");
        String strs = "fasdffffff";
        System.out.println(strs.length());
        String strs1 = "Hello";
        String strs2 = "World";
        String strs3 = strs1.concat(strs2);
        System.out.println(strs1); // Hello 字符串是不可改变的
        System.out.println(strs2); // World
        System.out.println(strs3); // HelloWorld
        char s = strs.charAt(1);
        System.out.println(s); // 'a' 字符
        System.out.println(strs.indexOf("sd")); // 2 没有出现则返回-1


    }
}
