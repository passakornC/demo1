package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping(path = "/demo")
    public ResponseEntity<?> demo() {
        return ResponseEntity.ok(this.demoService.sayDemo());
    }

    @GetMapping(path = "/demo2")
    public ResponseEntity<?> demo2() {
        return ResponseEntity.ok(this.demoService.sayDemo());
    }

    @GetMapping(path = "/demo3")
    public ResponseEntity<?> demo3() {
        return ResponseEntity.ok(this.demoService.sayDemo());
    }
}
