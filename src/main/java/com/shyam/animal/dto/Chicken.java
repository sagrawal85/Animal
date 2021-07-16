package com.shyam.animal.dto;

import com.shyam.animal.action.SingInterface;

public class Chicken extends Animal implements SingInterface {

	@Override
	public void sing() {
		System.out.println(" Cluck, cluck ");
	}

}
