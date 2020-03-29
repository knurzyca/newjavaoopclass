package wsb.devices;

import wsb.Human;

public class Car extends Device {
    public final Integer yearOfProduction;
    public final Double sizeOfAnEngine;
    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
        super(producer, model);
        this.yearOfProduction = yearOfProduction;
        this.sizeOfAnEngine = sizeOfAnEngine;

    }

    @Override
    public void turnOn() {
        System.out.println("car is ready to go");
    }

    public String toString(){
        return this.producer " " + this.plates;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (buyer.cash > price) {
            buyer.car = this;
            buyer.cash -= price;
            seller.car = null;
            seller.cash += price;
            System.out.println(seller.firstName + "is selling a car" + this.model + "to" + buyer.firstName);
        }
        else {
            throw new Exception("sorry, your funds are inefficient - please provide more cash to proceed with your purchase")
        }
    }
}

