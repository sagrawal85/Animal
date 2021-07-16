package com.shyam.animal;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shyam.animal.dto.Bird;
import com.shyam.animal.dto.Chicken;
import com.shyam.animal.dto.Duck;
import com.shyam.animal.dto.Rooster;
import com.shyam.animal.parrot.Parrot;
import com.shyam.animal.parrot.ParrotCat;
import com.shyam.animal.parrot.ParrotDog;
import com.shyam.animal.parrot.ParrotRooster;

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
		new Chicken().walk();
		assert (outContent.toString()).equals("I am walking");
		new Rooster().walk();
		assert (outContent.toString()).equals("I am walking");
	}

	@Test
	void sing() {
		new Bird().sing();
		assert (outContent.toString()).equals("I am singing");
		new Duck().sing();
		assert (outContent.toString()).equals("I am singing");
        new Chicken().sing();
        assert (outContent.toString()).equals("I am singing");
        new Rooster().sing();
        assert (outContent.toString()).equals("Cock-a-doodle-doo");
        
        new Parrot().sing();
        assert (outContent.toString()).equals("I am singing");
        new ParrotDog().sing();
        assert (outContent.toString()).equals("Woof, woof");
        new ParrotCat().sing();
        assert (outContent.toString()).equals("Me ow");
        new ParrotRooster().sing();
        assert (outContent.toString()).equals("Cock-a-doodle-doo");
	}

	@Test
	void fly() {
		new Bird().fly();
		assert (outContent.toString()).equals("I am flying");
	}

	@Test
	void swim() {
		new Duck().swim();
		assert (outContent.toString()).equals("I am Swimming");
	}
}
