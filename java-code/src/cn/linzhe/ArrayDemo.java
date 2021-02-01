package cn.linzhe;
/*
* 数组特点：
*   1、引用数据类型
*   2、数组元素，类型必须一致
*   3、数组长度在程序运行时，不可改变
*
* 动态初始化 指定长度
*   数据类型[] 数组名称 = new 数据类型[数组长度];
*
* 静态初始化 指定元素
*   数据类型[] 数组名称 = new 数据类型[] {元素1,元素2...};
*   省略格式
*   数据类型[] 数组名称 = {元素1,元素2...}
* */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[100];

        double[] arr2 = new double[10];

        String[] arr3 = new String[10];

        String[] arra = new String[] {"Hello","World","Java"};

        int[] s = {1,2,3};

        int[] testarr1;
        testarr1 = new int[3];

        int[] testarr2;
        testarr2 = new int[] {1,3,5};


//      省略模式 不可拆分
//      int[] b;
//      b = {1,2,4};

        int[] list = new int[] {1,2,4,5,6};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        System.out.println("========");
        int[] list1 = {1222222,2,4,100};
        int max = list1[0];
        for (int i = 0; i < list1.length; i++) {
            if(list1[i]> max){
                max = list1[i];
            }
        }
        System.out.println("最大值--->"+max);
    }
}
