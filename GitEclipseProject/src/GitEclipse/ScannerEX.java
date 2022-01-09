package GitEclipse;

import java.util.Scanner;

public class ScannerEX {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter our name");
		String name=scanner.nextLine();
		String Boss = "Tamim";
		Boss +=name;
		if(Boss=="Tamim") {
			System.out.println("The right name");
		}else {
			System.out.println("Try again");
			scanner.nextLine();
		}

	}

}
