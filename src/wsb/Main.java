package wsb;

import wsb.creatures.Animal;
import wsb.creatures.FarmAnimal;
import wsb.creatures.Pet;

import wsb.creatures.Human;
import wsb.devices.Car;
import wsb.devices.DieselCar;
import wsb.devices.ElectricCar;
import wsb.devices.Phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("dog");
        dog.name = "Szynek";

        Phone szajsung = new Phone("Samsung", "10", 5.0);

        Human me = new Human();
        me.firstName = "Kasia";
        me.lastName = "Pogo";
        me.pet = dog;
        me.mobile = szajsung;

       // me.pet.feed();
      //  me.pet.takeForAWalk();


        Car dirtyOne = new DieselCar("mini", "cooper");
        dirtyOne.plates = "PO G0";
        me.car = dirtyOne;
        System.out.println(me.car.producer + " " + me.car.model + " " + me.car.plates);

        Car car = new DieselCar("Jeep", "Renegade");
        car.plates = "C0 RONA";
        System.out.println(car);

        Car car1 = new ElectricCar("Tesla", "X");
        System.out.println(car1);
        car1.plates = "EL ZA";

      //  System.out.println(me instanceof Animal);
      //  System.out.println(me instanceof Human);
      //  System.out.println(me instanceof Object);

        me.feed();
        me.pet.feed();

        szajsung.turnOn();
        dirtyOne.turnOn();

        szajsung.sell();

        Human knur = new Human();
        knur.firstName = "Knuroslaw";
        knur.lastName = "Knurski";
        knur.car = new DieselCar("Tesla", "x");
       // System.out.println(me.car = knur.car);

        System.out.println(me.car);
        System.out.println(knur.car);
       // System.out.println(dog);

        //Device d = new Phone("Samsung","S10")

        Human carBuyer = new Human();
        carBuyer.firstName = "Janusz" ;
        carBuyer.lastName = "Nosacz" ;

        me.car.sell(carBuyer, me, 123.0);
        System.out.println("After purchase I have" +me.cash + "PLN");
        System.out.println("The buyer named" + carBuyer.firstName + "paid me and still has" + carBuyer.cash + "PLN" );


        System.out.println();
        System.out.println();
        System.out.println();

        //        me.pet.eat(); // that will not work
        FarmAnimal pork = new FarmAnimal("Piggy");
        pork.beEaten();


        Human farmer = new Human();
        farmer.firstName = "Farmoslaw";

        Scanner consoleInput = new Scanner(System.in); //Creating scanner
        System.out.println("Enter species");

        String species = consoleInput.nextLine(); //read user consoleInput
        System.out.println("species are " + species);

        Animal animal = new FarmAnimal(species);
        System.out.println(animal);

        System.out.println("Name the animals!");
        String [] names = new String[3];
        for (int i=0; i<names.length; i++){
            names[i] = consoleInput.nextLine();
        }
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


    }
}
