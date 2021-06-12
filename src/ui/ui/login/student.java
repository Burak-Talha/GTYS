package login;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dashboard.home;
import main.choose_screen;
import register.student_register;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class student extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordTF;
	private JTextField tcTF;
	private JTextField mailTF;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student frame = new student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public student() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 300, 536, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Kayıt Ol");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				student_register frame2 = new student_register();
				frame2.setVisible(true);
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(206, 236, 124, 26);
		layeredPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Şifremi Unuttum");
		lblNewLabel_3.setForeground(Color.BLACK);
		panel.add(lblNewLabel_3);
		btnNewButton_1.setBounds(260, 195, 117, 29);
		layeredPane.add(btnNewButton_1);
		
		JLabel mailText = new JLabel("Mail :");
		mailText.setForeground(Color.WHITE);
		mailText.setBounds(165, 111, 100, 16);
		layeredPane.add(mailText);
		
		JLabel lblNewLabel_2 = new JLabel("T.C. No :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(147, 77, 61, 16);
		layeredPane.add(lblNewLabel_2);
		
		mailTF = new JTextField();
		mailTF.setBounds(206, 109, 147, 26);
		layeredPane.add(mailTF);
		mailTF.setColumns(10);
		
		tcTF = new JTextField();
		tcTF.setBounds(206, 72, 147, 26);
		layeredPane.add(tcTF);
		tcTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(206, 147, 147, 26);
		layeredPane.add(passwordTF);
		
		JButton btnNewButton = new JButton("Giriş Yap");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String userTC = tcTF.getText();
				String userPassword = passwordTF.getText();
				String userMail = mailTF.getText();

				if(tcTF.getText().length() == 0 || passwordTF.getText().length() == 0 || mailTF.getText().length() == 0) {
					JOptionPane.showMessageDialog(null,
						    "Boşukları Doldurunuz",
						    "Hata",
						    JOptionPane.ERROR_MESSAGE);
				}else{
					//sıkıntı yoksa devam bloğu
					System.out.println("Data kontrolü bekleniyor");
					home frame3 = new home();
					frame3.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(131, 195, 117, 29);
		layeredPane.add(btnNewButton);
		
		JLabel title = new JLabel("Giriş Yap - Öğrenci");
		title.setFont(new Font("Mukta Mahee", Font.PLAIN, 30));
		title.setForeground(Color.WHITE);
		title.setBounds(155, 16, 239, 42);
		layeredPane.add(title);
		
		JLabel lblNewLabel = new JLabel("Şifre :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(165, 152, 61, 16);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T.C. No :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(213, 154, 61, 16);
		
		JButton btnNewButton_2 = new JButton("Geri");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					choose_screen mainn = new choose_screen();
					mainn.setVisible(true);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setBounds(413, 258, 117, 29);
		layeredPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 690, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);
		
	}
}
