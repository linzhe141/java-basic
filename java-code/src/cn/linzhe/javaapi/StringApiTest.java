package cn.linzhe.javaapi;

public class StringApiTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.substring(1)); // ello
        System.out.println(s1.substring(1, 2)); // e
        System.out.println("=======");
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("=======");
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("========");
        System.out.println(s1.replace("e", "3")); // H3llo
        System.out.println("========");
        String s2 = "aaa,bbb,ccc,d";
        String[] splitarr = s2.split(",");
        for (int i = 0; i < splitarr.length; i++) {
            System.out.println(splitarr[i]); // aaa  bbb  ccc d
        }
        System.out.println("========");
        String s3 = "aaa.bbb.ccc.d";
        String[] splitarr1 = s3.split("\\."); // 正则需要转义
        System.out.println(splitarr1.length);
        for (int i = 0; i < splitarr1.length; i++) {
            System.out.println(splitarr1[i]); // aaa  bbb  ccc d
        }
        System.out.println("========================");
        System.out.println(foo(new int[]{1,2,3}));
    }

    public static String foo(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                result += "world" + arr[i] + "#";
            } else {
                result += "world" + arr[i];
            }
        }
        result += "]";
        return result;

    }
}
