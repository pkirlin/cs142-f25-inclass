package inherit2;

public class ShowDog extends Dog {
    protected int competitionsWon;

    public ShowDog(String name, int age) {
        super(name, age); // call the Dog(name, age) constructor
        System.out.println("Constructing a showdog.");
    }

    public void dance() {
        System.out.println(getName() + " is dancing.");
    }

    public void speak() {
        super.speak();
        System.out.println(name + " says woof woof in French.");
    }
}