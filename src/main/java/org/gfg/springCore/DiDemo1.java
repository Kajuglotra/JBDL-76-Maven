package org.gfg.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DiDemo1 {
    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("projectBean.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("projectBean.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);
        Student student1 = (Student) context.getBean("student");
        System.out.println(student1);
        System.out.println(student.getName());
        context.close();

    }
}

///BeanFactory: one way to create the beans
// Application Context

// bean factory : lazy initialization

// context : early initialization