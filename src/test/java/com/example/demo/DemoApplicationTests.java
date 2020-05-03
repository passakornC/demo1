package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class DemoApplicationTests {
    @Spy
    private DemoService demoService;

    @Test
    public void test() {
        assertEquals("DEMO", this.demoService.sayDemo());
    }

    @Test
    public void test2() {
        assertEquals("B", this.demoService.chooseSomething(5));
    }

    @Test
    public void test3() {
        assertEquals("A", this.demoService.chooseSomething(11));
    }
}
