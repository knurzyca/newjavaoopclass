package wsb.creatures;

import wsb.devices.Car;
import wsb.devices.Phone;

public class Human extends Animal {
    private static final Double DEFAULT_FEED_WEIGHT = 1.0;
    public String firstName;
    public String lastName;
    public Animal pet;

    public Animal [] farm;
    //public FarmAnimal[] farm;

    public Phone mobile;
    public Car car;

    private static int DEFAULT_FARM_SIZE = 3;

    protected String phoneNumber;
    public Double cash = 300.0;
    private Double salary;


    public Human(Integer farmSize) {
        super("homo sapiens");
        farm = new FarmAnimal[farmSize];
    }

    public Human() {
        super("homo sapiens");
        farm = new FarmAnimal[DEFAULT_FARM_SIZE];
    }


    public Double getSalary() {
        return salary;
    }

    public void sell() throws Exception {
        throw new Exception("don't do this");
    }

    public void eat() throws Exception {
        throw new Exception("don't do this ");
    }

   // public String toString() { return firstName; }
    public void feed() {
        System.out.println("Human can use knife and fork - don't need to be feeeded");
        super.feed(DEFAULT_FEED_WEIGHT);
    }

    public void startFeeding(Feedable feedable){
        System.out.println("Now");
    }

}
