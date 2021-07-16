package com.shyam.animal.fish;

import com.shyam.animal.action.SwimInterface;
import com.shyam.animal.dto.Animal;
import com.shyam.animal.fish.properties.Action;
import com.shyam.animal.fish.properties.Color;
import com.shyam.animal.fish.properties.Size;

public class Fish extends Animal implements SwimInterface{
	private Size size;
	private Color color;
	private Action action;
	
	@Override
	public void swim() {
		System.out.println("I am Swimming");
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}

}
