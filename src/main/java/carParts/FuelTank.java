package carParts;

public class FuelTank extends CarPart {

    private int maxDamage;

    public FuelTank(double value, int damage) {
        super(value, damage);
        this.maxDamage = 3;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }

}
