package pers.hc.orchard.user.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pers.hc.orchard.user.entity.Demo;
import pers.hc.orchard.user.service.IDemoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by liujicheng on 2018/12/9.
 */
@RestController
public class DemoController {
    private static double ii = new Random().nextInt(10);

    @Autowired
    IDemoService demoService;

    @Autowired
    private AmqpTemplate mQtemplate;



    @RequestMapping(value = "/test", method = RequestMethod.GET)

    //    @GetMapping(value="/test")
    public String getDemo() {
        demoService.demoTest();
        return "this is user " + ii;
    }

    @RequestMapping(value = "/sendMq", method = RequestMethod.GET)
    public String sendMq() {
        //demoService.demoTest();
        List<Demo> demos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Demo item = new Demo();
            item.setId(Long.valueOf(i));
            item.setDemo("address" + i);
            demos.add(item);
        }
        demos.forEach(item -> mQtemplate.convertAndSend("testQuere", item.toString()));
        return "send to MQ success queue name is testQuere";
    }




}
