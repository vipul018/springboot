package io.ennate.complex.email;

import org.springframework.stereotype.Component;

@Component("gmailService")
public class GmailService implements EmailService{
    GmailService() {
        System.out.println("Inside Gmail class constructor");
    }

    @Override
    public void sendEmail(String to, String body) {
        System.out.println("========= Gmail Email Service START =========");
        System.out.println("Sending to: " + to);
        System.out.println("Body: " + body);
        System.out.println("========= Gmail Email Service END =========");
    }
}
