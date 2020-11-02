package Builder;

/**
 * created by eseisl on 02.11.2020
 */

public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
