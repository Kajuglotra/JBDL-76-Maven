package org.gfg.FlightDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext bucket1 = new AnnotationConfigApplicationContext("org.gfg");
        FlightService s = (FlightService) bucket1.getBean("flightService");
    }
}
// 2 children class for 1 imple