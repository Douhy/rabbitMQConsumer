package com.xiaodou.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queueZ")
public class FanoutListenerZ {

    @RabbitHandler
    public void getMsg(String msg){
        System.out.println("从queueZ队列中获取消息："+msg);
    }
}
