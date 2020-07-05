package wsb.creatures;

public class FarmAnimal extends Animal implements Edible{


    public FarmAnimal(String name, String species, Double weight, Double price) {
        super (name, species, weight, price);
    }

    @Override
    public void eat(Animal animal) throws Exception {

    }

    @Override
    public void beEaten() throws Exception {
        this.kill();
        System.out.println("tasted goog");
    }
}
