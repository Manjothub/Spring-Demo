package com.newproject.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        // Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // Configure the things that we want Spring to Manage - @configuration
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        // Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
//        System.out.println(context.getBean("address"));
        System.out.println(context.getBean(Address.class)); //You can call the name of the bean or Type of the Bean. It will allow you to create the multiple bean
    }

}
