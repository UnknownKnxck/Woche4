package zoo;

public abstract class Tier {
    final String name, color;

    protected Tier(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract void makeSound();

    public abstract void greet(Tier t);

    public abstract void eat(int gramm);

    final void sleep(int hours) {
        System.out.println(this + " sleeps for " + hours + " hours!");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return getName() + " - " + getColor();
    }


}

