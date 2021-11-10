package at.technikum.class4.animalfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    public static void main(String[] args) {
        List<SpeakingAnimal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        for (SpeakingAnimal animal : animals) {
            animal.speak();
        }

    }
}
