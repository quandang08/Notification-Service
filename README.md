﻿# Notification-Service

Notification Service là một service độc lập trong hệ thống microservices, chịu trách nhiệm xử lý và gửi thông báo đến người dùng sau khi một hành động liên quan đến thanh toán (payment) hoặc đơn hàng (order) được thực hiện thành công.

Lắng nghe (consume) các message Kafka từ topic payment-topic.

Chuyển đổi nội dung message thành thông báo rõ ràng cho người dùng.

Gửi thông báo qua các kênh như:

Email (thường tích hợp với SendGrid, Mailgun,...)

SMS (qua Twilio,...)

Push Notification (nếu là mobile/web app)

✅ Luồng hoạt động:
Payment Service tạo thanh toán thành công → gửi message PaymentNotificationRequest lên Kafka topic payment-topic.

Notification Service lắng nghe topic đó thông qua Kafka Consumer.

Khi nhận được message, service sẽ:

Ghi log hoặc lưu DB (nếu cần tracking lịch sử)

Gửi email/SMS đến người dùng theo thông tin trong message.
