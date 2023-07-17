class TrayBake extends Cake {
    private boolean isHealthy;



    public TrayBake(String name, String baseFlavour, boolean isHealthy) {
        super(name, baseFlavour);
        this.isHealthy = isHealthy;
    }

    public boolean isHealthy() {
        if(this.baseFlavour == "Lettuce" || "Avocado"){
            return true;
        }
        return false;
    }
}
