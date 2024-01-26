/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Arrays;
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

        System.out.print("nhap phan tu:\n");

        for (int i = 0; i < n; i++) {
        	System.out.print("phan tu thu" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        Arrays.sort(arr);

        System.out.println("\nmang da sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
		
	}

}
