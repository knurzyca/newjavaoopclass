package wsb.creatures;

public interface Feedable <foodWeight> extends Animal {
   public void feed();
   public void feed(Double foodWeight);

    //void feed() throws Exception;
    //void feed(foodWeight)  throws Exception; {

    }
}
