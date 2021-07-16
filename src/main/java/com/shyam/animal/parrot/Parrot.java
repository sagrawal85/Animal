package com.shyam.animal.parrot;

import com.shyam.animal.action.SingInterface;
import com.shyam.animal.dto.Animal;

public class Parrot extends Animal implements SingInterface {

	@Override
	public void sing() {
		System.out.println("I am singing");
	}

}
