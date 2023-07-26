import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Escribe el número de mes (1-12): ");
		int month = in.nextInt();
		switch (month) {
		// se pueden agrupar las variables
		case 1,3,5,7,8,10,12: 
			System.out.println("31");
			break;
		case 4,6,9,11:
			System.out.println("30");
		break;
		case 2:
			System.out.println("28/29");
			break;
		default:
			System.out.println("No es un mes valido");
			break;
		}
		in.close();
		}
}
