package wsb;

public interface Soldable {
    public void sell(Human buyer, Human seller, Double price) throws Exception;
}
