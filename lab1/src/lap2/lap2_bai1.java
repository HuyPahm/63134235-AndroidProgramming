/**
 * 
 */
package lap2;

/**
 * 
 */		
	import java.util.Scanner;
public class lap2_bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("nhap a: ");
		double a = scanner.nextDouble();
		System.out.print("nhap b: ");
		double b = scanner.nextDouble();
		
		if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
		scanner.close();
	}
	
}
