package pers.hc.orchard.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liujicheng on 2019/3/13.
 */
@SpringBootApplication(scanBasePackages = {"pers.hc.orchard.user"},exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = {"pers.hc.orchard.user.dao"})
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
