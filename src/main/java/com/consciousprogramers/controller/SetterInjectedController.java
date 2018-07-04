package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;

public class SetterInjectedController {


    private GreetingService greetingService;


    public String greet(){
        return greetingService.greetMorning();
    }


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
