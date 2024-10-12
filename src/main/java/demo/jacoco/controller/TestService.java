package demo.jacoco.controller;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getTestString() {
        return "Test";
    }

    public String getExample() {
        return "Example";
    }
}
