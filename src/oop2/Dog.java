package oop2;

public class Dog {
    private String name;
    private int age;
    private int energy;
    private static String barkType = "woof woof";

    public Dog() {
        name = "Default";
        age = 4;
        energy = 5;
    }

    public Dog(String newName, int newAge) {
        name = newName;
        setAge(age);
        energy = 3;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        if (energy >= 0) {
            energy = newEnergy;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public void chase(Dog otherdog) {
        // print out the name of our dog and the name of the other dog
        System.out.println(getName() + " is chasing " + otherdog.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(String barkString) {
        System.out.println(name + " says " + barkString);
    }

    public void speak() {
        System.out.println(name + " says " + barkType);
    }

    public static void changeBark(String newBark) {
        barkType = newBark;
    }

    public void playFetch() {
        if (energy > 0) {
            System.out.println(name + " is playing fetch.");
            energy--;
        } else {
            System.out.println("Your dog needs more energy!");
        }
    }

    public String toString() {
        return "Name = " + name + ", age = " + age + ", energy = " + energy;
    }
}
