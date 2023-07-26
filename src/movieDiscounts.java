import java.util.Scanner;

public class movieDiscounts {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Escirbe la edad ");
		int edad = in.nextInt();
		float descuento = 0F; 
		int ticket = 127;
		float total = 0F;
		if (edad > 60) {
			descuento = 1.6F ;
			total = (ticket * descuento)-ticket;
		}else if (edad < 5 ){
			descuento = 1.55F ;
			total = (ticket * descuento)-ticket;
		}else {
			total = ticket;
		}
		System.out.println("El coso del ticket es : " + total);
		in.close();

	}

}
