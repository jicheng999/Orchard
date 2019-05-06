package pers.hc.orchard.blog.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liujicheng on 2019/5/7.
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue chatMessageQueue(){
        return new Queue("testQuere");
    }
}
