package wsb.creatures;
import wsb.Saleable;


public class Animal implements Feedable, Saleable {
    public final String species; //Fields store data
    public Double weight; // task 1.1 Add field final String species and private Double weight in Animal
    public String name;
    private Double price;


    public Animal(String name, String species, Double weight, Double price) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public Double feed() {
        System.out.println("Feeded, weight++");
        return ++weight;

    }
@Override
    public void feedd(Double foodWeight) {
        if (weight == 0) {
            System.out.println (" sooh it's too late to feed" + name + "- it's already dead");
        } else {
            weight += foodWeight;
            System.out.println (name + " has been feeded YUMMMMMM");
        }
    }



    public void takeForAWalk() {
        if (weight == 0.0) {
            System.out.println ("Your Animal is dead - you can't walk it.");
        } else if (weight > 4.0) {
            --weight;
            System.out.println (name + " says thx for a walk");
        } else if (weight > 1.0) {
            --weight;
            System.out.println (name + " is hungry");
        } else {
            weight=0.0;
            System.out.println (name + " starved to death");
        }
    }

    protected void kill() {
        System.out.println (" Animal died");
        this.weight=0.0;

    }

    //task8
    @Override
    public boolean sell(Human buyer, Human seller) throws Exception {
        if (seller.getPet ().price <= buyer.getCash ()) {
            buyer.lessCash (seller.getPet ().price);
            seller.moreCash (seller.getPet ().price);
            buyer.setPet (seller.getPet ());
            seller.setPet (null);
            System.out.println ("Your pet has a new owner now");
            return true;
        } else {
            System.out.println ("Not enough cash");
            return false;
        }
    }

    @Override
    public String toString() {
        return " Hello it's your " + species + name +" my weight is " + weight + " and cost " +price;
    }
}

