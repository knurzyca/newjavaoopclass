package wsb.devices;

import wsb.Soldable;

public abstract class Device implements Soldable {
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

    public void sell(){
        System.out.println("already sold");
    }

    public int getValue() {
        return this.value;
    }
}
