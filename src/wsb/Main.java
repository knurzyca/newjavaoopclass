package wsb;

import wsb.creatures.Animal;
import wsb.creatures.Human;
import wsb.devices.Car;
import wsb.devices.ElectricCar;
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
       // me.pet.takeForAWalk();
       // me.setCar(new ElectricCar("X", "Tesla",2020,2.0));

        //task Salary
        me.setSalary(10000.0);


        Human knur = new Human();
        knur.firstName = "Knuroslaw";
        knur.lastName = "Knurski";
        knur.pet = cat;
        //knur.pet = me.pet;
        knur.mobile = knurofon;

        knur.pet.feed();
        System.out.println(cat);

        //task3 Salry
        knur.setSalary(5000.0);


        //task2 Create new car in Main and assign it to human that you should already have.

       /* Car knurmobil = new Car ("Ford", "Focus", 2018, 3.6);
        knurmobil.plates = "WE 1234A";
        knur.car = knurmobil;
        //System.out.println(knurmobil);
        System.out.println("Knur has a car " +knur.car.model);
        System.out.println(" with plates " + knur.car.plates);

        Car electro = new ElectricCar("Tesla", "X", 2020,6.6.);
        electro.plates = "EL ZA";
        System.out.println("We have Tesla with plates " +electro.plates);



       Car cityCar = new Car("cooper", "mini", 2016, 2.2);
        cityCar.plates = "PO G0";
        me.car = cityCar;
        System.out.println( " Kasia Pogo drives " +cityCar.producer);
        System.out.println(" with plates "+ cityCar.plates);
*/
    }
}