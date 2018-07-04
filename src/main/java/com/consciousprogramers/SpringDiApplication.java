package com.consciousprogramers;

import com.consciousprogramers.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        controller.hello();
    }
}
