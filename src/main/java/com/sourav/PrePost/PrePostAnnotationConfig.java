package com.sourav.PrePost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    SomeDependency someDependency;

    public SomeClass (SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("SomeClass is created");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("SomeClass is cleaned up");
    }
    
}



@Component
class SomeDependency {

    public void getReady() {
        System.out.println("SomeDependency is created");
    }
}


@Configuration
@ComponentScan
public class PrePostAnnotationConfig {
    public static void main(String[] args) {
        try {
            var context = new AnnotationConfigApplicationContext(PrePostAnnotationConfig.class);
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
