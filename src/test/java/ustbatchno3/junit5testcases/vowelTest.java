package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class vowelTest {
	

		 @Test

		 public void counttesting() {
		 String input ="sharath";
		 int expected=2;
		 int actual=vowelTest.vowelscount(input);
		 assertEquals(expected,actual);

		 }

		private static int vowelscount(String input) {
			char ch;
			int count=0;
			input.toLowerCase();
			for(int i=0;i<input.length();i++) {ch=input.charAt(i);
			    if((ch=='a')|(ch=='e')|(ch=='i')|(ch=='o')|(ch=='u')) {
			    	count++;
			    }
			}
			return count;
		}

		

}

