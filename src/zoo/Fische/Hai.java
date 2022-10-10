package zoo.Fische;

public class Hai extends Fisch {

    public Hai(String name) {
        super(name, "grau");
    }

    @Override
    public String toString() {
        System.out.println("Hai [" + super.toString() + "]");

        return null;
    }


}

