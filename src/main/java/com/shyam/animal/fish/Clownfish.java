package com.shyam.animal.fish;

import com.shyam.animal.fish.properties.Action;
import com.shyam.animal.fish.properties.Color;
import com.shyam.animal.fish.properties.Size;

public class Clownfish extends Fish{
	
	public Clownfish() {
	}
	
	public Clownfish(Color color, Size size, Action action) {
		color = Color.ORANGE;
		size = Size.SMALL;
		action = Action.JOKE;
	}

	
}
