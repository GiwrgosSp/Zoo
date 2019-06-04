package Animals;

import java.util.ArrayList;
import java.util.List;
import zootest.Crocodile;

public class Animal {

    protected String name;
    protected int age;
    protected String cage;

    public Animal() {
        System.out.println("Animal created");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String cage) {
        this.name = name;
        this.age = age;
        this.cage = cage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    protected void move() {
        System.out.println("Animal is moving");
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

    protected void play() {
        System.out.println("Animal is playing");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", cage=" + cage + '}';
    }

    public  static Animal getOldestAnimal(List<Animal> animals) {
        Animal max = animals.get(0);
        for (Animal a : animals) {
            if (a.getAge() >= max.getAge()) {
                max = a;
            }
        }
        return max;
    }

    public static Crocodile getOldestCrocodile(List<Crocodile> crocodiles) {
        Crocodile max = crocodiles.get(0);
        for (Crocodile a : crocodiles) {
            if (a.getAge() >= max.getAge()) {
                max = a;
            }

        }

        return max;
    }
}
