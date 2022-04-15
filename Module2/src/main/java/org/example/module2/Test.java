package org.example.module2;

import org.example.common.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person(new Cat());
        person.feed();
    }
}
