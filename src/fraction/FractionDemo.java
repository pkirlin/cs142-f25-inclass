package fraction;

public class FractionDemo {
    public static void main(String[] args) {
        // Write code here to demonstrate and test the functionality of your fraction class!

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(4, 6);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.add(f2));
        //f2.reduce();
        //System.out.println(f2);
    }
}
