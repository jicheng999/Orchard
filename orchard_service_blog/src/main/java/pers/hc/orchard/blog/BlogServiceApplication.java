package pers.hc.orchard.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by liujicheng on 2018/11/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"pers.hc.orchard.blog"})
@MapperScan(basePackages = {"pers.hc.orchard.blog.dao"})
@EnableFeignClients
@EnableDiscoveryClient
public class BlogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogServiceApplication.class,args);
    }

}
