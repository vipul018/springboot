package io.ennate.complex;

import io.ennate.complex.email.EmailService;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private EmailService emailService;

    NotificationService(EmailService emailService) {
        System.out.println("Inside NotificationService class constructor");
        this.emailService = emailService;
    }

    public void sendNotification(String to, String message) {
        System.out.println("Inside NotificationService class sendNotification method");
        this.emailService.sendEmail(to, message);
    }

}
