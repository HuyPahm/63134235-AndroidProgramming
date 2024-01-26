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
        System.out.println("mang da nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
       
        //1
        Arrays.sort(arr);

        System.out.println("\nmang da sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //2
        int min = arr[0];
//        for(int i=1;i<n;i++)
//        {
//        	min = Math.min(min,arr[i]);
//        }
        for(int i=1;i<n;i++) {
        	if(arr[i]< min) {
        		min = arr[i];
        	}
        }
        System.out.println("\nmin : "+ min);
        //3
        int s =0;
        int dem=0;
        for(int i=0;i<n;i++) {
        	if(arr[i] %3 ==0) {
        		s+=arr[i];
        		dem++;
       
        	}
        } 
        double kq = s/dem;
        System.out.println("TBC: "+kq);
        scanner.close();
		
	}

}
