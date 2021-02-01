package cn.linzhe;


import java.util.Arrays;

public class SwitchArray {
    public static void main(String[] args) {
        int[] list = {1, 3, 4, 5, 6, 7};
        int temp;
        int len = list.length - 1;
        for (int i = 0; i < list.length / 2; i++) {
            temp = list[i];
            list[i] = list[len - i];
            list[len - i] = temp;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("==========");

        int[] list1 = {1, 2, 3, 4, 5, 6};
        for (int min = 0, max = list1.length - 1; min < max; min++, max--) {
            int temp1 = list1[min];
            list1[min] = list1[max];
            list1[max] = temp1;
        }
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }

        System.out.println("调用方法，打印数组----->");
        printArray(list1);
        System.out.println("调用calculate方法---->");
        printArray(calculate(10, 20, 30));

        System.out.println("Array.toString方法");
        System.out.println(Arrays.toString(list1));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] result = {sum, avg};
        return result;
    }
}
