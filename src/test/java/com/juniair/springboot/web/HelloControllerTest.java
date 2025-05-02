package com.juniair.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// JUnit에 내장된 실행자 대신 다른 실행자로 실행
@RunWith(SpringRunner.class)
// 여러 Spring 테스트 중 Spring MVC 테스트를 사용
// @Controller, @ControllerAdvice 어노테이션을 사용 가능
// @Service, @Component, @Repository 어노테이션 사용 불가
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {


    // 웹 MVC 테스트를 위해 사용
    // 스프링 MVC 테스트에 시작점
    @Autowired
    private MockMvc mvc;



    @Test
    public void helloReturnTest() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))   // MockMvc를 통해 /hello 주소로 GET 요청
                .andExpect(status().isOk())     // mvc.perform의 요청 검증 (Http Header의 Status가 OK(200)을 확인)
                .andExpect(content().string(hello));    // 응답 본문과 hello 변수의 값을 검증
    }


}
