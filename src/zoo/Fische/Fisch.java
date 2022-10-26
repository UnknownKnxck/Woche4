package zoo.Fische;

import zoo.Tier;


public abstract class Fisch extends Tier {

    public Fisch(String name, String color) {
        super(name, color);
    }

    @Override
    public final void makeSound() {
        System.out.println(yellow() + this + ": Glup!\n" + reset());
    }

    public void greet(Tier t) {
        System.out.println(blue() + this + "\nHello, " + t + reset());
    }

    public void eat(int gramm) {
        System.out.println(this + " eats " + gramm + " gramm food!");
    }

    @Override
    public String toString() {
        return "Fisch [" + super.toString() + "]";
    }

    public void swim() {
        System.out.println(blue() + this + " swims around!" + reset());
    }
}

