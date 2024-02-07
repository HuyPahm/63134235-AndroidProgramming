/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
public class bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập n sinh viên: ");
	        int n = scanner.nextInt();

	        String[] hoTen = new String[n];
	        double[] diem = new double[n];
	        String[] hocLuc = new String[n];

	        System.out.println("Nhập thông tin cho từng sinh viên:");
	        for (int i = 0; i < n; i++) {
	            scanner.nextLine(); // Đọc bỏ dòng trống
	            System.out.println("Sinh viên thứ " + (i + 1) + ":");
	            System.out.print("Họ tên: ");
	            hoTen[i] = scanner.nextLine();
	            System.out.print("Điểm: ");
	            diem[i] = scanner.nextDouble();

	           
	            if (diem[i] < 5) {
	                hocLuc[i] = "Yếu";
	            } else if (diem[i] < 6.5) {
	                hocLuc[i] = "Trung bình";
	            } else if (diem[i] < 7.5) {
	                hocLuc[i] = "Khá";
	            } else if (diem[i] < 9) {
	                hocLuc[i] = "Giỏi";
	            } else {
	                hocLuc[i] = "Xuất sắc";
	            }
	        }

	        System.out.println("Danh sách sinh viên đã nhập:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Sinh viên thứ " + (i + 1) + ":");
	            System.out.println("Họ tên: " + hoTen[i]);
	            System.out.println("Điểm: " + diem[i]);
	            System.out.println("Học lực: " + hocLuc[i]);
	            System.out.println();
	        }

	        // Sắp xếp danh sách theo điểm tăng dần
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (diem[j] > diem[j + 1]) {
	                    // Hoán đổi điểm
	                    double tempDiem = diem[j];
	                    diem[j] = diem[j + 1];
	                    diem[j + 1] = tempDiem;

	                    // Hoán đổi họ tên
	                    String tempHoTen = hoTen[j];
	                    hoTen[j] = hoTen[j + 1];
	                    hoTen[j + 1] = tempHoTen;

	                    // Hoán đổi học lực
	                    String tempHocLuc = hocLuc[j];
	                    hocLuc[j] = hocLuc[j + 1];
	                    hocLuc[j + 1] = tempHocLuc;
	                }
	            }
	        }

	        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm tăng dần:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Sinh viên thứ " + (i + 1) + ":");
	            System.out.println("Họ tên: " + hoTen[i]);
	            System.out.println("Điểm: " + diem[i]);
	            System.out.println("Học lực: " + hocLuc[i]);
	            System.out.println();
	        }

	        scanner.close();
	}

}
