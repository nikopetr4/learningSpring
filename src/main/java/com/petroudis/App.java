package com.petroudis;

import com.petroudis.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Programmer obj = context.getBean(Programmer.class);
        obj.coding();
        System.out.println(obj.getAge());
        //obj.setAge(21);

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();


        //XML Approach
        //this line creates a container for me and configuration is mentioned on spring.xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        //Programmer obj = (Programmer) context.getBean("programmer");
//        Programmer obj = context.getBean("programmer",Programmer.class);
//        obj.coding();
//        obj.setAge(21);
//        System.out.println(obj.getAge());

//        Programmer obj1 = (Programmer) context.getBean("programmer");
//        obj1.coding();
//        System.out.println(obj1.age);
    }
}
