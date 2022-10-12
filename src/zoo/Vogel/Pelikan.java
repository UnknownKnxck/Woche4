package zoo.Vogel;

import zoo.Tier;

public class Pelikan extends Vogel {

    public Pelikan(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void greet(Tier t) {}

    @Override
    public String toString() {
        return "Pelikan [" + super.toString() + "]";
    }

    @Override
    public void eat(int gramm) {}
}
