package com.sourav.LazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{}

@Component
@Lazy       // Default initialization of Spring Beans - Eager
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("--------------Some initialization logic--------------");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
public class LazyInitialize {
    public static void main(String[] args) {
        try {
            var context = new AnnotationConfigApplicationContext(LazyInitialize.class);
            System.out.println("Initialization of Beans completed");
            ClassB classB = context.getBean(ClassB.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
