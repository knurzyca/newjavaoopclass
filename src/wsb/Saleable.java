package wsb;

import wsb.creatures.Human;

public interface Saleable {
    default boolean sell(Human buyer, Human seller) throws Exception {
        return false;
    }

}
