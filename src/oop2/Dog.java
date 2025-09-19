package oop2;

public class Dog {
    private String name;
    private int age;
    private int energy;

    public Dog(String newName, int newAge) {
        name = newName;
        setAge(age);
        energy = 3;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy > 0) {
            this.energy = energy;
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

    public void speak() {
        System.out.println(name + " says woof woof");
    }

    public void playFetch() {
        System.out.println(name + " is playing fetch.");
        energy--;
    }

    public String toString() {
        return "Name = " + name + ", age = " + age + ", energy = " + energy;
    }
}
