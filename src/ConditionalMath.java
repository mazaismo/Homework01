import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String name;
		int a;
		int b;
		
		System.out.print("Ievadiet savu v�rdu: ");
		name = input.next();
		System.out.print("Ievadiet ievadiet pirmo veselo skaitli: ");
		a = input.nextInt();
		System.out.print("Ievadiet ievadiet otro veselo skaitli: ");
		b = input.nextInt();
		
		if (a > b) {
			System.out.println("Pirmais ievad�tais skaitlis ir liel�ks par otru");
		}
		else {
			if (a < b) {
				System.out.println("Otrais ievad�tais skaitlis ir liel�ks par pirmo");
			}
			else {
				System.out.println("J�su ievad�tie skait�i ir vien�di");
			}
			
		}
		
		if (name.length()< (a + b)) {
			System.out.println("Tavs v�rds ir �s�ks par ievad�to skait�u summu");
		}
		else {
			if (name.length()> (a + b)) {
				System.out.println("Tavs v�rds ir gar�ks par ievad�to skait�u summu");
				
			}
			else {
				System.out.println("Tavs v�rds ir vien�d� garum� ar ievad�to skai�u summu");
			}
		}
	}

}
