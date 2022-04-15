package org.example.module2;

import org.example.common.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("eating fish");
    }
}
