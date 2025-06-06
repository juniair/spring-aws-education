package com.juniair.springboot.web;

import com.juniair.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController // 컨트롤러를 JSON으로 반환하는 컨트롤러로 설정
public class HelloController {

    @GetMapping("/hello")   // GET 방식 HTTP method 요청을 받을 수 있는 API
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto (@RequestParam("name") String name,
                                      @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

}
