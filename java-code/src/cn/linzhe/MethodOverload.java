package cn.linzhe;

/*
 * 方法的重载，多个方法名称相同，但是参数列表不一样
 *
 * 方法重载于下列因素相关
 *  1、参数个数不同
 *  2、参数类型不同
 *  3、参数多类型顺序不同
 *
 * 方法的重载鱼虾类因素无关
 *  1、与参数名称无关
 *  2、与方法的返回值类型无关
 *
 * */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20.0));
        System.out.println(sum(10.0,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // 与参数类型相关
    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    // 与多类型顺序相关
    public static int sum(double a, int b) {
        return (int) (a + b);
    }

//    public static int sum(int x, int y) { // 与参数名称无关
//        return x + y;
//    }

//    public static double sum(int a, int b){ // 与返回值类型无关
//        return a+b;
//    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
