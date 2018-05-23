
import java.util.Scanner;

public class GreetingInteractive {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Ievadiet savu vârdu: ");
		name = input.next();
		System.out.print("Ievadiet savu vecumu: ");
		age = input.nextInt();
		
		System.out.println("Sveiki, mani sauc " + name + " esmu " + age + " gadus vecs.");


	}

}
