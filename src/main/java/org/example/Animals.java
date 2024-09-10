package org.example;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    private final List<Animal> animalsList;

    public Animals() {
        animalsList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalsList.add(animal);
    }

    public List<Animal> getAnimalsList() {
        return animalsList;
    }

    public void printAnimals() {
        for (Animal animal : animalsList) {
            System.out.println(animal);
        }
    }
}
