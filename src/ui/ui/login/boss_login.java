package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import forgot_password.forgot_password;
import main.choose_screen;
import register.boss_register;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.Font;


public class boss_login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordTF;
	private JTextField tcTF;
	private JTextField mailTF;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boss_login frame = new boss_login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public boss_login() {
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
				boss_register frame2 = new boss_register();
				frame2.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(260, 198, 117, 29);
		layeredPane.add(btnNewButton_1);
		
		JLabel mailText = new JLabel("Mail :");
		mailText.setForeground(Color.WHITE);
		mailText.setBounds(163, 107, 100, 16);
		layeredPane.add(mailText);
		
		JLabel lblNewLabel_2 = new JLabel("T.C. No :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(145, 73, 61, 16);
		layeredPane.add(lblNewLabel_2);
		
		mailTF = new JTextField();
		mailTF.setBounds(204, 105, 147, 26);
		layeredPane.add(mailTF);
		mailTF.setColumns(10);
		
		tcTF = new JTextField();
		tcTF.setBounds(204, 68, 147, 26);
		layeredPane.add(tcTF);
		tcTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(204, 143, 147, 26);
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
				}
			}
		});
		btnNewButton.setBounds(131, 198, 117, 29);
		layeredPane.add(btnNewButton);
		
		JLabel title = new JLabel("Giriş Yap - Müdür");
		title.setFont(new Font("Mukta Mahee", Font.PLAIN, 30));
		title.setForeground(Color.WHITE);
		title.setBounds(145, 14, 248, 42);
		layeredPane.add(title);
		
		JLabel lblNewLabel = new JLabel("Şifre :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(163, 148, 61, 16);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T.C. No :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(213, 154, 61, 16);
		
		JButton btnNewButton_2 = new JButton("Geri");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					choose_screen m = new choose_screen();
					m.setVisible(true);
					dispose();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(413, 258, 117, 29);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Şifremi Unuttum");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				forgot_password frame;
				try {
					frame = new forgot_password();
					frame.setVisible(true);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(197, 239, 136, 29);
		layeredPane.add(btnNewButton_3);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 690, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);



	}
}
