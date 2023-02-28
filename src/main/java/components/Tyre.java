package components;

public class Tyre extends Component {

    private int maxDamage;

    public Tyre (double value, int damage) {
        super(value, damage);
        this.maxDamage = 3;
    }


    public int getMaxDamage() {
        return this.maxDamage;
    }



}
