import creatures.Human;
import devices.Car;

public class Main {
    public static void main(String[] args) {


        Human me = new Human("Kuba");
        me.feed(2.0);
        me.takeForAWalk(10.0);
        System.out.println(me.species);
        System.out.println(Human.DEFAULT_ANIMAL_WEIGHT);

        Car fiat = new Car(17,"Fiat", "Bravo", "LPG");
        fiat.millage = 312345.0;
        fiat.fuelType = "LPG";

        System.out.println(fiat.producer);
        System.out.println(me.firstName);

    }
}