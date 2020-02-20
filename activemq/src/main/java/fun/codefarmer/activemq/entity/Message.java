package fun.codefarmer.activemq.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * message 对象要网络传输 需要实现 序列化 Serializable
 * @ @ClassName Message
 * @ Descriotion TODO
 * @ Author admin
 * @ Date 2020/2/20 17:26
 **/
public class Message implements Serializable {
    private String content;
    private Date sendDate;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", sendDate='" + sendDate + '\'' +
                '}';
    }
}
