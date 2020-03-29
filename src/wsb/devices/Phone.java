package wsb.devices;

import wsb.creatures.Human;

public class Phone extends Device {
    final Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        super(producer,model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("phone is turned on");
    }

    public void sell(){System.out.println("phone is on");}

    public void installAnApp(String name){
        installAnApp(name, 0.0);
    }
    public void installAnApp(String name, Double version){
        System.out.println();
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {

    }
}
