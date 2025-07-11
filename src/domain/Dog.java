package domain;

public class Dog {

    private String name;
    public Dog(String name) {
        this.name = name;
    }
    public void bark() {
        System.out.println("Woof!");
    }
    public String getName() {
        return name;
    }

}
