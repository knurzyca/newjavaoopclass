package wsb.creatures;

public interface Edible {
    void eat(Animal animal) throws Exception;
    void beEaten() throws Exception;
}