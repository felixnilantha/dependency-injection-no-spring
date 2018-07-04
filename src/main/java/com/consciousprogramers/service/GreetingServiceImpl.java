package com.consciousprogramers.service;

public class GreetingServiceImpl implements GreetingService {

    public static final String GOOD_MORNING="Good Morning, Welcome  Spring !!!";


    @Override
    public String greetMorning() {
        return GOOD_MORNING;
    }
}
