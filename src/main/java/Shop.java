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
//  private double till;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.cupcakeNames = Arrays.asList("Vanilla Cupcake", "Chocolate Cupcake", "Strawberry Cupcake");
        this.cupcakeFlavours = Arrays.asList("Vanilla", "Chocolate", "Strawberry");
        this.tieredCakeNames = Arrays.asList("Wedding Cake", "Birthday Cake", "Anniversary Cake");
        this.tieredCakeFlavours = Arrays.asList("Vanilla", "Chocolate", "Strawberry");
        this.trayBakeNames = Arrays.asList("Banana Bread", "Carrot Cake", "Lemon Bars");
        this.trayBakeFlavours = Arrays.asList("XtrmIcing", "Lettuce", "Avocado");
//      this.till = till;
    }

    public String getName(){
        return this.name;
    }

    public List<Cake> getStock() {
        return this.stock;
    }

//    public double getTill() {
//        return this.till;
//    }
//
//    public void setTill(double till) {
//        this.till = till;
//    }

}
