package com.shyam.animal;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shyam.animal.dto.Bird;

public class SolutionTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void init() {
		System.out.println("@BeforeEach - Executes");
		System.setOut(new PrintStream(outContent));
	}

	@Test
	void walk() {
		new Bird().walk();
		assert (outContent.toString()).equals("I am walking");
	}

	@Test
	void sing() {
		new Bird().sing();
		assert (outContent.toString()).equals("I am singing");
	}
}
