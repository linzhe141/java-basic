package JAVA;

public class Variable {
    public static void main(String[] args){
        int num1;
        num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
        System.out.println(System.out);
        int val = 400;
        System.out.println(val);
        float value = 2.5F;
        System.out.println(value);
        double x = 2.4;
        System.out.println(x);
        char s = 'A';
        System.out.println(s);
        boolean flag = true;
        System.out.println(flag);


        // int num2;
        // System.out.println(num2); 未赋值报错
        
        {
            int num3 = 6;
            System.out.println(num3);
        }
        // System.out.println(num3); 超出作用域报错
        int num3 = 5;
        System.out.println(num3); 

        
    }
}