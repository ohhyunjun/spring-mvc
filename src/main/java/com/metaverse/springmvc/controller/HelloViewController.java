package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
    @GetMapping("/static-hello")
    public String hello(){
        return "Hello.html";
    }
    @GetMapping("/html/redirect")
    public String htmlRedirect(){
        return "redirect:/Hello.html";
    }
    @GetMapping("/html/templates")
    public String htmlTemplate(){
        // ... 내부 로직 추가 될 수 있음
        // prefix classpath: resources까지의 경로 + templates/ 까지 가지고 있음.
        // suffix .html
        return "Hello-template";
    }
}
