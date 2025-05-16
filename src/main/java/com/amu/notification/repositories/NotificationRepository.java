package com.amu.notification.repositories;

import com.amu.notification.kafka.payment.PaymentConfirmation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<PaymentConfirmation, String> {
}
