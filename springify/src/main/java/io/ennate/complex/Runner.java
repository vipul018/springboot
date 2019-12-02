package io.ennate.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After context creation");
        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.sendNotification("vipulsharma018@gmail.com", "Test email");
        context.close();
    }
}
