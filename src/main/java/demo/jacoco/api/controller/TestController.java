package demo.jacoco.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public void test() {
        String testString = testService.getTestString();
        System.out.println(testString);
    }

    @GetMapping("/example")
    public void example() {
        String exampleString = testService.getExample();
        System.out.println(exampleString);
    }
}
