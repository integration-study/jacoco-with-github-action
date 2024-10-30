package demo.jacoco.api.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import demo.jacoco.api.service.TestService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TestController.class) // TestController Bean이 생긴다고 생각하면 됨.
class TestControllerTest {

    @MockBean
    private TestService testService;

    @Autowired
    private MockMvc mockMvc;


    @DisplayName("테스트 컨트롤러에서 Test 문자열을 반환한다.")
    @Test
    void test() throws Exception {
        // Given
        given(testService.getTestString())
                .willReturn("Test");

        // When & Then
        mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("Test"));
    }

    @DisplayName("테스트 컨트롤러에서 Example 문자열을 반환한다.")
    @Test
    void example() throws Exception {
        // Given
        given(testService.getExample())
                .willReturn("Example");

        // When & Then
        mockMvc.perform(get("/example"))
                .andExpect(status().isOk())
                .andExpect(content().string("Example"));
    }
}