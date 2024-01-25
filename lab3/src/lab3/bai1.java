/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
public class bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n: ");
		double n = scanner.nextDouble();
		boolean ok = true;
	for(int i=2;i<=n-1;i++)
	{
		if(n%i==0)
		{
			ok =false;
			break;
		}
		
	}
	if(ok) {
		System.out.println(n+ " là số nguyên tố");
	}else {
		System.out.println(n+  " k phải");
	}
	scanner.close();
	}

}
