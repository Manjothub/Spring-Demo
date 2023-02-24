package com.newproject.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person (String name, int age, Address address){ };// person constructor
record Address(String firstLine, String city){};

@Configuration // This is the Spring Class
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Manjot";
    }
    @Bean
    public int age(){
        return 23;
    }
    @Bean
    public Person person(){
        return  new Person("Ravi",20,new Address("Street","London"));
    }
    @Bean
    public Person person2MethodCall(){
        return new Person (name(), age(), address()); //name, age
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address2){ // This is the Alternative Way to call a Bean which is managed by Spring with the help of parameters
        return new Person (name, age, address2); //name, age
    }
    @Bean (name = "address2")
    public Address address(){
        return new Address("Patiala","Punjab");
    }


}
