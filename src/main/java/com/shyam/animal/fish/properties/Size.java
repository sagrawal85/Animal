package com.shyam.animal.fish.properties;

public enum Size {
	SMALL("Small"),
	LARGE("Large"),
	MEDIUM("Medium");

	private String size;

	Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
	
}
