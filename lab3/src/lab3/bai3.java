/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;

public class bai3 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("nhap n phan tu: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("nhap phan tu:");

        for (int i = 0; i < n; i++) {
        	
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
		
	}

}
