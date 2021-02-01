package JAVA;

public class Plus {
    /**
     * 单独使用时  前++和后++ 没有区别
     * 混合使用时  前++ 立马加1 先加后用
     *           后++ 先使用原先的值再加1 先用后加
     * 
     *   */ 
    
    public static void main(String[] args){
        int val = 10;
        val++;
        System.out.println(val); // 11
        ++val;
        System.out.println(val); // 12
        
        System.out.println("===========");
        int val2 = 20;
        System.out.println(val2++); // 20
        System.out.println(val2); // 21

        System.out.println("===========");
        int val3 = 30;
        System.out.println(++val3); // 31
        System.out.println(val3); // 31

        System.out.println("===========");
        int result = 3>2 ? ((int) 2.5) : 10; // 错误写法 必须满足左侧数据类型要求
        System.out.println(result);
    }
} 