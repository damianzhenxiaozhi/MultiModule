package org.example;

public class Person {
    private Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void feed() {
        System.out.println("I'm feeding...");
        animal.eat();
    }
}
