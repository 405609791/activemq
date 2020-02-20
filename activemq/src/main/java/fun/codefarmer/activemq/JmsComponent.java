package fun.codefarmer.activemq;

import fun.codefarmer.activemq.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * 定义消息手法的方法
 * @ @ClassName JmsComponent
 * @ Descriotion TODO
 * @ Author admin
 * @ Date 2020/2/20 16:51
 **/
@Component
public class JmsComponent {
    /**
     * 引入自动化配置之后，配置好的jms消息模板
     * 直接调用模板方法就可以发送消息
     * redisTemplate、JDBCTemplate、JmsTemplate
     */
    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    Queue queue;

    //调用这个方法发消息（消息生产者）
    public void send(Message message) {
        /**
         * 参数一：队列
         * 参数二：message对象
         */
        jmsMessagingTemplate.convertAndSend(this.queue,message);
    }

    //收消息（消息消费者）
    //前面定义的消息队列的名字
    @JmsListener(destination = "hello.codefarmer")
    public void receive(Message message) {
        System.out.println(message);
    }

}
