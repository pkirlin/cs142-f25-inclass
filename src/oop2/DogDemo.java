package oop2;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog();
        Dog toto = new Dog();
        fido.name = "Fido";
        toto.name = "Toto";
        fido.age = 5;
        toto.age = 7;
        System.out.println("Toto's age is " + toto.name);

        fido.speak();
        toto.speak();
    }
}
