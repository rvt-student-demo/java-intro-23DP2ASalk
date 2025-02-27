package lv.rvt;
import org.junit.Test;
import lv.rvt.*;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testingLesserThanCase1() {
        Money money1 = new Money(1, 50);
        Money money2 = new Money(0, 50);
        
        assertTrue(money2.lessThan(money1));
        
    }
}