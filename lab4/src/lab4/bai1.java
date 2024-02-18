/**
 * 
 */
package lab4;

/**
 * 
 */
import java.util.Scanner;
public class bai1 {

	/**
	 * @param args
	 */
	Scanner scanner = new Scanner(System.in);
	public class SanPham{
		private String Ten;
		private double Gia;
		private double GG;
		
	public SanPham(String ten, double Gia, double GG) {
		this.Ten = ten;
		this.Gia = Gia;
		this.GG = GG;
	}
	public double thue() {
		return Gia*0.1;
	}
	public void xuat() {
		System.out.println("Tên sản phẩm: " + Ten);
        System.out.println("Đơn giá: " + Gia);
        System.out.println("Giảm giá: " + GG);
        System.out.println("Thuế nhập khẩu: " + thue());
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
