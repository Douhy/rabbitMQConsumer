package com.xiaodou.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue1")
public class DirectListener {

    /**
     * 从队列中获取到数据后执行业务逻辑
     * @param msg
     */
    @RabbitHandler
    public void getMsg(String msg){
        System.out.println("从queue1队列中获取到数据："+msg);
    }

}
