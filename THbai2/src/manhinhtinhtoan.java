

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

public class manhinhtinhtoan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtketqua;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public  manhinhtinhtoan() {
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
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNhpC.setBounds(27, 129, 48, 14);
		contentPane.add(lblNhpC);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(82, 127, 186, 20);
		contentPane.add(txtC);
		
		JButton ketqua = new JButton("tính toán");
		ketqua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamtinhtoan();
			}
		});
		ketqua.setBounds(37, 162, 89, 23);
		contentPane.add(ketqua);
	}
	void hamtinhtoan() {
		//lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				String str_soC = txtC.getText();
				//chuyển kiểu
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB); 
				double soC = Double.parseDouble(str_soC); 
				if (soA == 0) {
		            if (soB == 0) {
		                System.out.println("Phương trình vô số nghiệm.");
		            } else {
		                System.out.println("Phương trình vô nghiệm.");
		            }
		        } else {
		            double x = -soB / soA;
		            System.out.println("Nghiệm của phương trình là: " + x);
		        }
						
				double delta = soB * soB - 4 * soA * soC;

				
		        if (delta > 0) {
		            double x1 = (-soB + Math.sqrt(delta)) / (2 * soA);
		            double x2 = (-soB - Math.sqrt(delta)) / (2 * soA);
		            System.out.println("Phương trình có hai nghiệm phân biệt:");
		            System.out.println("x1 = " + x1);
		            System.out.println("x2 = " + x2);
		        } else if (delta == 0) {
		            double x = -soB / (2 * soA);
		            System.out.println("Phương trình có nghiệm kép:");
		            System.out.println("x = " + x);
		        } else {
		            System.out.println("Phương trình vô nghiệm.");
		        }
				
				
				
	}
}	
