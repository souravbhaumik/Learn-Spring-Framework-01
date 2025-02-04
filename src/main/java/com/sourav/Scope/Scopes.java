package com.sourav.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class normalClass{}

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
class prototypeClass{}

@Configuration
@ComponentScan
public class Scopes {
    public static void main(String[] args) {
        try {
            var context = new AnnotationConfigApplicationContext(Scopes.class);
            System.out.println(context.getBean(normalClass.class));
            System.out.println(context.getBean(normalClass.class));
            System.out.println(context.getBean(normalClass.class));

            System.out.println(context.getBean(prototypeClass.class));
            System.out.println(context.getBean(prototypeClass.class));
            System.out.println(context.getBean(prototypeClass.class));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
