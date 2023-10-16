package com.spring.backend.backend2.java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootTest
@EnableMongoRepositories
@CrossOrigin
class Backend2ApplicationTests {

	@Test
	void contextLoads() {
	}

}
