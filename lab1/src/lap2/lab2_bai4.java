/**
 * 
 */
package lap2;

/**
 * 
 */
import java.util.Scanner;
public class lab2_bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int choice;
		System.out.println("----- MENU -----");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tiền điện");
        System.out.println("4. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
        choice = scanner.nextInt();
        switch (choice) {
        case 1:
            chucNang1();
            break;
        case 2:
            chucNang2();
            break;
        case 3:
            chucNang3();
            break;
        default:
            System.out.println("thoát.");
    }

    System.out.println();
}

//scanner.close();


public static void chucNang1() {
System.out.println("Đây là chức năng 1.");
// Thực hiện các tác vụ của chức năng 1 
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
}

public static void chucNang2() {
System.out.println("Đây là chức năng 2.");
// Thực hiện các tác vụ của chức năng 2
Scanner scanner = new Scanner(System.in);
System.out.print("nhap a: ");
double a = scanner.nextDouble();
System.out.print("nhap b:");
double b = scanner.nextDouble();
System.out.print("nhap c:");
double c = scanner.nextDouble();

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
		
double delta = b * b - 4 * a * c;


if (delta > 0) {
    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.println("Phương trình có hai nghiệm phân biệt:");
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
} else if (delta == 0) {
    double x = -b / (2 * a);
    System.out.println("Phương trình có nghiệm kép:");
    System.out.println("x = " + x);
} else {
    System.out.println("Phương trình vô nghiệm.");
}
}

public static void chucNang3() {
System.out.println("Đây là chức năng 3.");
// Thực hiện các tác vụ của chức năng 3 
Scanner scanner = new Scanner(System.in);
System.out.print("nhap so dien: ");
double dien = scanner.nextDouble();
double tien = scanner.nextDouble();
if(dien<50)
{
	tien = dien*1000;
//	System.out.println("gia tien: " +tien);
}else {
	tien = 50*1000+(dien-50)*1200;
//	System.out.println("gia tien: " +tien);
}
System.out.println("Số tiền điện cần thanh toán là: " + tien + " VND");
}
}