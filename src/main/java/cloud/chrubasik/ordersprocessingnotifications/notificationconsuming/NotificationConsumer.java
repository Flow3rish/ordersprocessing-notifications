package cloud.chrubasik.ordersprocessingnotifications.notificationconsuming;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class NotificationConsumer {
    
    @JmsListener(destination = "${message.destination}")
    @Transactional
    public void consumeMessage(@Payload String payload) {
        System.out.println("Simple message " + payload);
    }
}
