import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {

    private String name;
    private List<Cake> stock;
    private List<String> cupcakeNames;
    private List<String> cupcakeFlavours;
    private List<String> tieredCakeNames;
    private List<String> tieredCakeFlavours;
    private List<String> trayBakeNames;
    private List<String> trayBakeFlavours;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.cupcakeNames = Arrays.asList("Delight Cupcake", "Starburst Cupcake", "Custard Cupcake");
        this.cupcakeFlavours = Arrays.asList("Vanilla", "Chocolate", "Strawberry");
        this.tieredCakeNames = Arrays.asList("Wedding Cake", "Birthday Cake", "Anniversary Cake");
        this.tieredCakeFlavours = Arrays.asList("Vanilla", "Chocolate", "Strawberry");
        this.trayBakeNames = Arrays.asList("Banana Bread", "Carrot Cake", "Lemon Bars");
        this.trayBakeFlavours = Arrays.asList("ExtremeIcing", "Lettuce", "Avocado");
    }

    public String getName(){
        return this.name;
    }

    public List<Cake> getStock() { //Don't know how to directly test this with the AssertThat method.
        return this.stock;
    }

//    public void overallTotal(){
//        for (Cake cake : stock) {
//            cake.displayMenu();
//            int quantity = 7;
//            double totalPrice = cake.calculateTotalPriceOfCake(quantity);
//            System.out.println("Total Price for " + quantity + " " + cake.getName() + ": $" + totalPrice);
//            System.out.println();
//        }
//    } //Not enough time to test.

}
