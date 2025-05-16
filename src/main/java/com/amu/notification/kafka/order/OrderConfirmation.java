package com.amu.notification.kafka.order;

import com.amu.notification.dto.Customer;
import com.amu.notification.dto.Product;
import com.amu.notification.entities.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        Customer customer,
        List<Product> products
) {
}
