package GitEclipse;

public class FirstClass {

	public static void main(String[] args) {
		String original = "Tamim";
		String reverse ="";
		for (int i = original.length()-1; i >=0 ; i--) {
			
			reverse= reverse+ original.charAt(i);
			
		}
		
		if ( original.equals(reverse)) {
			
			System.out.println("\nIt is a Palindrome");
		}else {
			System.out.println("\nIt is not a Palindrome");
		}

		String sh = "tamim";
		
		StringBuilder sb = new StringBuilder(sh);
		
		sb.reverse();
		System.out.println(String.valueOf(sb).equals(sh));
	System.out.println("================================");
System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);

}
}
