package at.technikum.class4.animalfarm;

import java.util.ArrayList;
import java.util.List;

public class Cat extends BaseAnimal implements SpeakingAnimal {

    private List<String> treats = new ArrayList<>();
    private int count = 0;

    public Cat() {
        super("Garfield");
    }
    public void speak() {
        System.out.println("Meow meow!");
    }

    public void addTreat(String name) {
        if (name.startsWith("Fish")) {
            treats.add(name);
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public void printTreats() {
        System.out.println(treats);
        System.out.println(count);
    }
}
