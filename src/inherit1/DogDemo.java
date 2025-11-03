package inherit1;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setAge(2);

        Dog toto = new Dog();
        toto.setName("Toto");
        toto.setAge(3);

        ShowDog lucky = new ShowDog();
        lucky.setName("Lucky");
        lucky.setAge(2);
        lucky.dance();
        //toto.dance();

        System.out.println(fido);
        System.out.println(toto);
        System.out.println(lucky);
    }
}
