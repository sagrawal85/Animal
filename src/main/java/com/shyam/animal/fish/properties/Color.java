package com.shyam.animal.fish.properties;

public enum Color {
	RED("Red"),
	GREEN("Green"),
	BLUE("Blue"),
	GREY("Grey"),
	ORANGE("Orange");

	private String color;

	Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
