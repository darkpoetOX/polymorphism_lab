import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CupcakeTest {

    private Cupcake cupcake;
    @BeforeEach
    public void setUp() {
        String name = "Delight Cupcake";
        String baseFlavour = "Vanilla";
        String[] toppings = {"Sprinkles", "Cherry"};
        double price = 2.0;
        cupcake = new Cupcake(name, baseFlavour, price, toppings);
    }
    @Test
    public void getCupcakeName(){
    assertThat(cupcake.getName()).isEqualTo("Delight Cupcake");
    }

    @Test
    public void getCupcakeBaseFlavour(){
        assertThat(cupcake.getBaseFlavour()).isEqualTo("Vanilla");
    }

    @Test
    public void getCupcakeToppings(){
        String[] expectedToppings = {"Sprinkles", "Cherry"};
        assertArrayEquals(cupcake.getToppings(), expectedToppings);
    }

    @Test
    public void getCupcakePrice() {
        assertThat(cupcake.getPrice()).isEqualTo(2.0);
    }

    @Test
    public void getCalculateTotalPriceOfCake() {
        assertThat(cupcake.calculateTotalPriceOfCake(5)).isEqualTo(10.0);
    }

    @Test
    public void canRateCupcake1() {
        assertThat(cupcake.rateCupcake(1, 1)).isEqualTo("You rated this cupcake: 1 1");
    }

    @Test
    public void canRateCupcake2() {
        assertThat(cupcake.rateCupcake("A", "A")).isEqualTo("You rated this cupcake: A A");
    }

    @Test
    public void canGetAmount() {
        assertThat(cupcake.getAmount(3)).isEqualTo("You have 3");
    }

}
