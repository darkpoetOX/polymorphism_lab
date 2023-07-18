import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTest {

    private Shop shop;
    private List<Cake> stock;


    @BeforeEach
    public void setUp(){
        shop = new Shop("The BestCakes");
        stock = new ArrayList<>();


    }

    @Test
    public void canGetShopName(){

        assertThat(shop.getName()).isEqualTo("The BestCakes");
    }

    @Test
    public void canGetStock(){
        assertTrue(stock.isEmpty());//checking to see empty arrayList
    }

}
