package pers.hc.orchard.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pers.hc.orchard.blog.api.SUserService;
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

    @Autowired
    IDemoService demoService;

    @Autowired
    SUserService userService;

    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    public String getDemo(){
        demoService.demoTest();
        return "this is blog1";
    }

    @RequestMapping(value="/userService",method = RequestMethod.GET)
    @ResponseBody
    public String getUserService(){
        return userService.getDemo();
    }

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


}
