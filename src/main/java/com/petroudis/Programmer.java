package com.petroudis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Value("25")
    private int age;

    //@Qualifier("com2")
    private Computer computer;

//    public Programmer(int age, Laptop laptop) {
//        System.out.println("Constructor called.");
//        this.age = age;
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Programmer(){
        System.out.println("Object created");
    }
    public void coding()
    {
        System.out.println("Coding..");
        computer.compile();
    }
}
