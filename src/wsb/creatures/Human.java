package wsb.creatures;

import wsb.devices.Car;
import wsb.devices.ElectricCar;
import wsb.devices.Phone;

public class Human extends Animal {
    private static final Double DEFAULT_FEED_WEIGHT = 1.0;
    public String firstName;
    public String lastName;
    public Animal pet; //task 1.1

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
       // garage = new Car[DEFAULT_GARAGE_SIZE]
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

    public void setSalary(double v) {
    }

    public void setCar(ElectricCar electricCar) {
    }

    public void feed() {
        System.out.println("Human can use knife and fork - don't need to be feeded");
        super.feed(DEFAULT_FEED_WEIGHT);
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    /*public Double valueofCars(){
        Double value = 0.0;
        for (Car car :garage){
            if (car == null){
                value +=car.value;
            }
        }
    } */

}
