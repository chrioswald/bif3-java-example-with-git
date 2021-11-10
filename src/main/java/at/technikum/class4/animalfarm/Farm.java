package at.technikum.class4.animalfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    public static void main(String[] args) {
        List<SpeakingAnimal> animals = new ArrayList<>();
        final Cat cat = new Cat();
        final Dog e = new Dog();

        cat.addTreat("Fish cake");
        cat.addTreat("Fish stick");
        cat.addTreat("Fish stick2");

        cat.printTreats();

        animals.add(cat);
        animals.add(e);
        animals.add(e);

        for (SpeakingAnimal animal : animals) {
            animal.speak();
        }

    }
}
