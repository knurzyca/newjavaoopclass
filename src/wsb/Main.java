package wsb;

import wsb.devices.Car;
import wsb.devices.Device;
import wsb.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("dog");
        dog.name = "Szynek";

        Phone iphone = new Phone("Apple", "6s", 4.7);

        Human me = new Human();
        me.firstName = "Kasia";
        me.lastName = "Pogo";
        me.pet = dog;
        me.mobile = iphone;

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car dirtyOne = new Car("mini", "cooper", 2019, 1.6);
        dirtyOne.plates = "PO G0";
        me.car = dirtyOne;
        System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        me.feed();
        me.pet.feed();

        iphone.turnOn();
        dirtyOne.turnOn();

        iphone.sell();
        me.pet.sell();


        Human knur = new Human();
        knur.firstName = "Knuroslaw";
        knur.lastName = "Knurski";
        knur.car = dirtyOne;

        System.out.println(me.car = knur.car);


        System.out.println(me.car);
        System.out.println(dog);
    }
}
