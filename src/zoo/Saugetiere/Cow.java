package zoo.Saugetiere;

public class Cow extends Saugetier {

    public Cow(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void eat(int gramm) {

    }

    @Override
    public String toString() {
        return "Cow [" + super.toString() + "]";
    }
}
