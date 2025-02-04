package com.sourav.Exercise1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        try {
            var context = new AnnotationConfigApplicationContext(Main.class);
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BuisnessCalculationService.class).findMax());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
