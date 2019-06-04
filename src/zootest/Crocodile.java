package zootest;

import Animals.Animal;
import java.util.List;

public class Crocodile extends Animal {

    int legs;

    public Crocodile() {
        super();
        System.out.println("Crocodile created");
    }

    public Crocodile(String name, int age) {
        super(name, age);
    }

    public void printVariables() {
        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
        System.out.println("cage is: " + cage);
    }

    
    @Override
    public void play() {
        System.out.println("Crocodile is playing");
    }

    @Override
    public String toString() {
        return super.toString() + "Crocodile legs" + legs;
    }
    
    public static Crocodile getOldestAnimal(List<Animal> animals) {
        Crocodile max =(Crocodile) animals.get(0);
        for (Animal a : animals) {
            if (a.getAge() >= max.getAge()) {
                max = (Crocodile) a;
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
