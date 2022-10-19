import zoo.Fische.*;
import zoo.Saugetiere.*;
import zoo.Vogel.*;

public class Main {
    public static void main(String[] args) {
        Lachs l = new Lachs("Lachs");
        Hai h = new Hai("Hai");
        Capybara c = new Capybara("Capybara", "pink");
        Pelikan p = new Pelikan("Pelikan", "white");
        Tucan t = new Tucan("Tukan", "blue");
        Cow cc = new Cow("Cow", "rainbow");

        l.greet(c);
        l.swim();
        h.huntFish(l);
        c.greet(c);
        p.makeSound();
        cc.makeSound();
        t.eat(200);
    }
}