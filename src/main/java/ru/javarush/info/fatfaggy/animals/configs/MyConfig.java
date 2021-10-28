package ru.javarush.info.fatfaggy.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javarush.info.fatfaggy.animals.entities.Cat;
import ru.javarush.info.fatfaggy.animals.entities.Dog;
import ru.javarush.info.fatfaggy.animals.entities.Parrot;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat () {
        return new Cat();
    }
    @Bean
    public Dog getDog () {
        return new Dog();
    }
    @Bean("parrot-kesha")
    public Parrot getParrot () {
        return new Parrot();
    }
    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killed");
        return cat;
    }


}
