package ru.javarush.info.fatfaggy.animals.entities.animals;

import org.springframework.stereotype.Component;

//@Component("parrot-kesha")
public class Parrot {
    private String name="Кеша";

    public Parrot(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
