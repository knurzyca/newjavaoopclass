package wsb.creatures;

import java.io.File;


public class Animal implements Feedable, Comparable<Animal> {
    final String species; //Fields store data
    public Double weight;
    public String name;
    File pic;

    private static Double NEW_DOG_WEIGHT = 5.4;
    private static Double NEW_LION_WEIGHT = 39.2;
    private static Double NEW_PUG_WEIGHT = 4.3;

    private static Double DEFAULT_FEED_WEIGHT = 1.0;

    public Animal(String species) {
        System.out.println("there is a new Animal");
        this.species = species;

        switch (species) {
            case "dog": {
                weight = NEW_DOG_WEIGHT;
                break;
            }
            case "lion": {
                weight = NEW_LION_WEIGHT;
                break;
            }
            default: {
                weight = NEW_PUG_WEIGHT;
                break;
            }
        }
    }

    public void feed() {
        if (weight == 0) {
            System.out.println("ooh it's too late to feed" + name + "- it's already dead");
        } else {
            ++weight;
            System.out.println(name + "has been feeded YUMMMMMM");
        }
    }

    @Override
    public void feed(Double foodWeight) {
    }

    void takeForAWalk() {
        if (weight == 0.0) {
            System.out.println("you can't walk the street with dead animal you freak");
        } else if (weight > 3.0) {
            --weight;
            System.out.println(name + " says thx for a walk");
        } else if (weight > 1.0) {
            --weight;
            System.out.println(name + " says thx for a walk but I'm hungry");
        } else {
            weight = 0.0;
            System.out.println(name + " died");
        }
    }

    Double getWeight() {
        return weight;
    }

    protected void kill() {
        System.out.println(" Animal is goneeeeeee - see u in heaven");
        this.weight = 0.0;

    }

    public String toString() {return "Helllo, it's your Animal";
    }

    @Override
    public int compareTo(Animal o){
        return this.species.compareTo(o.species);
    }
}
