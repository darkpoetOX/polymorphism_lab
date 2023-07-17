public class Cupcake extends Cake {

    private String[] toppings;

    public Cupcake(String name, String baseFlavour, String[] toppings) {
        super(name, baseFlavour);
        this.toppings = toppings;
    }

    public String[] getToppings() {
        return this.toppings;
    }
}
