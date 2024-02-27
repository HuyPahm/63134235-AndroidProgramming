import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tendn;
	private JTextField mk;


	public login() {
		setTitle("đăng nhập hệ thống");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên Đăng Nhập");
		lblNewLabel.setBounds(25, 44, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mật Khẩu");
		lblNewLabel_1.setBounds(25, 120, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btndn = new JButton("Đăng Nhập");
		btndn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhap();
			}
		});
		btndn.setBounds(185, 175, 89, 23);
		contentPane.add(btndn);
		
		tendn = new JTextField();
		tendn.setBounds(153, 41, 161, 20);
		contentPane.add(tendn);
		tendn.setColumns(10);
		
		mk = new JTextField();
		mk.setColumns(10);
		mk.setBounds(153, 117, 161, 20);
		contentPane.add(mk);
	}
	void DangNhap() {
		String strten = tendn.getText();
		String strmk = mk.getText();
		//xử lý
		if (strten.equals("63cntt")&& strmk.equals("123") )
		{//hien trang chủ
			homelogin homePage = new homelogin();
			homePage.setVisible(true);
			//ẩn form đăng nhập
			this.setVisible(false);
		}else {
			//lỗi
			//xoá dữ liệu nhập trước
			tendn.setText("");
			mk.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "đăng nhập thất bại");
		}
	}
}
