class TieredCake extends Cake {
    private int tiers;//we can do tiers that go up to the sky!

    public TieredCake(String name, String baseFlavour, double price, int tiers) {
        super(name, baseFlavour, price);
        this.tiers = tiers;
    }

    public int getTiers() {
        return this.tiers;
    }

    public void displayMenu() {
        System.out.println("Name of cake: " + getName());
        System.out.println("Name of base flavour: " + getBaseFlavour());
        System.out.println("Number of tiers: " + tiers);
        System.out.println("Price: $" + getPrice());
    }

    public double calculateTotalPriceOfCake(int quantity) {
        return getPrice() * quantity;
    }
}
