package com.shyam.animal.fish;

import com.shyam.animal.action.SwimInterface;
import com.shyam.animal.dto.Animal;

public class Dolphin extends Animal implements SwimInterface{

	@Override
	public void swim() {
		System.out.println("I am Swimming");
	}

}
