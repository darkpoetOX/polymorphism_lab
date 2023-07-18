import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ReviewTest {

    Review reviewer;

    @BeforeEach
    public void setUp(){
        reviewer = new Review("Joan");
    }

    @Test
    public void canReview(){
        String result = reviewer.review("This is the best cake shop ever!");
        assertThat(result).isEqualTo("Joan left: This is the best cake shop ever!");
    }
}
