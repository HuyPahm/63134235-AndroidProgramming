/**
 * 
 */
package lap2;

/**
 * 
 */
import java.util.Scanner;
public class lab2_bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so dien: ");
		double dien = scanner.nextDouble();
		double tien = scanner.nextDouble();
		if(dien<50)
		{
			tien = dien*1000;
//			System.out.println("gia tien: " +tien);
		}else {
			tien = 50*1000+(dien-50)*1200;
//			System.out.println("gia tien: " +tien);
		}
		System.out.println("Số tiền điện cần thanh toán là: " + tien + " VND");
		scanner.close();
	}

}
