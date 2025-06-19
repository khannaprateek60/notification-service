package com.ecommerce.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationListener {

    @RabbitListener(queues = "order.notifications.queue")
    public void handleOrderNotification(String message) {
        log.info("[ORDER NOTIFICATION] Received: {}", message);
    }

    @RabbitListener(queues = "payment.notifications.queue")
    public void handlePaymentNotification(String message) {
        log.info("[PAYMENT NOTIFICATION] Received: {}", message);
    }
}