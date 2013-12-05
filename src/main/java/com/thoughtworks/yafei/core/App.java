package com.thoughtworks.yafei.core;

import com.thoughtworks.yafei.config.VegetableConfig;
import com.thoughtworks.yafei.domain.Fruit;
import com.thoughtworks.yafei.domain.Vegetable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(VegetableConfig.class);
        Fruit fruit = (Fruit)context.getBean("fruit");
        Vegetable vegetable = (Vegetable)context.getBean("vegetable");
        fruit.printMsg();
        vegetable.printMsg();
    }
}
