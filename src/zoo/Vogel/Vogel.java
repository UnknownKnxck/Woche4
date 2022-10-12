package zoo.Vogel;

public abstract class Vogel extends zoo.Tier {

    protected Vogel(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "Vogel [" + super.toString() + "]";
    }

    @Override
    public void makeSound() {
        System.out.println(this + ": KRAH!");
    }

    @Override
    public void eat(int gramm) {
        System.out.println(this + " eats " + gramm + " gramm food!");
    }
}
