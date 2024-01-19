package lab1;

import java.util.Scanner;

public class lab1_bai2 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		System.out.print("nhap chieu dai: ");
		double cdai = scanner.nextDouble();
		System.out.print("nhap chieu rong: ");
		double crong = scanner.nextDouble();
		double chuvi = 2*(cdai+crong);
		double S = cdai*crong;
		double cnho = Math.min(cdai, crong);
		System.out.println("chu vi: " + chuvi);
		System.out.println("dien tich: " + S);
		System.out.println("cạnh nhỏ nhất: "+ cnho);
		scanner.close();
	}
}
