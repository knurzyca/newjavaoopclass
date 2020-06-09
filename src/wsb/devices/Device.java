package wsb.devices;

import wsb.Saleable;
import wsb.creatures.Human;

public abstract class Device implements Saleable {
        final public String producer;
        final public String model;
        int value;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

   public abstract void turnOn();

    public String getModel(){
        return this.model;
    }

    @Override public void sell(){
        System.out.println("already sold");
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {

    }
}
