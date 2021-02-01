package JAVA;
/* 
当数据类型不一样时，将会发生数据转换

自动类型转换：（隐式）
    1、特点： 代码不需要进行特殊处理，自动完成
    2、规则： 数据范围从小到大
强制类型转换：（显式）
    1、特点： 代码需要进行特殊处理，不能自动完成
    2、格式： 范围小的类型 范围小的变量名 = (范围小的类型) 范围大的数据
    3、注意事项： 可能导致数据精度丢失，数据溢出
                byte/short/char这三种类型在计算时，都会首先提升为int类型，然后在做计算
                boolean类型不能发生数据类型转换
    */ 
// 数据类型转换类
public class DataConversion {
    public static void main(String[] args){
        /* 
        int->long
        从小到大
        */
        long num1 = 100;
        System.out.println(num1);
        /* 
        float->double
        从小到大
        */
        double num2 = 3.14F;
        System.out.println(num2);
        /* 
        long->float
        从小到大
        虽然long是8个字节，float是4个字节，但是flaot表示范围比long更广
        */
        float num3 = 100L;
        System.out.println(num3);

        /* 
        long->int
        从大到小
        */
        int num4 = (int) 1000L;
        System.out.println(num4);

         /* 
        double->int
        从大到小
        数据精度丢失
        */
        int num5 = (int) 3.99;
        System.out.println(num5); // 3   所有的小数位都会被舍弃掉，不是四舍五入

         /* 
        long->int
        从大到小
        数据精度丢失
        */
        int num6 = (int) 6000000000L;
        System.out.println(num6); // 1705032704   数据溢出

        char zifu1 = 'A';
        System.out.println(zifu1 + 1); // 66

        byte val1 = 40;
        byte val2 = 50;
        // byte + byte --> int + int -->int
        int result1 = val1 + val2;
        System.out.println(result1);
        short val3 = 60;
        short result2 = (short) (val1 + val3); // 100
        System.out.println(result2);

        System.out.println(100/3);
        
    }
}