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
		
	public SanPham() {
			
		}
	public SanPham(String Ten, double Gia, double GG) {
		this.Ten = Ten;
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
	public void nhap() {
		 System.out.print("Nhập tên sản phẩm: ");
	        Ten = scanner.nextLine();
	        System.out.print("Nhập đơn giá: ");
	        Gia = scanner.nextDouble();
	        System.out.print("Nhập giảm giá: ");
	        GG = scanner.nextDouble();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SanPham sp = new SanPham();
//        sp.nhap();
//        sp.xuat();
	}

}
