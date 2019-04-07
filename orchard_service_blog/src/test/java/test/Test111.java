package test;

import java.util.HashMap;

/**
 * Created by liujicheng on 2018/12/19.
 */
public class Test111 {

    public static void main(String[] args) {
        //test11();

        while (true){
            new Thread(()->{while(true){}}).start();
        }
    }

    public static void test11(){
        HashMap<String,String> testMap=new HashMap<>(16);
        testMap.put("","");

//        System.out.print(-2>>>1);
//        System.out.println(Integer.MAX_VALUE);

//        System.out.println(-2&0b000);

        System.out.println(3>>1);
        System.out.println(-3>>1);
    }
}
