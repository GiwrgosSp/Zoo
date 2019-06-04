package zootest;

import Animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class ZooTest {

    public static void main(String[] args) {
        Crocodile croco = new Crocodile();
        System.out.println(croco);

        Animal a1 = new Animal("dogy", 13);
        Animal a2 = new Animal("Caty", 18);
        Animal a3 = new Animal("Frogy", 15);
        List<Animal> animals = new ArrayList();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        System.out.println(Animal.getOldestAnimal(animals));

        Crocodile c1 = new Crocodile("Crocodile1", 13);
        Crocodile c2 = new Crocodile("Crocodile2", 15);
        List<Crocodile> crocodiles = new ArrayList();

        crocodiles.add(c1);
        crocodiles.add(c2);
        Animal.getOldestCrocodile(crocodiles);
        System.out.println(Animal.getOldestCrocodile(crocodiles));

    }

}
