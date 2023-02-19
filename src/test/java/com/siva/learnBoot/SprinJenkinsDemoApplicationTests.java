package com.siva.learnBoot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);
	@Test
	void contextLoads() {
		
		logger.info("inside the test ....");
		
		assertEquals(true, true);
	}

}
