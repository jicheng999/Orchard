package pers.hc.orchard.blog.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liujicheng on 2019/4/3.
 */
//@FeignClient(value = "user-server")
public interface SUserService {
    @RequestMapping(value="/userservice/test",method = RequestMethod.GET)
    String getDemo();
}
