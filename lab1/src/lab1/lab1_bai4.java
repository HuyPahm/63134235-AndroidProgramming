package lab1;

import java.util.Scanner;
public class lab1_bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap a: ");
		double a = scanner.nextDouble();
		System.out.print("nhap b:");
		double b = scanner.nextDouble();
		System.out.print("nhap c: ");
		double c = scanner.nextDouble();
		double denlta = Math.pow(b, 2) -4*a*c;
		double canden = Math.sqrt(denlta);
		System.out.printf("denlta: " +denlta);
		System.out.printf("căn denlta: " + canden);
		scanner.close();
	}

}
