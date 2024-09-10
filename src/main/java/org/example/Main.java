package org.example;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("John Doe", 35, "Khazar Street 12");
        Owner owner2 = new Owner("July Roberts", 30, "Nizami Street 32");

        Species elephantSpecies = new Species("Elephant", 3000);
        Species leopardSpecies = new Species("Leopard", 2000);
        Species giraffeSpecies = new Species("Giraffe", 1400);

        Animal animal1 = new Animal(1,"Coco", 10, owner1, elephantSpecies );
        Animal animal2 = new Animal(2,"Oscar", 13 , owner1, leopardSpecies);
        Animal animal3 = new Animal(3,"Luna", 5 , owner2, giraffeSpecies);
        Animal animal4 = new Animal(4,"Mina", 5 , owner2, leopardSpecies);

        Animals animals = new Animals();
        animals.addAnimal(animal1);
        animals.addAnimal(animal2);
        animals.addAnimal(animal3);
        animals.addAnimal(animal4);

        animals.printAnimals();

        System.out.println("----");

        Zoo zoo = new Zoo(animals);

        System.out.println("Total food requirement for the Zoo: " + zoo.totalFoodRequirement() + " grams");

    }
}