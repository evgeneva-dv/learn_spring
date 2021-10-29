package ru.javarush.info.fatfaggy.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javarush.info.fatfaggy.animals.configs.MyConfig;
import ru.javarush.info.fatfaggy.animals.entities.animals.Cat;
import ru.javarush.info.fatfaggy.animals.entities.animals.Dog;
import ru.javarush.info.fatfaggy.animals.entities.animals.Parrot;
import ru.javarush.info.fatfaggy.animals.entities.week.WeekDay;

public class Main {
    public static void main(String[] args) {
        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Dog dog = (Dog) context.getBean("getDog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);
        Parrot parrot1 = (Parrot) context.getBean("parrot-archi");
        System.out.println(parrot.getName());
        System.out.println(parrot1.getName());


        Cat cat = context.getBean(Cat.class);



        System.out.println(cat.getName());
        System.out.println(dog.getName());

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's "+weekDay.getWeekDayName()+ " today");

    }

}
