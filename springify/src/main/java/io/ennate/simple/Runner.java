package io.ennate.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Starting main...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("after creating application context object");
        HelloWorld helloWorld1 = context.getBean(HelloWorld.class);
        HelloWorld helloWorld2 = context.getBean(HelloWorld.class);
        helloWorld1.sayHello();
        helloWorld2.sayHello();

        System.out.println(helloWorld1 == helloWorld2);
        context.close();
    }
}
