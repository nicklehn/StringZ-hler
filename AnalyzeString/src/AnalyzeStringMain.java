import java.util.Scanner;

public class AnalyzeStringMain {

	public static void main(String[] args) {
		
		counter(input());

	}

	
	public static String input() {
		
		String inputString = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eingabe: ");
		inputString = scanner.nextLine();
		
		return inputString;
		
	}
	
	public static void counter(String input) {
		
		input = input.toLowerCase();
		
		char[] inputArray = input.toCharArray();
		
		int letterCounter = 0;
		int spaceCounter = 0;
		int charCounter = 0;
		
		for (int i = 0; i<inputArray.length; i++) {
			
			if(inputArray[i] > 96 && inputArray[i] < 123) {
				letterCounter++;
			}
			else if (inputArray[i] == 32){
				spaceCounter++;
			}
			else {
				charCounter++;
			}
			
		}
		
		System.out.println("Buchstaben: " + letterCounter);
		System.out.println("Leerzeilen: " + spaceCounter);
		System.out.println("Sonderzeichen: " + charCounter);
	
	}
	
}
