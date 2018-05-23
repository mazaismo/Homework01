import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String name;
		int a;
		int b;
		
		System.out.print("Ievadiet savu vârdu: ");
		name = input.next();
		System.out.print("Ievadiet ievadiet pirmo veselo skaitli: ");
		a = input.nextInt();
		System.out.print("Ievadiet ievadiet otro veselo skaitli: ");
		b = input.nextInt();
		
		if (a > b) {
			System.out.println(a + " ir lielâks par skaitli " + b);
		}
		else {
			if (a < b) {
				System.out.println(a + " ir mazâks par skaitli " + b);
			}
			else {
				System.out.println("Jûsu ievadîtie skaitïi ir vienâdi");
			}
			
		}
		
		if (name.length()< (a + b)) {
			System.out.println("Tavs vârds ir îsâks par ievadîto skaitïu summu");
		}
		else {
			if (name.length()> (a + b)) {
				System.out.println("Tavs vârds ir garâks par ievadîto skaitïu summu");
				
			}
			else {
				System.out.println("Tavs vârds ir vienâdâ garumâ ar ievadîto skaiïu summu");
			}
		}
	}

}
