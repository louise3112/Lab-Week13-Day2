package components;

public abstract class Component implements IFix {
    private double value;
    private int damage;

    public Component(double value, int damage) {
        this.value = value;
        this.damage = damage;
    }

    public double getValue() {
        return this.value;
    }

    public int getDamage() {
        return this.damage;
    }

    public void fix() {
        this.damage = 0;
    }

    public void damage() {
        this.damage += 1;
    }

}
