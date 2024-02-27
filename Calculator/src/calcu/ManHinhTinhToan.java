package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtketqua;

	/**
	 * Launch the application.
	 */
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(27, 50, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNhpB.setBounds(27, 90, 48, 14);
		contentPane.add(lblNhpB);
		
		txtA = new JTextField();
		txtA.setBounds(85, 48, 183, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(85, 88, 186, 20);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//xử lý code
			HamCong();	
			}
		});
		btnCong.setBounds(10, 151, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//trừ
			HamTru();	
			}
		});
		btnTru.setBounds(109, 151, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//nhân
			HamNhan();	
			}
		});
		btnNhan.setBounds(208, 151, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("chia");
		btnChia.setBounds(319, 151, 89, 23);
		contentPane.add(btnChia);
		
		JLabel txtkq = new JLabel("kết quả");
		txtkq.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtkq.setBounds(27, 209, 48, 14);
		contentPane.add(txtkq);
		
		txtketqua = new JTextField();
		txtketqua.setEditable(false);
		txtketqua.setEnabled(false);
		txtketqua.setColumns(10);
		txtketqua.setBounds(82, 207, 186, 20);
		contentPane.add(txtketqua);
	}
	//hết hàm tạo
	void HamCong() {
		//lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtA.getText();
		//chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB); 
		//tính toán
		double tong = soA + soB;
		txtketqua.setText(String.valueOf(tong));
	}
	void HamTru() {
		String str_soA = txtA.getText();
		String str_soB = txtA.getText();
		//chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB); 
		//tính toán
		double Tru = soA - soB;
		txtketqua.setText(String.valueOf(Tru));
	}
	void HamNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtA.getText();
		//chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB); 
		//tính toán
		double Nhan = soA * soB;
		txtketqua.setText(String.valueOf(Nhan));
	}
}	
