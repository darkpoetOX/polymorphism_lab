import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    private TieredCake tieredCake;

    @BeforeEach
    public void setUp(){
        String name = "Wedding Cake";
        String baseFlavour = "Strawberry";
        double price = 19.0;
        int tiers = 2;
        tieredCake = new TieredCake(name, baseFlavour, price, tiers);
    }

    @Test
    public void getTieredCakeName(){
        assertThat(tieredCake.getName()).isEqualTo("Wedding Cake");
    }

    @Test
    public void getTieredCakeBaseFlavour(){
        assertThat(tieredCake.getBaseFlavour()).isEqualTo("Strawberry");
    }

    @Test
    public void getTieredCakeTiers() {
        assertThat(tieredCake.getTiers()).isEqualTo(2);
    }

    @Test
    public void getTieredCakePrice() {
        assertThat(tieredCake.getPrice()).isEqualTo(19.0);
    }

    @Test
    public void getCalculateTotalPriceOfCake() {
        assertThat(tieredCake.calculateTotalPriceOfCake(4)).isEqualTo(76.0);
    }

    @Test
    public void canGetAmount() {
        assertThat(tieredCake.getAmount(3)).isEqualTo("You have 3");
    }

}
