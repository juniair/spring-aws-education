package com.juniair.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // 컨트롤러를 JSON으로 반환하는 컨트롤러로 설정
public class HelloController {

    @GetMapping("/hello")   // GET 방식 HTTP method 요청을 받을 수 있는 API
    public String hello() {
        return "hello";
    }

}
