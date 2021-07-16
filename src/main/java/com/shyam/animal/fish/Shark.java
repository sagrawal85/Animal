package com.shyam.animal.fish;

import com.shyam.animal.fish.properties.Action;
import com.shyam.animal.fish.properties.Color;
import com.shyam.animal.fish.properties.Size;

public class Shark extends Fish{
	
	public Shark() {
	}
	
	public Shark(Color color, Size size, Action action) {
		color = Color.GREY;
		size = Size.LARGE;
		action = Action.EAT_OTHER;
	}
	
}
