
import java.util.Scanner;

public class BasicMath {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int i;
			double d;
			
			System.out.print("Ievadiet veselu skaitli: ");
			i = input.nextInt();
			System.out.print("Ievadiet ievadiet skaitli ar komatu: ");
			d = input.nextDouble();
			
			double sum = i + d;
			double sub = i - d;
			double div = i / d;
			double mult = i * d; 
			
			System.out.println("jûsu ievadito skaitïu summa ir: " + sum);
			System.out.println("jûsu ievadito skaitïu starpîba ir: " + sub);
			System.out.println("jûsu ievadito skaitïu dalîjums ir: " + div);
			System.out.println("jûsu ievadito skaitïu reizinâjums ir: " + mult);

		}
}
