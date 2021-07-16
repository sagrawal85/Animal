package com.shyam.animal.dto;

import com.shyam.animal.action.SingInterface;

public class Rooster extends Chicken implements SingInterface {

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
