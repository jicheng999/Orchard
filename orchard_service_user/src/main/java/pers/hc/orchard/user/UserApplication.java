package pers.hc.orchard.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by liujicheng on 2019/3/13.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"pers.hc.orchard.user"})
@MapperScan(basePackages = {"pers.hc.orchard.user.dao"})
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
