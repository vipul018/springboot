package io.ennate.simple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring @Configuration annotation helps in Spring annotation based configuration.
 * @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the
 * Spring container to generate bean definitions and service requests for those beans at runtime.
 * @ComponentScan tells the Spring Boot to look out for components.
 * limitation: ComponentScan only scans in the package it is defined or the child packages.
 */
@Configuration
@ComponentScan
//@ComponentScan(basePackages = "io.egen"): to give custom path to component in different packages.
public class Application {

    /**
     * The name of the method doesn't matter, only the return type.
     * It should be used when we are creating an object of a class that we cannot handle.
     * For example, an API class.
     * @return HelloWorld object.
     */
//    @Bean
//    public HelloWorld beanFactory() {
//        System.out.println("Inside BeanFactory()");
//        return new HelloWorld();
//    }
}
