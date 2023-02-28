package components;

public class Windscreen extends Component {

    // private HashMap<Size, Double> prices;
    // private Size size;
    private int maxDamage;

    public Windscreen (double value, int damage) {
    //public Windscreen (double compactPrice, double midsizePrice, double familyPrice) {
        // this.prices = new HashMap<>();
        // this.prices.put(size.COMPACT, compactPrice);
        // this.prices.put(size.MIDSIZE, midsizePrice);
        // this.prices.put(size.FAMILY, familyPrice);
        super(value, damage);
        this.maxDamage = 1;
    }

//    public double getPriceBySize(Size sizeToGet) {
//        return this.prices.get(sizeToGet);
//    }

    public int getMaxDamage() {
        return this.maxDamage;
    }


}
