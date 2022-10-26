import zoo.Tier;
import zoo.Fische.*;
import zoo.Saugetiere.*;
import zoo.Vogel.*;

import java.util.*;

public class Zooverwaltung {
    private static final ArrayList<Tier> tiere = new ArrayList<Tier>();
    private final ArrayList<Tier> toAdd = new ArrayList<Tier>();

    public void addTier(Tier t) {
        if (t != null) {
            tiere.add(t);
        }
    }

    public void addFisch(int n) {
    }


    public void addVogel(int n) {
    }

    public void addSaugetier(int n) {
    }

    public static ArrayList getFische() {
        ArrayList<Tier> fische = new ArrayList<Tier>();
        tiere.forEach(tier -> {
            if (tier instanceof Fisch) {
                fische.add(tier);
            }
        });
        return fische;
    }

    public static ArrayList getSaugetiere() {
        ArrayList<Tier> saugetiere = new ArrayList<Tier>();
        tiere.forEach(tier -> {
            if (tier instanceof Saugetier) {
                saugetiere.add(tier);
            }
        });
        return saugetiere;
    }

    public static ArrayList getVogel() {
        ArrayList<Tier> vogel = new ArrayList<Tier>();
        tiere.forEach(tier -> {
            if (tier instanceof Vogel) {
                vogel.add(tier);
            }
        });
        return vogel;
    }

    public void doAction(Tier t) {
        Random r = new Random();
        int random = r.nextInt(5);
        switch (random) {
            //TODO: IF HAI -> HUNT
            case 1 -> t.makeSound();
            case 2 -> t.eat(r.nextInt(300));
            case 3 -> t.sleep(r.nextInt(4));
            case 4 -> t.greet(t);
        }
    }

    public void openZoo(int people) {
        if (people >= 200) {
            System.out.println("It's a good day. The zoo is full of people :)");
        } else if (people < 200) {
            System.out.println("It's not a good day for the zoo today... :(");

        }
    }

    public static void main(String[] args) {
        int inn;
        boolean end = false;

        Zooverwaltung zoo = new Zooverwaltung();
        Scanner scanner = new Scanner(System.in);
        while (!end) {
            System.out.println("Choose an action:\n[0]\tExit\n[1]\tPrint all animals\n[2]\tPrint all birds\n" +
                    "[3]\tPrint all mammals\n[4]\tPrint all fishes\n[5]\tOpen Zoo");
            inn = scanner.nextInt();

            switch (inn) {
                case 0 -> {
                    end = true; //to exit the loop and end the program
                    System.out.println("Bye!");
                }
                case 1 -> {
                    System.out.println("All animals:");
                    tiere.forEach(System.out::println);
                }
                case 2 -> {
                    if (getVogel().isEmpty()) {
                        System.out.println("There are currently no birds in the zoo!");
                    } else {
                        getVogel().forEach(System.out::println);
                    }
                }
                case 3 -> {
                    if (getSaugetiere().size() == 0) {
                        System.out.println("There are currently no mammals in the zoo!");
                    } else {
                        getSaugetiere().forEach(System.out::println);
                    }
                }
                case 4 -> {
                    if (getFische().isEmpty()) {
                        System.out.println("There are currently no fishes in the zoo.");
                    } else {
                        getFische().forEach(System.out::println);
                    }
                }
                case 5 -> {
                    //simulate a day in the zoo
                    System.out.println("How many people are in the zoo today?");
                    int people = scanner.nextInt();
                    zoo.openZoo(people);
                    tiere.forEach(zoo::doAction);
                }
                default -> System.out.println("Invalid input!");
            }
        }
    }
}