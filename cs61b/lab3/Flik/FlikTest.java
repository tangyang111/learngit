/**
 * Created by ty on 2017/4/19.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class FlikTest {
    @Test
    public void testIsSameNumber() {
        int i = 127;
        int j = 127;
        assertTrue(Flik.isSameNumber(i, j));
    }
}
