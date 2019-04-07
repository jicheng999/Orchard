package pers.hc.orchard.blog.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liujicheng on 2019/4/4.
 */

public class FeignConfig {

    public Contract feignContract() {
        return new Contract.Default();
    }

}
