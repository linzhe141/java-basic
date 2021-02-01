package cn.linzhe;

public class OverloadDemo {
    public static void main(String[] args) {
        byte val1 = 10;
        byte val2 = 10;
        System.out.println(isSame(val1,val2));

        int val3 = 10;
        int val4 = 20;
        System.out.println(isSame(val3,val4));

        long val5 = 10L;
        long val6 = 10L;
        System.out.println(isSame(val5,val6));
    }

    public static boolean isSame(byte x, byte y){
        return x == y;
    }

    public static boolean isSame(int x, int y){
        return x == y;
    }

    public static boolean isSame(long x, long y){
        return x == y;
    }
}
