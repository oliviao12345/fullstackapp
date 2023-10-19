package com.spring.backend.backend2.java.service;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//class GoalsServiceTest {
//
//    @Mock
//    private GoalsRepository goalsRepository; // Mocked GoalsRepository dependency
//
//    private GoalsService goalsService; // Instance of GoalsService
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this); // Initialize the mocks
//        /*
//         * The MockitoAnnotations.openMocks(this) statement initializes the mock objects
//         * defined in the test class. It ensures that the @Mock annotation on the goalsRepository
//         * field is processed and the mock object is created. This allows us to use the mocked
//         * goalsRepository in our tests.
//         */
//
//        goalsService = new GoalsService(goalsRepository); // Create an instance of GoalsService with the mocked repository
//        /*
//         * The goalsService = new GoalsService(goalsRepository) statement creates an instance of
//         * the GoalsService class and passes the mocked goalsRepository as a dependency to the
//         * GoalsService constructor. This allows us to test the functionality of the GoalsService
//         * class using the mocked repository, ensuring that the service interacts correctly with
//         * the repository.
//         */
//    }
//
//    @Test
//    void createGoal_ShouldSaveGoal() {
//        // Create a mock goal object
//        GoalsModel goal = new GoalsModel();
//
//        // Mock the behavior of the goalsRepository.save() method
//        when(goalsRepository.save(goal)).thenReturn(goal);
//        // ^ When goalsRepository.save(goal) is called, return the mock goal object
//
//        // Call the createGoal() method of the goalsService
//        GoalsModel createdGoal = goalsService.createGoal(goal);
//        // ^ Call the createGoal() method with the mock goal
//
//        // Assert that the created goal is the same as the mock goal
//        assertEquals(goal, createdGoal);
//        // ^ Check if the created goal is equal to the mock goal
//
//        // Verify that the goalsRepository.save() method was called once with the mock goal
//        verify(goalsRepository, times(1)).save(goal);
//        // ^ Verify that the goalsRepository.save(goal) was called exactly 1 time
//    }
//
//    @Test
//    void getAllGoals_ShouldReturnAllGoals() {
//        // Create a list of mock goals
//        List<GoalsModel> goals = new ArrayList<>();
//        goals.add(new GoalsModel());
//        goals.add(new GoalsModel());
//
//        // Mock the behavior of the goalsRepository.findAll() method
//        when(goalsRepository.findAll()).thenReturn(goals);
//        /*
//         * Mocking the behavior of goalsRepository.findAll() ensures that when
//         * this method is called, it will return the mock goals list that we created above.
//         * This allows us to simulate the behavior of the goalsRepository for testing purposes.
//         */
//
//        // Call the getAllGoals() method of the goalsService
//        List<GoalsModel> allGoals = goalsService.getAllGoals();
//
//        // Assert that the returned list of goals is the same as the mock goals list
//        assertEquals(goals, allGoals);
//        /*
//         * The assertEquals statement is used to compare the goals list (mock goals)
//         * with the allGoals list (returned goals) to ensure they are the same.
//         * If they are not equal, the test will fail, indicating that the getAllGoals()
//         * method did not return the expected list of goals.
//         */
//
//        // Verify that the goalsRepository.findAll() method was called once
//        verify(goalsRepository, times(1)).findAll();
//        /*
//         * The verify statement is used to ensure that the goalsRepository.findAll()
//         * method was called exactly once. This verifies that the getAllGoals() method
//         * correctly interacts with the goalsRepository to retrieve the goals.
//         */
//    }
//
//    @Test
//    void getGoalsByGoal_ShouldReturnGoal() {
//        // Create a mock goal object
//        GoalsModel goal = new GoalsModel();
//        String goalName = "Learn Java";
//
//        // Mock the behavior of the goalsRepository.findByGoal() method
//        when(goalsRepository.findByGoal(goalName)).thenReturn(goal);
//        /*
//         * Mocking the behavior of goalsRepository.findByGoal(goalName) ensures that when
//         * this method is called with the specified goalName, it will return the mock goal object.
//         * This allows us to simulate the behavior of the goalsRepository for testing purposes.
//         */
//
//        // Call the getGoalsByGoal() method of the goalsService
//        GoalsModel foundGoal = goalsService.getGoalsByGoal(goalName);
//
//        // Assert that the returned goal is the same as the mock goal
//        assertEquals(goal, foundGoal);
//        /*
//         * The assertEquals statement is used to compare the mock goal object with the
//         * returned goal object to ensure they are the same. If they are not equal, the
//         * test will fail, indicating that the getGoalsByGoal() method did not return the
//         * expected goal object.
//         */
//
//        // Verify that the goalsRepository.findByGoal() method was called once with the mock goal name
//        verify(goalsRepository, times(1)).findByGoal(goalName);
//        /*
//         * The verify statement is used to ensure that the goalsRepository.findByGoal(goalName)
//         * method was called exactly once with the specified goalName. This verifies that the
//         * getGoalsByGoal() method correctly interacts with the goalsRepository to retrieve the goal.
//         */
//    }
//
//
//    // Add more test methods for other methods in GoalsService class...
//
//}
//
//
