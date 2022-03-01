package br.com.cdornelles.app;

import br.com.cdornelles.app.model.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Bono", "Border Collie");
        Dog dog2 = new Dog("Bono", "Border Collie");
        Dog dog3 = new Dog("Otto", "Yorkshire");

        System.out.println("dog = " + dog);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);

        System.out.println("\ndog's name: " + dog.name());
        System.out.println("dog's breed: " + dog.breed());
        System.out.println("dog's hashCode: " + dog.hashCode());
        System.out.println("dog equals dog2: " + dog.equals(dog2));
        System.out.println("dog equals dog3: " + dog.equals(dog3));

    }
}
