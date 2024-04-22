import org.junit.jupiter.api.Test;

import caculator.Caculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CaculatorTest {
    @Test
    public void testAdd() {
		Caculator myUnit = new Caculator();
        int result = myUnit.add(2, 3);
        assertEquals(result, 5);
    }
 
    @Test
    public void testSubtract() {
    	Caculator myUnit = new Caculator();
        int result = myUnit.subtract(6, 4);
        assertEquals(result, 2);
    }
}
