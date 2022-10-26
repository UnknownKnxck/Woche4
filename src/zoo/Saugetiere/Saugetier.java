package zoo.Saugetiere;

import zoo.Tier;

public abstract class Saugetier extends zoo.Tier {
    protected Saugetier(String name, String color) {
        super(name, color);
    }

    public void greet(Tier t) {
        System.out.println(this + "\nHello, " + t);
    }

    @Override
    public void makeSound() {
        System.out.println(yellow() + this + ": MUH!" + reset());
    }

    @Override
    public String toString() {
        return "Saugetier [" + super.toString() + "]";
    }

}

