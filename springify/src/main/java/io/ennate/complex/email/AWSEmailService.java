package io.ennate.complex.email;

import org.springframework.stereotype.Component;

@Component
public class AWSEmailService implements EmailService {

    AWSEmailService() {
        System.out.println("Inside AWS class constructor");
    }

    @Override
    public void sendEmail(String to, String body) {
        System.out.println("========= AWS Email Service START =========");
        System.out.println("Sending to: " + to);
        System.out.println("Body: " + body);
        System.out.println("========= AWS Email Service END =========");
    }
}
