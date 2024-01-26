/**
 * 
 */
package lab3;

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
//		System.out.print("nhap n: ");
//		int x= scanner.nextInt();
		for(int j=1;j<=9;j++) {
			
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d x %d = %d \n",j,i,j*i );
			
			}
		}
		
		
		
		scanner.close();
	}

}
