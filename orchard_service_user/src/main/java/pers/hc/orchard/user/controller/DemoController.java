package pers.hc.orchard.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pers.hc.orchard.user.service.IDemoService;

import java.util.Random;

/**
 * Created by liujicheng on 2018/12/9.
 */
@RestController
public class DemoController {
    private static double ii= new Random().nextInt(10);

    @Autowired
    IDemoService demoService;

    @RequestMapping(value="/test",method = RequestMethod.GET)
//    @GetMapping(value="/test")
    public String getDemo(){
        //demoService.demoTest();
        return "this is user "+ii;
    }

}
