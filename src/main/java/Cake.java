public abstract class Cake {
    protected String name;
    protected String baseFlavour;

    public Cake(String name, String baseFlavour) {
        this.name = name;
        this.baseFlavour = baseFlavour;
    }

    public String getName() {
        return name;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }
}
