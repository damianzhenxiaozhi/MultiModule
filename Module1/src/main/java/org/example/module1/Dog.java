package org.example.module1;

import lombok.extern.java.Log;
import org.example.common.Animal;

@Log
public class Dog implements Animal {
    @Override
    public void eat() {
        log.info("dog log");
        System.out.println("eating bone");
    }
}
