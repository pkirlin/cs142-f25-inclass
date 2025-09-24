package oop2;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 5);
        Dog toto = new Dog("Toto", 7);
        Dog lassie = new Dog();
        //Dog dog4 = new Dog(8, "Fido");
        //fido.name = "Fido";
        //toto.name = "Toto";
        //fido.age = 5;
        //toto.age = 7;
        //System.out.println("Toto's age is " + toto.age);
        fido.setAge(-6);
        System.out.println("Fido's age is now " + fido.getAge());
        System.out.println(fido);
        System.out.println(toto);
        System.out.println(lassie);
        fido.speak();
        fido.speak("arf");
        toto.speak("woof woof woof");
        Dog.changeBark("bow wow");
        toto.speak();
        lassie.speak();
        fido.chase(toto);
        toto.chase(fido);
        fido.chase(fido);
        System.out.println(toto);
        toto.playFetch();
        System.out.println(toto);
        toto.playFetch();
        System.out.println(toto);
        toto.playFetch();
        System.out.println(toto);
        toto.playFetch();
        System.out.println(toto);
        toto.playFetch();
        System.out.println(toto);

        Dog[] dogArray = new Dog[3];
        System.out.println(dogArray[0]);
        dogArray[0] = new Dog("Fred", 6);
        dogArray[1] = toto;
        dogArray[1].chase(dogArray[0]);

        for (int i = 0; i < dogArray.length; i++) {
            System.out.println(dogArray[i]);
        }
    }
}
