package ustbatchno3.junit5testcases;


import org.junit.Test;

public class AppevenTest {
	@Test
	
	public void testeven()
	{
		int n=10;
		boolean result = isEven(n);
		assertTrue(result);
	}
	private void assertTrue(boolean result) {
		//TODO Auto-generated method stub
	}
	public void testodd()
	{
		int n = 9;
		boolean result = isEven(n);
		assertFalse(result);
	}
	private void assertFalse(boolean result) {
		//TODO Auto-generated method stub
	}
public boolean isEven(int n) {
	return n%2==0;
}
}
