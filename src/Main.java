import creatures.Human;
import devices.Car;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Human me = new Human("Kuba", 1000.0);
        
        me.feed(2.0);
        me.takeForAWalk(10.0);

        System.out.println(me.species);
        System.out.println(Human.DEFAULT_ANIMAL_WEIGHT);

        Car fiat = new Car(17, "Fiat", "Bravo", "LPG");
        fiat.millage = 312345.0;
        fiat.fuelType = "LPG";

        me.setCar(fiat);
        System.out.println("mój samochód to: " + me.getCar());

        System.out.println(me.getSalary());
        System.out.println(me.getSalary());
        Thread.sleep(2000);
        System.out.println(me.getSalary());
        System.out.println(me.getSalary());

        me.setSalary();
        System.out.println("Twoje wynagrodzenie wynosi: " + me.getSalary() + " złotych.");
    }
}