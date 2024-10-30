package demo.jacoco.api.controller;

import demo.jacoco.api.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public String test() {
        return testService.getTestString();
    }

    @GetMapping("/example")
    public String example() {
        return testService.getExample();
    }
}
