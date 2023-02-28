package components;

public class Engine extends Component {

    // private HashMap<Size, Double> prices;
    // private Size size;
    private int maxDamage;
    // private double batterySurcharge;

    //public Engine(double compactPrice, double midsizePrice, double familyPrice, int damage) {
        // this.prices = new HashMap<>();
        // this.prices.put(size.COMPACT, compactPrice);
        // this.prices.put(size.MIDSIZE, midsizePrice);
        // this.prices.put(size.FAMILY, familyPrice);
    public Engine(double value, int damage) {
        super(value, damage);
        this.maxDamage = 5;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }


//    public double getBatterySurcharge() {
//        return this.batterySurcharge;
//    }
//
//    public void setPrices() {
//        for (Map.Entry<Size, Double> entry : prices.entrySet()) {
//            entry.setValue(entry.getValue() * batterySurcharge);
//        }
//    }
}
