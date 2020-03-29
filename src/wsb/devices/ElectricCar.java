package wsb.devices;

public class ElectricCar extends Car {
    public ElectricCar(String producer, String model) {
        super(producer, model, 2020, null);
        }

        @Override
        public void refuel () {
            System.out.println("Charged by electricity");
        }
    }