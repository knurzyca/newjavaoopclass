package wsb;

import wsb.creatures.Human;

public interface Saleable {
    public void sell(Human buyer, Human seller, Double price) throws Exception;
}
