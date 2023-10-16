package com.spring.backend.backend2.java.repository;

import com.spring.backend.backend2.java.models.GoalsModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;
import java.util.Optional;

@DataMongoTest
public class GoalsRepositoryTest {

    @Autowired
    private GoalsRepository goalsRepository;

    @Test
    public void testSaveGoal() {
        // Create a sample goal
        GoalsModel goal = new GoalsModel();
        goal.setName("John");
        goal.setGoal("Learn Java");
        goal.setAge(25);
        goal.setCodingLanguage("Java");

        // Save the goal using the repository
        GoalsModel savedGoal = goalsRepository.save(goal);

        // Verify that the goal is saved and has an ID assigned
        Assertions.assertNotNull(savedGoal.getId());
    }

    @Test
    public void testFindAllGoals() {
        // Retrieve all goals from the repository
        List<GoalsModel> goals = goalsRepository.findAll();

        // Verify that the list is not null
        Assertions.assertNotNull(goals);
    }

    @Test
    public void testFindGoalById() {
        // Create a sample goal
        GoalsModel goal = new GoalsModel();
        goal.setName("John");
        goal.setGoal("Learn Java");
        goal.setAge(25);
        goal.setCodingLanguage("Java");

        // Save the goal using the repository
        GoalsModel savedGoal = goalsRepository.save(goal);

        // Retrieve the goal by ID
        Optional<GoalsModel> retrievedGoal = goalsRepository.findById(savedGoal.getId());

        // Verify that the retrieved goal matches the saved goal
        Assertions.assertTrue(retrievedGoal.isPresent());
        Assertions.assertEquals(savedGoal.getId(), retrievedGoal.get().getId());
    }

    // Add more test methods for other repository methods as needed

}
