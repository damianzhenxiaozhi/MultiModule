package org.example.module1;

import org.example.common.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person(new Dog());
        person.feed();
    }
}
