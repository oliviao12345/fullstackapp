package com.spring.backend.backend2.java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootTest
@EnableMongoRepositories
@CrossOrigin
@TestPropertySource(locations = "application-test.properties")
class Backend2ApplicationTests {

	@Test
	void contextLoads() {
	}

}
