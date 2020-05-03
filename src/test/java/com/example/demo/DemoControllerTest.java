package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = {DemoController.class})
class DemoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DemoService demoService;

    @Test
    void demo() throws Exception {
        this.mockMvc.perform(get("/demo")).andExpect(status().isOk());
    }

    @Test
    void demo2() throws Exception {
        this.mockMvc.perform(get("/demo2")).andExpect(status().isOk());
    }

    @Test
    void demo3() throws Exception {
        this.mockMvc.perform(get("/demo3")).andExpect(status().isOk());
    }

    @Test
    void demo4() throws Exception {
        this.mockMvc.perform(get("/demo4")).andExpect(status().isOk());
    }
}