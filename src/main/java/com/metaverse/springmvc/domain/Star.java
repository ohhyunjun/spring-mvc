package com.metaverse.springmvc.domain;

import lombok.Getter;

@Getter
public class Star {
    String name;
    int age;
    public Star(String name, Integer age){
        this.name = name;
        this.age = age;
    }


}
