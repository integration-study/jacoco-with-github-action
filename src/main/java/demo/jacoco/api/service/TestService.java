package demo.jacoco.api.service;

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
