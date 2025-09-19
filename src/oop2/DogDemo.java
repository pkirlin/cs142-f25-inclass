package oop2;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 5);
        Dog toto = new Dog("Toto", 7);
        //fido.name = "Fido";
        //toto.name = "Toto";
        //fido.age = 5;
        //toto.age = 7;
        //System.out.println("Toto's age is " + toto.age);

        fido.speak();
        toto.speak();
    }
}
