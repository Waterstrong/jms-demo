package ws.demo.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import ws.demo.jms.message.Email;

@Component
public class MessageReceiver {
    @JmsListener(destination = "mailbox", containerFactory = "jmsListenerFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }
}
