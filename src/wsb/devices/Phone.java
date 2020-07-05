package wsb.devices;

import wsb.creatures.Human;

import static java.lang.System.out;

public class Phone extends Device {

    public Phone(String producer, String model, double price, int yearOfProduction) {
        super (producer, model, price, yearOfProduction);
    }
    public void turnOn() {
        out.println("phone is turned on");
    }

    public void sell(){
        out.println("phone is sold");
    }

    public void installAnApp(String name){
        installAnApp(name, 1.0);
    }
    public void installAnApp(String name, Double version){
        out.println(" " + name + " was installed. Now you have the version: " + version);
    }

    public void installAnApp(String[] apps) {
        for (String app : apps) installAnApp (app);
    }

    @Override
    public boolean sell(Human buyer, Human seller) throws Exception {
        if (seller.getPhone().price<= buyer.getCash()) {
            buyer.lessCash(seller.getPhone().price);
            seller.moreCash(seller.getPhone().price);
            buyer.setPhone(seller.getPhone());
            seller.setPhone(null);
            System.out.println("your phone was sold to" + seller.toString());
            return true;
        } else {
            System.out.println("Sorry, not enough cash to buy ohone");
            return false;
        }
    }
}
