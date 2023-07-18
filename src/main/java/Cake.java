public abstract class Cake {
    protected String name;
    protected String baseFlavour;
    private double price;//takes price for only the cake names not all the prices of their different combinations of flavours and types...that would be too long to code.

    private int amount;

    public Cake(String name, String baseFlavour, double price) {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.price = price;
        this.amount = amount;

    }

    public String getName() {
        return this.name;
    }

    public String getBaseFlavour() {
        return this.baseFlavour;
    }

    public double getPrice() {
        return this.price;
    }

    public String getAmount(int amount) { //not using quantity here as I am experimenting with something.
        return "You have " + amount;
    }

    public abstract double calculateTotalPriceOfCake(int quantity);//i think this is a semi-abstract method because it has an abstract modifier but takes a body...not sure.


    public abstract void displayMenu(); //This is my abstract method as it has no body. Also, I don't test this method in the subclasses as each subclass already has the individual attributes/methods tested in their corresponding test files.


}
