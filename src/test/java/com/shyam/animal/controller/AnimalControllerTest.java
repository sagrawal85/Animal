package com.shyam.animal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.shyam.animal.dto.Animal;
import com.shyam.animal.dto.Bird;
import com.shyam.animal.dto.Chicken;
import com.shyam.animal.dto.Duck;
import com.shyam.animal.dto.Rooster;
import com.shyam.animal.fish.Clownfish;
import com.shyam.animal.fish.Dolphin;
import com.shyam.animal.fish.Fish;
import com.shyam.animal.fish.Shark;
import com.shyam.animal.parrot.Parrot;
import com.shyam.animal.parrot.ParrotCat;
import com.shyam.animal.parrot.ParrotDog;

class AnimalControllerTest {
    @Test
    void getFlyingAnimalCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),                
                new ParrotDog(),
                new ParrotCat()
        };
        int flyingAnimalCount = new AnimalController().getFlyingAnimalCount(animals);
        assertEquals(flyingAnimalCount, 6);
    }

}