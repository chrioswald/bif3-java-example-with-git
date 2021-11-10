package at.technikum.class4.animalfarm;

public class Dog extends BaseAnimal implements SpeakingAnimal {

    public Dog() {
        super("Dino");
    }

    public void speak() {
        System.out.println("Bark bark!");
    }
}
