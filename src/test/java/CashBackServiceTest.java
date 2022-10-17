import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackServiceTest {

    @Test
    void OverAThousand() {
        int amount = 1850;
        int expected = 150;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void Thousand() {
        int amount = 1000;
        int expected = 1000;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void LessThanAThousand() {
        int amount = 851;
        int expected = 149;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void Null() {
        int amount = 0;
        int expected = 1000;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void One() {
        int amount = 999;
        int expected = 1;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}