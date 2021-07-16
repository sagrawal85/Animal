package com.shyam.animal.dto;

import com.shyam.animal.action.SingInterface;
import com.shyam.animal.action.SwimInterface;

public class Duck extends Bird implements SingInterface, SwimInterface {

	@Override
	public void sing() {
		System.out.println("Quack, Quack");
	}

	@Override
	public void swim() {
		System.out.println("I am Swimming");
	}
}
