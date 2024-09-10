package org.example;

import java.util.List;

public record Zoo(Animals animals) {
    public int totalFoodRequirement() {
        int totalFoodRequirement = 0;
        for(Animal animal : animals.getAnimalsList()) {
            totalFoodRequirement +=animal.species().foodRequirementPerDay();
        }
        return totalFoodRequirement;
    }
}
