package zoo.Saugetiere;

import zoo.Tier;

public class Capybara extends Saugetier {
    public Capybara(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {}

    @Override
    public void greet(Tier t) {
        super.greet(t);
    }

    @Override
    public void eat(int gramm) {}

    @Override
    public String toString() {
        return "Capybara [" + super.toString() + "]";
    }
}
