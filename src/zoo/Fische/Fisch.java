package zoo.Fische;


import zoo.Tier;


public abstract class Fisch extends Tier {

    protected Fisch(String name, String color) {
        super(name, color);
    }

    @Override
    public final void makeSound() {
        System.out.println(this + ": Glup!\n");
    }


    public void greet(Tier t) {
        System.out.println(this + "\nHello, " + t + "\n");
    }

    public void eat(int gramm) {
        System.out.println(this + " eats " + gramm + " gramm food! \n");
    }

    @Override
    public String toString() {

        return "Fisch [" + super.toString() + "]";
    }

    public void swim() {
        System.out.println(this + "swims around! \n");
    }

}

