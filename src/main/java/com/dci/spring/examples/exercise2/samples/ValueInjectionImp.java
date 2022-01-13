package com.dci.spring.examples.exercise2.samples;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class ValueInjectionImp implements ValueInjection{
    @Value("${value.example.text}")
    private String text;
    @Value("${value.example.boolean}")
    private Boolean bool;
    @Value("${value.example.int}")
    private Integer num;
    @Value("${value.example.long}")
    private Long lNum;

    @Override
    public String getText(){
        return text;
    };
    @Override
    public Boolean getBool(){
        return bool;
    };
    @Override
    public Integer getInt(){
        return num;
    };
    @Override
    public Long getLong(){
        return lNum;
    };

    @PostConstruct
    public void postConstruct(){
        System.out.println();
        System.out.println("============================");
        System.out.println("Text value: "+getText());
        System.out.println("Boolean value: "+getBool());
        System.out.println("Int value: "+getInt());
        System.out.println("Long value: "+getLong());
        System.out.println("============================");
        System.out.println();
    }
}
