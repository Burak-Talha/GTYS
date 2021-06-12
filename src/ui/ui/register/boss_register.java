package register;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.boss;
import login.student; 

import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;


public class boss_register extends JFrame {

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField surnameTF;
	private JTextField tcTF;
	private JTextField passwordTF;
	private JTextField mailTF;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boss_register frame = new boss_register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public boss_register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 300, 536, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		String[] duzeyler = {"Düzey Seçiniz","5. Sınıf","6. Sınıf","7. Sınıf","8. Sınıf","9. Sınıf","10. Sınıf","11. Sınıf","12. Sınıf",};
		
		mailTF = new JTextField();
		mailTF.setBounds(345, 132, 147, 26);
		layeredPane.add(mailTF);
		mailTF.setColumns(10);
		String mail = mailTF.getText();
		
		JLabel passwordError = new JLabel("Şifre En Az 5 Haneli Olmalıdır");
		passwordError.setForeground(Color.RED);
		passwordError.setBounds(54, 203, 194, 16);
		layeredPane.add(passwordError);
		passwordError.setVisible(false);
		
		JLabel nameError = new JLabel("Ad Boş Bırakılamaz");
		nameError.setForeground(Color.RED);
		nameError.setBounds(86, 104, 146, 16);
		layeredPane.add(nameError);
		nameError.setVisible(false);
		
		JLabel mailError = new JLabel("Mail En Az 11 Haneli Olmalıdır");
		mailError.setForeground(Color.RED);
		mailError.setBounds(321, 160, 194, 26);
		layeredPane.add(mailError);
		mailError.setVisible(false);
		
		JLabel surnameError = new JLabel("Soyad Boş Bırakılamaz");
		surnameError.setForeground(Color.RED);
		surnameError.setBounds(76, 155, 156, 16);
		layeredPane.add(surnameError);
		surnameError.setVisible(false);

		
		passwordTF = new JTextField();
		passwordTF.setToolTipText("Adınızı Giriniz");
		passwordTF.setColumns(10);
		passwordTF.setBounds(76, 178, 147, 26);
		layeredPane.add(passwordTF);
		String password = passwordTF.getText();
		
		JLabel passwordText = new JLabel("  Şifre :");
		passwordText.setForeground(Color.WHITE);
		passwordText.setBounds(28, 183, 50, 16);
		layeredPane.add(passwordText);
		
		JLabel mailText = new JLabel("Mail :");
		mailText.setForeground(Color.WHITE);
		mailText.setBounds(301, 134, 61, 16);
		layeredPane.add(mailText);
		
		tcTF = new JTextField();
		tcTF.setToolTipText("T.C. No Giriniz");
		tcTF.setColumns(10);
		tcTF.setBounds(345, 78, 147, 26);
		layeredPane.add(tcTF);
		String tc = tcTF.getText();
		
		JLabel tcError = new JLabel("T.C. No 11 Haneli Olmalıdır");
		tcError.setForeground(Color.RED);
		tcError.setBounds(328, 104, 173, 16);
		layeredPane.add(tcError);
		tcError.setVisible(false);
		
		JLabel lblNewLabel_1_1 = new JLabel("T.C. No :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(279, 83, 68, 16);
		layeredPane.add(lblNewLabel_1_1);

		
		nameTF = new JTextField();
		nameTF.setToolTipText("Adınızı Giriniz");
		nameTF.setBounds(76, 80, 147, 26);
		layeredPane.add(nameTF);
		nameTF.setColumns(10);
		String name = nameTF.getText();

		JButton btnNewButton = new JButton("Kayıt Ol");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(tcTF.getText().length() != 11) {
					tcError.setVisible(true);
				}else{
					tcError.setVisible(false);
				}
				//---------
				if(passwordTF.getText().length() <= 4){
					passwordError.setVisible(true);
				}else{
					passwordError.setVisible(false);
				}
				//---------
				if(nameTF.getText().length() == 0){
					nameError.setVisible(true);
				}else{
					nameError.setVisible(false);
				}
				//---------
				if(surnameTF.getText().length() == 0){
					surnameError.setVisible(true);
				}else{
					surnameError.setVisible(false);
				}
				//---------
				if(mailTF.getText().length() < 11){
					mailError.setVisible(true);
				}else{
					mailError.setVisible(false);
				}
				//---------
				if(passwordTF.getText().length() > 4 && tcTF.getText().length() == 11 && nameTF.getText().length() != 0 && surnameTF.getText().length() != 0 && mailTF.getText().length() >= 11) {
					System.out.println("dataya gönderme işlemi bekleniyor");
					boss frame2 = new boss();
					frame2.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(222, 231, 117, 29);
		layeredPane.add(btnNewButton);
		
		surnameTF = new JTextField();
		surnameTF.setToolTipText("Soyadınızı Giriniz");
		surnameTF.setColumns(10);
		surnameTF.setBounds(76, 129, 147, 26);
		layeredPane.add(surnameTF);
		String surname = surnameTF.getText();

		JLabel title = new JLabel("Kayıt Ol");
		title.setFont(new Font("Mukta Mahee", Font.PLAIN, 35));
		title.setForeground(Color.WHITE);
		title.setBounds(204, 0, 163, 77);
		layeredPane.add(title);
		
		JLabel lblNewLabel = new JLabel("Soyad :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(28, 134, 50, 16);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ad :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(43, 85, 35, 16);
		layeredPane.add(lblNewLabel_1);
		
		JButton back = new JButton("Geri");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				boss frame3 = new boss();
				frame3.setVisible(true);
				dispose();
			}
		});
		back.setBounds(413, 258, 117, 29);
		layeredPane.add(back);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 690, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);

	}
}
