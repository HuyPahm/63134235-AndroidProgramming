/**
 * 
 */
package lab5;

/**
 * 
 */
import java.util.Scanner;
public class bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Nhập b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Nhập c: ");
	        double c = scanner.nextDouble();

	        double delta = b * b - 4 * a * c;
	}

}
