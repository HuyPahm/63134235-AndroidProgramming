package lab1;
import java.util.Scanner;

public class lab1_bai3 {

	public static void main(String[] argv) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("nhap canh hinh lap phuong: ");
		double canh = scanner.nextDouble();
		double V = Math.pow(canh,3);
		System.out.printf("thể tích: " +V);
		scanner.close();
	}
}
