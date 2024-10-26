package org.gfg.notification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       // NotificationService service = new NotificationService();
        ApplicationContext bucket1 = new AnnotationConfigApplicationContext("org.gfg");
//        ApplicationContext bucket2 = new AnnotationConfigApplicationContext("org.gfg.springCore");
        // one bucket, 2 object(bean)
//        NotificationService service =(NotificationService) bucket1.getBean("notificationService");
        NotificationService service1 =(NotificationService) bucket1.getBean("nService");
        service1.sendSMS("sending OTP: 2312");


    }
}
// Interface