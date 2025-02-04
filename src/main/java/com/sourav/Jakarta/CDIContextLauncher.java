package com.sourav.Jakarta;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Named
class BuisnessService
{
    private DataService dataService;

    public DataService getDataService() {
        System.out.println("Setter injection will be performed.");
        return dataService;
    }

    @Inject
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
}

@Named
class DataService{}

@Configuration
@ComponentScan
public class CDIContextLauncher
{

    public static void main(String[] args)
    {

        try(var context = new AnnotationConfigApplicationContext(CDIContextLauncher.class))
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BuisnessService.class).getDataService().toString());
        }
    }
}