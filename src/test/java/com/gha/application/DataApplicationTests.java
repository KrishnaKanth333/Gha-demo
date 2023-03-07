package com.gha.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.gha.application.DataApplication;

@SpringBootTest
class DataApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void applicationContextTest() {
		DataApplication.main(new String[] {});
	}
}
