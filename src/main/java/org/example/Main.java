package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        //Student stud = context.getBean("student", Student.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        System.out.println("Context is setup >>>>>");
        Student stud = context.getBean("student", Student.class);
        stud.callCheat();

//        Student2 stud2 = context.getBean("student2",Student2.class);
//        stud2.letsCheat();
//        System.out.println("Hello world!");
    }
}