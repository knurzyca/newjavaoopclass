package wsb;

import wsb.creatures.Human;

public interface Soldable {
    public void sell(Human buyer, Human seller, Double price) throws Exception;
}
