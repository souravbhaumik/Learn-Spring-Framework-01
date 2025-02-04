package com.sourav.XML_Configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sourav.Game.GameRunner;

import java.util.Arrays;

public class XMLConfigurationContextLauncher
{
    public static void main(String[] args)
    {

        try(var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml"))
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();
        }
    }
}