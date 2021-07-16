package com.shyam.animal.butterfly;

import com.shyam.animal.action.FlyInterface;

public class Butterfly extends Metamorphosis implements FlyInterface {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	protected boolean canMetamorphose(int numberOfDays) {
		return numberOfDays > 5;
	}

	@Override
	protected void doMetamorphosing(Processing process) {
		System.out.println("Processing for Butterfly" + process.getDays() + " days to become Butterfly");
	}
}
