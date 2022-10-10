import zoo.Fische.*;

public class Main {

    //TODO: FIX OUTPUT

    public static void main(String[] args) {
        // write your code here
        Lachs l = new Lachs("Lachs");
        Hai h = new Hai("Hai");

        l.greet(h);
        h.huntFish(l);
    }
}