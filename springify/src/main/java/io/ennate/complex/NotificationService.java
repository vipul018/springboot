package io.ennate.complex;

import io.ennate.complex.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    // This creates a property based DI
    @Autowired
    private EmailService emailService;

//    @Autowired        // Not required for constructor based DI.
//    NotificationService(EmailService emailService) {
//        System.out.println("Inside NotificationService class constructor");
//        this.emailService = emailService;
//    }

    public void sendNotification(String to, String message) {
        System.out.println("Inside NotificationService class sendNotification method");
        this.emailService.sendEmail(to, message);
    }

}
