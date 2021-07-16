package com.shyam.animal.controller;

import com.shyam.animal.action.FlyInterface;
import com.shyam.animal.action.SingInterface;
import com.shyam.animal.action.SwimInterface;
import com.shyam.animal.action.WalkInterface;
import com.shyam.animal.dto.Animal;

public class AnimalCount {
    Animal[] animals;
    int flyingAnimal = 0;
    int walkingAnimal = 0;
    int speakingAnimal = 0;
    int swimingAnimal = 0;


    public AnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof FlyInterface) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof WalkInterface) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof SingInterface) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof SwimInterface) {
                swimingAnimal += 1;
            }
        }
    }

    public int getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(int flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public int getWalkingAnimal() {
        return walkingAnimal;
    }

    public void setWalkingAnimal(int walkingAnimal) {
        this.walkingAnimal = walkingAnimal;
    }

    public int getSpeakingAnimal() {
        return speakingAnimal;
    }

    public void setSpeakingAnimal(int speakingAnimal) {
        this.speakingAnimal = speakingAnimal;
    }

    public int getSwimingAnimal() {
        return swimingAnimal;
    }

    public void setSwimingAnimal(int swimingAnimal) {
        this.swimingAnimal = swimingAnimal;
    }
}
