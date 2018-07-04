package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.greetMorning();
    }
}
