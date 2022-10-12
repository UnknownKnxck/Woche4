package zoo.Fische;

import zoo.Tier;

import java.util.Random;

public class Hai extends Fisch {

    public Hai(String name) {
        super(name, "grey");
    }

    @Override
    public String toString() {
        return "Hai [" + super.toString() + "]";
    }

    public void huntFish(Fisch f) {
        System.out.println(this + " hunts " + f + "!");
        int random = (int) (Math.random() * 3 + 1); // Random Generator: 1-3

        if (random == 0 || random == 1) { //33,33% chance to catch fish
            System.out.println("The fish was able to escape!");
        } else {
            System.out.println("The fish is dead!");
        }
    }
}

