package creatures;


import devices.Car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Human extends Animal {
    public String firstName;
    public String secondName;
    public Animal pet;
    private Car car;
    private Double salary;
    private List<Date> history = new ArrayList<>();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getSalary() {
        history.add(new Date());
        System.out.println("użytkownik pobrał informacje o wynagrodzeniu ");
        System.out.println("  o godzinie: " + history);
        return salary;
    }

    public void setSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź swoje wynagrodzenie: ");
        Double newSalary = scanner.nextDouble();
        if (newSalary < 0) {
            System.out.println("Nie wolno przypisać ujemnej wartości wynagrodzenia");
        } else {
            System.out.println("Dane zostały wysłane do systemu księgowego.");
            System.out.println("Teraz należy odebrać aneks od Pani Halinki.");
            System.out.println("e ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }
        this.salary = newSalary;
    }

    public Human(String firstName, Double salary) {
        super("Homo sapiens", 50.0);
        this.firstName = firstName;
        this.salary = salary;
        this.history = new ArrayList<>();

    }
}
