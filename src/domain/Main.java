package domain;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");

        myDog.bark();

        System.out.println("Dog's  name is: " + myDog.getName());
    }
}