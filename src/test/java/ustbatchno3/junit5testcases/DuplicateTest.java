package ustbatchno3.junit5testcases;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DuplicateTest {
	
	@Test
	public void namecheckcount() {
		List<String> name =Arrays.asList("sharath","kumar","sharath","ravi");
		String targetname="sharath";
		long  excepted=2;
		long actual= Duplicate.checkname(name, targetname);
		assertEquals(excepted,actual);
	}
    
}

