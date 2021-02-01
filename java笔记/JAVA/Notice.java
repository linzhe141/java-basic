package JAVA;
/** 
 * 对于byte/short/char/三种类型来说，右侧赋值的数值没有超过其范围
 * 那么javac编译器则会自动隐式地为2哦们补上一个(byte)(short)(char)
 * 
 * 1、如果没有超过左侧的范围，编译器补上强转
 * 2、如果右超过了左侧范围，那么编译器报错
 * 
 * 
 * 编译器常量优化
 * 在给变量进行赋值的时候，如果右侧的表达式中，全是常量，没有任何变量
 * 那么编译器javac将会直接将若干个常量表达式计算出结果   编译的时候，直接运算出结果
 * short result = 6 + 6; // 全是常量，则编译后的.class 字节码文件中
 * 直接存的是 short result = 12 没有报错
 * 
 * 一旦有变量则不会进行常量优化
 * 
*/
public class Notice {
    public static void main(String[] args){

        /**
         *  右侧确实是一个int，但是没有超过范围，则是正确的
         * int --> byte
         * 大  --> 小 ，不是自动类型转换
         *  */ 
        byte num1 = 30;
        System.out.println(num1);

        // byte num2 = 128; //报错，超过范围

        /**
         *  右侧确实是一个int，但是没有超过范围，则是正确的
         * int --> char
         * 大  --> 小 ，不是自动类型转换
         *  */ 
        char zifu = 65; // A
        System.out.println(zifu);

        short val1 = 10;
        
        short a = 5;
        short b = 5;

        // short + short --> int + int -->int
        // short result = a+b; //报错

        // 常量优化 相当于 short result = 10;
        short result = 5+5;

    }
}