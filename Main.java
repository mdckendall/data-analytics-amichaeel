import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner userScanner = new Scanner(System.in);
		int input = 0;

		while (input != 5) {
			System.out.println("Press 1 to learn about salary.");
			System.out.println("Press 2 to learn about the job.");
			System.out.println("Press 3 to learn about demand.");
			System.out.println("Press 4 to view current students.");
			System.out.println("Press 5 to quit.");
			input = userScanner.nextInt();
			
			while (input < 0 || input > 5) {
				System.out.println(" ==> Please enter a number between 1 and 5.");
				input = userScanner.nextInt();
			}

			switch(input) {
				case 1:
				System.out.println("$98,345 average salary in South Florida!");
				break;

				case 2:
				System.out.println("US News - 100 Best Jobs!");
				break;

				case 3:
				System.out.println("Top 10 Forbes In-Demand Jobs!");
				break;

				case 4:
				System.out.println("Current Students:");
				File names = new File("./names.txt");
				Scanner readFile = new Scanner(names);
				while (readFile.hasNextLine()) {
					String name = readFile.nextLine();
					System.out.println(name);
				}
				break;

				case 5:
				break;
			}
		}

		userScanner.close();
		
	}
}