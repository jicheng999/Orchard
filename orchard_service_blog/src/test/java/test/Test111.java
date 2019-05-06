package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import pers.hc.orchard.blog.BlogServiceApplication;
import pers.hc.orchard.blog.entity.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujicheng on 2018/12/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test111 {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;


//    public static void main(String[] args) {
//        //test11();
//
//        while (true){
//            new Thread(()->{while(true){}}).start();
//        }
//    }
//
//    public static void test11(){
//        HashMap<String,String> testMap=new HashMap<>(16);
//        testMap.put("","");
//
////        System.out.print(-2>>>1);
////        System.out.println(Integer.MAX_VALUE);
//
////        System.out.println(-2&0b000);
//
//        System.out.println(3>>1);
//        System.out.println(-3>>1);
//    }

    @Test
    public void test11(){
        List<Demo> demoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Demo demo=new Demo();
            demo.setId(Long.valueOf(i));
            demo.setUsername("username"+i);
            demoList.add(demo);
        }
        redisTemplate.opsForValue().set("demoList", demoList);
        System.out.println("11111");
    }
}
