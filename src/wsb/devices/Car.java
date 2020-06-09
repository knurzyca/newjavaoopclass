package wsb.devices;

// import wsb.Soldable;
// import wsb.creatures.Human;

import wsb.creatures.Human;

public class Car {
    public String model;
    public String producer;
    public int year;
    public Double enginepower;
    public String plates;

    public Car(String model, String producer, int year, Double enginepower) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.enginepower = enginepower;

       // System.out.println( " A car with plates " + plates);


    }
    //task buy sell
    public void sell(Human carBuyer, Human me, double v) throws Exception{
            throw new Exception("Do you really wanna sell it? ");
    }


    // public void refuel();
}