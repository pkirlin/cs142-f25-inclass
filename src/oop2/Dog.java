package oop2;

public class Dog {
    private String name;
    private int age;

    public Dog(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public void speak() {
        System.out.println(name + " says woof woof");
    }
}
