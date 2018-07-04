package com.consciousprogramers.controller;

import com.consciousprogramers.service.GreetingService;

public class PropertyInjectedController {


    public GreetingService greetingSerivce;

    public String greet(){
        return greetingSerivce.greetMorning();
    }

}
