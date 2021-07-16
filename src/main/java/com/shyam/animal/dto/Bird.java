package com.shyam.animal.dto;

import com.shyam.animal.action.FlyInterface;
import com.shyam.animal.action.SingInterface;

public class Bird extends Animal implements FlyInterface, SingInterface {

	@Override
	public void sing() {
		System.out.println("I am singing");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

}
