package GitEclipse;

import java.util.Scanner;

public class ScannerEX {

	public static void main(String[] args) {
		String Boss = "Tamim";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter our name");
		String name=scanner.nextLine();
		if(Boss=="Tamim") {
			System.out.println("The right name");
		}else {
			System.out.println("Try again");
			scanner.nextLine();
		}

	}

}
