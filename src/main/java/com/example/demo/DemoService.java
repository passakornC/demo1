package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String sayDemo() {
        return "DEMO";
    }

    public String chooseSomething(int number) {
        String result;

        if (number > 10) {
            result = "A";
        } else {
            result = "B";
        }

        return result;
    }
}
