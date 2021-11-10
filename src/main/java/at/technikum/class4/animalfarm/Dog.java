package at.technikum.class4.animalfarm;

import java.util.ArrayList;
import java.util.List;

public class Dog extends BaseAnimal implements SpeakingAnimal {

    public Dog() {
        super("Dino");
    }

    private List<String> treats = new ArrayList<>();

    public List<String> getTreats() {
        return treats;
    }

    public void printTreats() {
        System.out.println(treats);
    }

    public void speak() {
        System.out.println("Bark bark!");
    }
}
