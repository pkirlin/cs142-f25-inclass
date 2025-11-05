package inherit2;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 2);
        //fido.setName("Fido");
        //fido.setAge(2);

        Dog toto = new Dog();//"Toto", 3);
        //toto.setName("Toto");
        //toto.setAge(3);

        ShowDog lucky = new ShowDog("Lucky", 2);
        //lucky.setName("Lucky");
        //lucky.setAge(2);
        lucky.dance();
        //toto.dance();

        fido.speak();
        toto.speak();
        lucky.speak();

        System.out.println(fido);
        System.out.println(toto);
        System.out.println(lucky);
    }
}