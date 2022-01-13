package com.dci.spring.examples.exercise2.samples;

public class FieldInjectedImp implements FieldInjected{

    @Override
    public String text() {
        return "I was injected in the field!";
    }
}
