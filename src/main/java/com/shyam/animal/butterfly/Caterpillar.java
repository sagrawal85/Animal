package com.shyam.animal.butterfly;

import com.shyam.animal.action.WalkInterface;

public class Caterpillar extends Metamorphosis implements WalkInterface{

	
	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	protected boolean canMetamorphose(int numberOfDays) {
		return numberOfDays <= 5;
	}

	@Override
	protected void doMetamorphosing(Processing process) {
		System.out.println("Processing for Caterpillar" + process.getDays() + " days to stay at Caterpillar");
	}

}
