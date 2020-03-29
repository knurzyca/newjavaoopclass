package wsb.creatures;

import wsb.devices.Car;
import wsb.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone mobile;
    public Car car;
    protected String phoneNumber;
    public Double cash = 300.0;
    private Double salary;

    public Human() {

        super("homo sapiens");
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
        System.out.println("Now")
    }

}
