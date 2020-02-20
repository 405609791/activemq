package fun.codefarmer.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class ActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqApplication.class, args);
    }

    /**
     * 这个可以单独设置Bean的配置类
     * @return
     */
    @Bean
    Queue queue() {
        return new ActiveMQQueue("hello.codefarmer");
    }

}
