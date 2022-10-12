package zoo.Vogel;

import zoo.Tier;

public class Tucan extends Vogel {
    public Tucan(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {}

    @Override
    public void greet(Tier t) {}

    @Override
    public void eat(int gramm) {
        super.eat(gramm);
    }

    @Override
    public String toString() {
        return "Tucan [" + super.toString() + "]";
    }
}
