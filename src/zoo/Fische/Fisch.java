package zoo.Fische;

import zoo.Tier;

public abstract class Fisch extends zoo.Tier {

    protected Fisch(String name, String color) {
        super(name, color);
    }

    final void makeSound() {
        System.out.println(this + ": Glup!");
    }

    public void greet(Tier t) {
        System.out.println(this + "Hello, " + t);
    }

    public void eat(int gramm) {
        System.out.println(this + " eats " + gramm + " gramm!");
    }

    @Override
    public String toString() {
        System.out.println("Fish [" + super.toString() + "]");

        return null;
    }

    public void swim() {
        System.out.println(this + "swims around!");
    }

}

