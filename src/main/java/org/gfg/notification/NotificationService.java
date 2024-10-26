package org.gfg.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component("nService")
@Scope(value = "prototype")
//@PreDestroy
public class NotificationService {
    // env file
//    @Value()
    private String temp;

//    @Autowired
    private SMSGateway smsGateway;

    public NotificationService(SMSGateway smsGateway){
        this.smsGateway =smsGateway;
//        this.temp = temp;
    }

    public SMSGateway getSmsGateway() {
        return smsGateway;
    }

//    @Autowired
//    public void setSmsGateway(SMSGateway smsGateway) {
//        this.smsGateway = smsGateway;
//    }

    public void sendSMS(String sms){
        smsGateway.sendSMS(sms);
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("destroying...");
    }
}
// xml -> default constructor
// spring annotations

// 3 ways to make the connectivity
// @Autowired : annotation -> field that was present in my class -> field injection
// notificationService -> ref to the bean that is created by annotations present in classes

// Constructor injection -> constructor , i have not used autowired
// i defined everything on which my class was dependent ?
//

// setter injection
// object has been already created,
// setter method, set the bean from the present bucket ?

// xml file to create a bean , deafult is not mandatory ?

