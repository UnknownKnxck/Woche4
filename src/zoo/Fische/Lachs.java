package zoo.Fische;

public class Lachs extends Fisch {

    public Lachs(String name) {
        super(name, "blau");
    }

    @Override
    public String toString() {
        System.out.println("Lachs [" + super.toString() + "]");

        return null;
    }

}
