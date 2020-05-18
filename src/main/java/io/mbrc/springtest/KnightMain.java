package io.mbrc.springtest;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("spring/knight.xml");
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext("io.mbrc.springtest");
        context.getBean("sindbad", Knight.class).embarkOnQuest();
        context.getBean("aladdin", Knight.class).embarkOnQuest();
        context.close();
    }
}
