public class Cupcake extends Cake {

    private String[] toppings;//can take in as many toppings as you want.

    public Cupcake(String name, String baseFlavour, double price, String[] toppings) {
        super(name, baseFlavour, price);
        this.toppings = toppings;
    }

    public String[] getToppings() {
        return this.toppings;
    }

    public void displayMenu() {
        System.out.println("Name of cupcake: " + getName());
        System.out.println("Name of base flavour: " + getBaseFlavour());
        System.out.println("Your options for toppings are: ");
        for (String topping : toppings) {
            System.out.println("* " + topping);
        }
        System.out.println("Price: $" + getPrice());
    }
    public double calculateTotalPriceOfCake(int quantity) {
        return getPrice() * quantity;
    }

    public String rateCupcake(int firstNumber, int secondNumber){ //method overloading1
        return "You rated this cupcake: " + firstNumber + " " + secondNumber; //i.e. 1 1 means highest rating (equivalent to A A below), 2 2 means second highest or B B etc.

    }

    public String rateCupcake(String firstLetter, String secondLetter){ //method overloading2
        return "You rated this cupcake: " + firstLetter + " " + secondLetter;//i.e. A A means highest rating (equivalent to 1 1 above), B B means second highest or 2 2 etc.

    }
}
