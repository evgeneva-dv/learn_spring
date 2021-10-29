package ru.javarush.info.fatfaggy.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.javarush.info.fatfaggy.animals.entities.animals.Cat;
import ru.javarush.info.fatfaggy.animals.entities.animals.Dog;
import ru.javarush.info.fatfaggy.animals.entities.animals.Parrot;
import ru.javarush.info.fatfaggy.animals.entities.week.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

//@ComponentScan("ru.javarush.info.fatfaggy.animals.entities.animals")
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
    public Parrot getParrotKesha () {
        return new Parrot("Кеша");
    }
    @Bean("parrot-archi")
    public Parrot getParrotArchi () {
        return new Parrot("Арчи");
    }

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        parrot.setName("Richi");
        cat.setName(parrot.getName() + "-killed");
        return cat;
    }


    @Bean
    public WeekDay getDay() {
        DayOfWeek currentDayOfWeek = LocalDate.now().getDayOfWeek();
        switch (currentDayOfWeek) {
            case MONDAY:return new Monday();
            case TUESDAY:return new Tuesday();
            case THURSDAY:return new Thursday();
            case WEDNESDAY:return new Wednesday();
            case FRIDAY:return new Friday();
            case SATURDAY:return new Saturday();
            default:return new Sunday();

        }
    }


}
