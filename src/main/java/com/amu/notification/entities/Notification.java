package com.amu.notification.entities;

import com.amu.notification.kafka.order.OrderConfirmation;
import com.amu.notification.kafka.payment.PaymentConfirmation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Document
public class Notification {
    @Id
    private String id;
    private NotificationType type;
    private OrderConfirmation orderConfirmation;
    private PaymentConfirmation paymentConfirmation;
    private LocalDateTime notificationDate;
}
