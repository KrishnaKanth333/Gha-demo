package com.gha.application.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gha.application.controller.DataController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DataControllerTest {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("This is working!", dataController.statusCheck());
	}

	@Test
	void version() {
		assertEquals("Welcome to Github Actions", dataController.greeting());
	}

}