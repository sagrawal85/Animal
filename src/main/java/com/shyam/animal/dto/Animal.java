package com.shyam.animal.dto;

import com.shyam.animal.action.WalkInterface;

public class Animal implements WalkInterface {

	@Override
	public void walk() {
		System.out.println("I am walking");

	}

}
