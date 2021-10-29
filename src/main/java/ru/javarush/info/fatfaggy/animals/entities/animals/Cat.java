package ru.javarush.info.fatfaggy.animals.entities.animals;

import org.springframework.stereotype.Component;

//@Component
public class Cat {
    private String name="Murka";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
