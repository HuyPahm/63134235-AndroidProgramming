import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class plus extends JFrame {

	private JButton	
	bn=new JButton("North"),
	bs=new JButton("South"),
	be=new JButton("East"),
	bw=new JButton("West"),
	bc=new JButton("Center");
	public plus()	{
	setTitle("BorderLayout");
	setSize(300,	200);	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);	
	setResizable(false);	
	add(BorderLayout.NORTH,	bn);	
	add(BorderLayout.SOUTH,	bs);	
	add(BorderLayout.EAST,	be);	
	add(BorderLayout.WEST,	bw);	
	add(BorderLayout.CENTER,	bc);
	bn.setBackground(Color.red);
	bn.setForeground(Color.white);
	be.setBackground(Color.blue);
	be.setForeground(Color.white);
	//etc.
	}
	public static void main(String[]	args)	{
	new DemoBorderLayout().setVisible(true);
	}
	}


