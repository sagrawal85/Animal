package com.shyam.animal.fish.properties;

public enum Action {
	JOKE("Jokes"),
	EAT_OTHER("Eat other fish");

	private String action;

	Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
