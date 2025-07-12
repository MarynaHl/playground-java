package domain;

public class Cat {

    private String name;
    public Cat(String name) {
        this.name = name;
    }
    public void bark() {
        System.out.println("Woof!");
    }
    public String getName() {
        return name;
    }

}
