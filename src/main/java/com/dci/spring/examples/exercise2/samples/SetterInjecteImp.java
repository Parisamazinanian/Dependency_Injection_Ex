package com.dci.spring.examples.exercise2.samples;

public class SetterInjecteImp implements SetterInjected{
    @Override
    public String text() {
        return "I was injected in the setter!";
    }
}
