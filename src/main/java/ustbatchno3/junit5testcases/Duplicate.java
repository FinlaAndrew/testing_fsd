package ustbatchno3.junit5testcases;
import java.util.*;

public class Duplicate {

	public static long  checkname(List<String> name, String targetname) {
	
		return name.stream().filter(n->n.equalsIgnoreCase(targetname)).count();
	}
	
}

