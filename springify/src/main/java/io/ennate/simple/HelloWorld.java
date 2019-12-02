package io.ennate.simple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * The @Component annotation will make the class a bean class.
 *
 * @Scope("prototype") annotation will remove the Singleton from the class.
 * No every stateful object (an object that has instance variables) will be created and can be manipulated on.
 */
@Component
@Scope("prototype")
public class HelloWorld {

    public HelloWorld() {
        System.out.println("inside the constructor");
    }


    public void sayHello() {
        System.out.println("Spring Application");
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println("inside postConstruct()");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("inside destroy()");
    }
}
