package com.juniair.springboot.web.dto;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {

        // given
        String name = "test";
        int amount = 100;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // that
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }

}
