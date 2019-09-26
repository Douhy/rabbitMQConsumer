package com.xiaodou.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queueX")
public class FanoutListenerX {

    @RabbitHandler
    public void getMsg(String msg){
        System.out.println("从queueX队列中获取消息："+msg);
    }
}
