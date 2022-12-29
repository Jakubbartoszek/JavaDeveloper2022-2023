package creatures;

public class Animal {
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public static final Double DEFAULT_DOG_WEIGHT = 6.0;
    public static final Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_HORSE_WEIGHT = 800.0;

    public final String species;
    public String name;
    private Double weight;
    private Boolean isAlive;


    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case "Canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "Felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "equus" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Animal(String species, Double weight) {
        this.isAlive = true;
        this.species = species;
        if (weight <= 0) {
            System.out.println("Sorry podałeś błędną wagę / przypisujemy wagę domyślną");
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        } else {
            this.weight = weight;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    public void checkIfIsAlive() {
        if (isAlive) {
            System.out.println("jasne że żyje");
        } else {
            System.out.println("no niestety, za późno");
        }
    }

    public void feed(Double foodWeight) {
        if (isAlive) {
            weight += (foodWeight * 0.3);
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("trochę za późno");
        }
    }

    public void takeForAWalk(Double distance) {
        if (!isAlive) {
            System.out.println("halo policja");
        } else {
            weight -= distance * 0.1;
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("Dzięki za spacer.");
            }
        }
    }
}
