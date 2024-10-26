package org.gfg.springCore;

import org.springframework.stereotype.Component;

//@Component
public class Student {

    private String name;

    private Address address;
    private Demo demo;

    public Student() {
        System.out.println("i am in default contructor of Student");
    }

//    public Student(String name, Address address) {
//        this.name = name;
//        this.address = address;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }
    public void initMethod(){
        System.out.println("init method");
    }
    public void destroyMethod(){
        System.out.println("destroying it" );
    }
}
