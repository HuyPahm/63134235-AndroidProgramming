/**
 * 
 */
package lab4;

/**
 * 
 */
import java.util.Scanner;
public class bai2 {

	/**
	 * @param args
	 */
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("Nhập thông tin cho sản phẩm 1:");
        sp1.nhapThongTin();

        System.out.println("Nhập thông tin cho sản phẩm 2:");
        sp2.nhapThongTin();

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuatThongTin();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuatThongTin();
	}

}
