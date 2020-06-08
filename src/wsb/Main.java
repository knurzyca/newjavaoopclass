package wsb;

import wsb.creatures.Animal;
import wsb.creatures.FarmAnimal;
import wsb.creatures.Pet;

import wsb.creatures.Human;
import wsb.devices.Car;
import wsb.devices.DieselCar;
import wsb.devices.ElectricCar;
import wsb.devices.Phone;

import java.util.Arrays;
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

/*
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
*/
        //  System.out.println(me instanceof Animal);
        //  System.out.println(me instanceof Human);
        //  System.out.println(me instanceof Object);

       me.feed();
        me.pet.feed();

   //     szajsung.turnOn();
     //   dirtyOne.turnOn();

     //   szajsung.sell();

        Human knur = new Human();
        knur.firstName = "Knuroslaw";
        knur.lastName = "Knurski";
        knur.car = new DieselCar("Tesla", "x");
         System.out.println(me.car = knur.car);

     //   System.out.println(me.car);
     //   System.out.println(knur.car);
        System.out.println(dog);

        //Device d = new Phone("Samsung","S10")

        Human carBuyer = new Human();
        carBuyer.firstName = "Janusz";
        carBuyer.lastName = "Nosacz";
/*
        me.car.sell(carBuyer, me, 123.0);
        System.out.println("After purchase I have" + me.cash + "PLN");
        System.out.println("The buyer named" + carBuyer.firstName + " paid me and still has" + carBuyer.cash + "PLN");
*/

        //        me.pet.eat(); // that will not work
        FarmAnimal pork = new FarmAnimal("Piggy");
        pork.beEaten();


        Human farmer = new Human();
        farmer.firstName = "Farmoslaw";

        Scanner consoleInput = new Scanner(System.in); //Creating scanner
  /*      String[] names = {"Adrian", "Boruta", "Szynek"};
        Integer[] numbers = {123, 3, 234, 777};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
*/
        System.out.println("Enter species");

        String species = consoleInput.nextLine(); //read user consoleInput
        System.out.println("species are " + species);

        //Animal animal = new FarmAnimal(species);
       // System.out.println(animal);

        //System.out.println("Name the animals!");
        //String [] names = new String[3];
        //for (int i=0; i<names.length; i++){
        //    names[i] = consoleInput.nextLine();
        //me.farm[i] = new FarmAnimal (species "cow");

        //   for (int i=0; i<me.farm.length; i++) {
        // System.out.println(farm[0]);
        // System.out.println(farm[1]);
        //  System.out.println(farm[2]);

        me.farm[0] = new Pet("doggo");
        me.farm[1] = new FarmAnimal("cow");
        me.farm[2] = new Human(0);

        Arrays.sort(me.farm);
/*
        Integer[] numbers2 = {1, 2, 3, 44};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
*/
    }


}
