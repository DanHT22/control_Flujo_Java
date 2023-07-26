import java.util.Scanner;

public class comissionCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Escirbe el total del ticket: ");
		float ticket = in.nextFloat();
		char comision = 0; 
		float total = 0F;
		if (ticket >= 10000) {
			comision = '3' ;
			total = ticket * 0.3F;
		}else if (ticket >= 5000 && ticket<=9999 ){
			comision='2';
			total = ticket * 0.2F;
		}else if (ticket >= 1000 && ticket<=4999 ){
			comision='1';
			total = ticket * 0.1F;
		}else if (ticket >= 1000 ){
			comision='0';
			total = ticket;
		}
		System.out.println("comision = " + total);
		in.close();
	}

}
