package wsb;

import wsb.creatures.Animal;
import wsb.creatures.FarmAnimal;
import wsb.creatures.Pet;
import wsb.creatures.Human;
import wsb.devices.Phone;
/*
import wsb.devices.Car;
import wsb.devices.DieselCar;
import wsb.devices.ElectricCar;

 */

import java.util.Arrays;
import java.util.Scanner;

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

    }
}