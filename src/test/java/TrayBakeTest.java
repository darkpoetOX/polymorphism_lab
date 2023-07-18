import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrayBakeTest {
    private TrayBake trayBake;
    @BeforeEach
    public void setUp() {
        String name = "Carrot Cake";
        String baseFlavour = "ExtremeIcing";
        double price = 9.0;
        trayBake = new TrayBake(name, baseFlavour, price);
    }

    @Test
    public void getTrayBakeName(){
        assertThat(trayBake.getName()).isEqualTo("Carrot Cake");
    }

    @Test
    public void getTrayBakeBaseFlavour(){
        assertThat(trayBake.getBaseFlavour()).isEqualTo("ExtremeIcing");
    }

    @Test
    public void testTrayBakeIsHealthy() {
        assertThat(trayBake.isHealthy()).isEqualTo(false);
    }

    @Test
    public void getTrayBakePrice() {
        assertThat(trayBake.getPrice()).isEqualTo(9.0);
    }

    @Test
    public void getCalculateTotalPriceOfCake() {
        assertThat(trayBake.calculateTotalPriceOfCake(5)).isEqualTo(45.0);
    }

    @Test
    public void canGetAmount() {
        assertThat(trayBake.getAmount(3)).isEqualTo("You have 3");
    }
}
