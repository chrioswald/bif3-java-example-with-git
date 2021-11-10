package at.technikum.class4.animalfarm;

public abstract class BaseAnimal {
    private String name;

    public BaseAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
