package pers.hc.orchard.blog.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by liujicheng on 2019/5/7.
 */
@Component
public class DemoReceiver {

    Logger logger = LoggerFactory.getLogger(DemoReceiver.class);

    @RabbitListener(queues="testQuere")    //监听器监听指定的Queue
    public void receiverDemo(String str) {
        logger.info("接收到mq消息:{}",str);
    }
}
