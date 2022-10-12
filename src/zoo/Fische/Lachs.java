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
    public void greet(Tier t) { //TODO: CHECK IF OBJECT IS HAI
        if (t instanceof Hai) {
            System.out.println(this + " schwimmt um sein Leben!");
        } else {
            super.greet(t);
        }
        super.greet(t);
    }
}
