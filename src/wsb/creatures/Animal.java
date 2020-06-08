package wsb.creatures;

import java.io.File;


public class Animal {
    final String species; //Fields store data
    public Double weight;
    public String name;
    File pic;

    private static Double NEW_DOG_WEIGHT = 5.4;
    private static Double NEW_LION_WEIGHT = 39.2;
    private static Double NEW_CAT_WEIGHT = 4.3;

    private static Double DEFAULT_FEED_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;

        System.out.println(" Hurray, there is a new animal in the family! ");
        switch (species) {
            case "dog": {
                weight = NEW_DOG_WEIGHT;
                break;
            }
            case "lion": {
                weight = NEW_LION_WEIGHT;
                break;
            }
            case "cat": {
                weight = NEW_CAT_WEIGHT;
                break;
            }
            default: {
                weight = NEW_CAT_WEIGHT;
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


    public void takeForAWalk() {
        if (weight == 0.0) {
            System.out.println("Your Animal is dead - you can't walk it.");
        } else if (weight > 4.0) {
            --weight;
            System.out.println(name + " says thx for a walk");
        } else if (weight > 1.0) {
            --weight;
            System.out.println(name + " is hungry");
        } else {
            weight = 0.0;
            System.out.println(name + " starved to death");
        }
    }

  /*  Double getWeight() {
        return weight;
    }

   */

    protected void kill() {
        System.out.println(" Animal died");
        this.weight = 0.0;

    }

    public String toString() {return "Hello, it's your " +species +name;
    }

}
