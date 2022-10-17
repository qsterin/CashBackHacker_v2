import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {

    @Test
    public void OverAThousand() {
        int amount = 1850;
        int expected = 150;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void Thousand() {
        int amount = 1000;
        int expected = 1000;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void LessThanAThousand() {
        int amount = 851;
        int expected = 149;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void Null() {
        int amount = 0;
        int expected = 1000;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void One() {
        int amount = 999;
        int expected = 1;
        CashBackService service = new CashBackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}