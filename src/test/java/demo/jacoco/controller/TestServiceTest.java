package demo.jacoco.controller;

import static org.assertj.core.api.Assertions.assertThat;

import demo.jacoco.api.service.TestService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceTest {

    @Autowired
    private TestService testService;

    @DisplayName("테스트 서비스에서 test 문자열을 반환한다.")
    @Test
    void getTestString() {

        // When
        String result = testService.getTestString();

        // Then
        assertThat(result).isEqualTo("Test");
    }

}