package pers.hc.orchard.blog.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pers.hc.orchard.blog.config.FeignConfig;

/**
 * Created by liujicheng on 2019/4/3.
 */
@FeignClient(value = "user-server")
public interface SUserService {
    @RequestMapping(value="/userservice/test",method = RequestMethod.GET)
    String getDemo();
}
