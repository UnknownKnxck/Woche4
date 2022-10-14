package zoo.Fische;

import zoo.Tier;

public class Lachs extends Fisch {
    public Lachs(String name) {
        super(name, "blue");
    }

    @Override
    public String toString() {
        return "Lachs [" + super.toString() + "]";
    }

    @Override
    public void greet(Tier t) {
        if (t instanceof Hai) { //check if object t is Hai
            System.out.println(this + " swims away from " + t);
        } else {
            super.greet(t);
        }
    }
}
