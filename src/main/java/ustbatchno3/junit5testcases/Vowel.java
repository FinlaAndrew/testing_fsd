package ustbatchno3.junit5testcases;



public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s = "Finla";
	    count=vowelscount(s);
		System.out.println(count);
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
