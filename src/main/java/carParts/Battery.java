package carParts;

public class Battery extends CarPart {

    private int maxDamage;

    public Battery(double value, int damage) {
        super(value, damage);
        this.maxDamage = 1;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }

}
