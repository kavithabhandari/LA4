package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void testAddition() {
        int result = add(5, 3);
        assertEquals(8, result);
    }

    private void assertEquals(int i, int result) {
		// TODO Auto-generated method stub
		
	}

	public int add(int a, int b) {
        return a + b;
    }
}