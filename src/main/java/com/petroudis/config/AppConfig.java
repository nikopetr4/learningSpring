package com.petroudis.config;
//Replacement of spring.xml

import com.petroudis.Computer;
import com.petroudis.Desktop;
import com.petroudis.Laptop;
import com.petroudis.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.petroudis")
public class AppConfig {

    //@Bean(name="com1")
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//    @Bean
//    public Programmer programmer(Computer com){  //@Qualifier("desktop")
//        Programmer obj = new Programmer();
//        obj.setAge(25);
//        obj.setComputer(com);
//        return obj;
//    }


 }
