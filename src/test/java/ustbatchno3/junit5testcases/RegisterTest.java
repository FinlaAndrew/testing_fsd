package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RegisterTest {
	
	@Test
	public void vehicaltest() {
		//String state = "KL";
		int dis = 7;
		String expected = "Ernakulam";
		assertEquals(expected,Register.district(dis));
	}
}
