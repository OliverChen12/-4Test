import org.example.Sum;
import org.junit.Test;

public class SumTest {
    @Test
    public void testSum(){
        Sum sum = new Sum();
        assert(sum.sum(1,1) == 2);
    }
}
