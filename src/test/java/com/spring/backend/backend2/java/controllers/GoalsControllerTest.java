package com.spring.backend.backend2.java.controllers;

import com.spring.backend.backend2.java.models.GoalsModel;
import com.spring.backend.backend2.java.service.GoalsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@WebMvcTest(GoalsController.class)
public class GoalsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GoalsService goalsService;


    @Test
    void testCreateGoal() throws Exception {
        GoalsModel createdGoal = new GoalsModel();

        mockMvc.perform(MockMvcRequestBuilders.post("/api/goals")
                .content("{\"name\":\"John\",\"goal\":\"Learn Java\",\"age\":25,\"codingLanguage\":\"Java\"}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().string("Goal created successfully!"));

        verify(goalsService, times(1)).createGoal(any(GoalsModel.class));
        //verify that goalService.createGoal was called exactly 1 time
    }

}

