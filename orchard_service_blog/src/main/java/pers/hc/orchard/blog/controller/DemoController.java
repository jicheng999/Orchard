package pers.hc.orchard.blog.controller;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.core.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;
import pers.hc.orchard.blog.entity.Demo;
import pers.hc.orchard.blog.service.IDemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujicheng on 2018/12/9.
 */
@Controller
@RequestMapping(value="/demo")
public class DemoController {
    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    IDemoService demoService;

//    @Autowired
//    SUserService userService;

    @Autowired
    RedisTemplate<String, Object> redisTemplate;


    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    public String getDemo(){
        return JSON.toJSONString(demoService.demoTest());
    }

//    @RequestMapping(value="/userService",method = RequestMethod.GET)
//    @ResponseBody
//    public String getUserService(){
//        return userService.getDemo();
//    }

    @RequestMapping(value="/thymeleafTest",method = RequestMethod.GET)
    public String getDemoTemplate(Model model){
        List<Demo> demos=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Demo demo=new Demo();
            demo.setId(Long.valueOf(i));
           // demo.setDemo("demo" + i);
            demos.add(demo);
        }

        model.addAttribute("demos",demos);
        return "demo/demo";
    }


    @RequestMapping(value="/acceptMq",method = RequestMethod.GET)
    @ResponseBody
    public String acceptMq(){

        return "";
    }


    @RequestMapping("/redisTest")
    @ResponseBody
    public String redisTest() {
        logger.info("进入controller redisTest.......");
         String token = (String) redisTemplate.opsForValue().get("token");
        if (StringUtils.isEmpty(token)) {
            logger.info("判断token为空了");
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String newToken = UuidUtil.getTimeBasedUuid().toString();
            logger.info("产生了新的token : {}",newToken);
            redisTemplate.opsForValue().set("token", "token");
        }
        return "done";
    }


}
