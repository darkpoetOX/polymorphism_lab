class TieredCake extends Cake {
    private int tiers;

    public TieredCake(String name, String baseFlavour, int tiers) {
        super(name, baseFlavour);
        this.tiers = tiers;
    }

    public int getTiers() {
        return this.tiers;
    }
}
