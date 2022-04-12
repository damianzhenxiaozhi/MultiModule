package org.example;

import lombok.extern.java.Log;

@Log
public class Dog implements Animal {
    @Override
    public void eat() {
        log.info("dog log");
        System.out.println("eating bone");
    }
}
