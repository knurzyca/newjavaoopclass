package wsb;

import wsb.creatures.Animal;
import wsb.creatures.Human;
import wsb.devices.Car;
import wsb.devices.Phone;


public class Main {



    public static void main(String[] args) throws Exception {
        //lesson1

        Animal dog = new Animal("dog");
        dog.name = "Szynek";

        Animal cat = new Animal("cat");
        cat.name = "Kulek";

        Phone szajsung = new Phone("Samsung", "10", 5.0);
        Phone knurofon = new Phone("Samsung", "12", 7.0);

        Human me = new Human();
        me.firstName = "Kasia";
        me.lastName = "Pogo";
        me.pet = dog;
        me.mobile = szajsung;
        System.out.println(dog);
        me.pet.feed();
        me.pet.takeForAWalk();

        Human knur = new Human();
        knur.firstName = "Knuroslaw";
        knur.lastName = "Knurski";
        knur.pet = cat;
        knur.pet = me.pet;
        knur.mobile = knurofon;
        System.out.println(cat);

        //task2 Create new car in Main and assign it to human that you should already have.
        Car knurmobil = new Car ("Ford", "Focus", 2018, 3.6);
        knurmobil.plates = "WE 1234A";
        knur.car = knurmobil;
        //System.out.println(knurmobil);
        System.out.println("Knur has a car " +knur.car.model);
        System.out.println(" with plates " + knur.car.plates);

       /*Car car1 = new ElectricCar("Tesla", "X");
        System.out.println(car1);
        car1.plates = "EL ZA";

       */
       Car cityCar = new Car("cooper", "mini", 2016, 2.2);
        cityCar.plates = "PO G0";
        me.car = cityCar;
        System.out.println( " Kasia Pogo drives " +cityCar.producer);
        System.out.println(" with plates "+ cityCar.plates);

    }
}