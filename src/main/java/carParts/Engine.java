package carParts;

public class Engine extends CarPart {

    private int maxDamage;

    public Engine(double value, int damage) {
        super(value, damage);
        this.maxDamage = 5;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }

}

// Commented out code using hashmaps:
// private HashMap<Size, Double> prices;
// private Size size;

//public Engine(double compactPrice, double midsizePrice, double familyPrice, int damage) {
//    this.prices = new HashMap<>();
//    this.prices.put(size.COMPACT, compactPrice);
//    this.prices.put(size.MIDSIZE, midsizePrice);
//    this.prices.put(size.FAMILY, familyPrice);
// }

// public void setPrices() {
//      for (Map.Entry<Size, Double> entry : prices.entrySet()) {
//          entry.setValue(entry.getValue() * batterySurcharge);
//      }
// }