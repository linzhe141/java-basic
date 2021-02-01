package cn.linzhe;

public class Methods {
    public static void main(String[] args) {
        printRect();
        System.out.println(add(10, 20));
        System.out.println(isSame(10, 20));
        System.out.println(isSame(20, 20));
        System.out.println(sumHadred());
    }

    public static void printRect() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int add(int n, int m) {
        return n + m;
    }

    public static boolean isSame(int n, int m) {
        return n == m;
    }

    public static int sumHadred() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }
}
