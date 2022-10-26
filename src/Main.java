import zoo.Fische.*;
import zoo.Saugetiere.*;
import zoo.Vogel.*;

public class Main {
    public static void main(String[] args) {
        Lachs l = new Lachs("Lachs");
        Hai h = new Hai("Hai");
        Capybara c = new Capybara("Gudrun", "pink");
        Pelikan p = new Pelikan("Gerda", "white");
        Tucan t = new Tucan("Alfons", "blue");
        Cow cc = new Cow("Herbert", "rainbow");
        Blobfish b = new Blobfish("Karlheinz", "grey");

        l.greet(h);
        l.swim();
        h.huntFish(l);
        c.greet(c);
        p.makeSound();
        cc.makeSound();
        t.eat(200);
        b.greet(b);
    }
}