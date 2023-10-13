package sample_1;

public class PossibleCombinationsString {

	//**sekhar** Use StringBuilder to Modify the string 
	private StringBuilder output = new StringBuilder();
	private final String inputstring;
	public PossibleCombinationsString(final String str) {
		inputstring = str;
		System.out.println("The input string  is  : " + inputstring);
	}
	public static void main(String args[]) {		
		// **sekhar** Enter your input string
		PossibleCombinationsString combobj = new PossibleCombinationsString("wxyz");

		System.out.println("All possible combinations are :  ");
		combobj.combine();
	}

	//**Sekhar** Method Loading for Combine method
	public void combine() {
		combine(0);
	}
	private void combine(int start) {
		for (int i = start; i < inputstring.length(); ++i) {
	// **Sekhar** If length less, append to the o/p string
			output.append(inputstring.charAt(i));
			System.out.print(output + "  ");
			if (i < inputstring.length())
				combine(i + 1);
	// **Sekhar** If lenght more, first decrement the length
			output.setLength(output.length() - 1);
		}
	}
}
