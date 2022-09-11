import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MaxServiceTest {
    @Test
    public void shouldFindMax() {
        MaxService service = new MaxService();

        int a = 5;
        int b = 3;

        int expected = a;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindMax2() {
        MaxService service = new MaxService();

        int a = 3;
        int b = 5;

        int expected = b;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

}
