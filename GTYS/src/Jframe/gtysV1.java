package Jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;


public class gtysV1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordTF;
	private JTextField tcTF;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gtysV1 frame = new gtysV1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	public gtysV1() {
		String tc = "123"; 
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(950, 300, 515, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("KayÄ±t Ol");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				student_register frame2 = new student_register();
				frame2.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(261, 217, 117, 29);
		layeredPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("T.C. No :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(149, 146, 61, 16);
		layeredPane.add(lblNewLabel_2);
		
		tcTF = new JTextField();
		tcTF.setBounds(208, 141, 147, 26);
		layeredPane.add(tcTF);
		tcTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(208, 179, 147, 26);
		layeredPane.add(passwordTF);
		
		JButton btnNewButton = new JButton("GiriÅŸ Yap");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userTC = tcTF.getText();
				String userPassword = passwordTF.getText();
				
			}
		});
		btnNewButton.setBounds(132, 217, 117, 29);
		layeredPane.add(btnNewButton);
		
		JLabel title = new JLabel("HoÅŸ Geldiniz");
		title.setForeground(Color.WHITE);
		title.setBounds(219, 81, 104, 42);
		layeredPane.add(title);
		
		JLabel lblNewLabel = new JLabel("Å�ifre :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(167, 184, 61, 16);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T.C. No :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(213, 154, 61, 16);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 690, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);



	}
}
