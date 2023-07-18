class TrayBake extends Cake {
    private boolean isHealthy;



    public TrayBake(String name, String baseFlavour, double price) {
        super(name, baseFlavour, price);
        this.isHealthy = true;
    }

    public boolean isHealthy() {
        if (this.baseFlavour.equals("ExtremeIcing")) {
            return false;
        }
        return true;
    }
    public void displayMenu() {
        System.out.println("Name of traybake: " + getName());
        System.out.println("Name of base flavour: " + getBaseFlavour());
        System.out.println("Healthy option?: " + isHealthy);
        System.out.println("Price: $" + getPrice());
    }

    public double calculateTotalPriceOfCake(int quantity) {
        return getPrice() * quantity;
    }
}
