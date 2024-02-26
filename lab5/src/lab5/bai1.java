/**
 * 
 */
package lab5;

/**
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        List<Double> numberList = new ArrayList<>();

	        while (true) {
	            System.out.print("Nhập: ");
	            String input = scanner.nextLine();

	            if (input.equalsIgnoreCase("N")) {
	                break;
	            }

	            try {
	                double number = Double.parseDouble(input);
	                numberList.add(number);
	            } catch (NumberFormatException e) {
	                System.out.println("Số sai.");
	            }
	        }

	        System.out.println("Danh sách số thực đã nhập:");
	        for (double number : numberList) {
	            System.out.println(number);
	        }

	        double sum = 0;
	        for (double number : numberList) {
	            sum += number;
	        }

	        System.out.println("Tổng của danh sách số thực: " + sum);
	    }
	}