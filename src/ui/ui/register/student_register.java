package register;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.student; 

import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;


public class student_register extends JFrame {

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField surnameTF;
	private JTextField tcTF;
	private JTextField passwordTF;
	private JTextField mailTF;
	private JTextField secTF;


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


	public student_register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 300, 725, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		String[] duzeyler = {"Düzey Seçiniz","5. Sınıf","6. Sınıf","7. Sınıf","8. Sınıf","9. Sınıf","10. Sınıf","11. Sınıf","12. Sınıf",};
		String[] secQuestions = {"GÜVENLİK SORUSU SEÇİNİZ","İlkokul öğretmeninizin adı?", "En sevdiğiniz hayvanın ismi?", "İlkokul şubeniz?", "En sevdiğiniz renk?", "En sevdiğiniz müzik grubu?" };
		
		mailTF = new JTextField();
		mailTF.setBounds(468, 181, 147, 26);
		layeredPane.add(mailTF);
		mailTF.setColumns(10);
		
		secTF = new JTextField();
		secTF.setBounds(411, 287, 218, 26);
		layeredPane.add(secTF);
		secTF.setColumns(10);
		
		JLabel passwordError = new JLabel("Şifre En Az 5 Haneli Olmalıdır");
		passwordError.setForeground(Color.RED);
		passwordError.setBounds(138, 280, 194, 16);
		layeredPane.add(passwordError);
		passwordError.setVisible(false);
		
		JLabel nameError = new JLabel("Ad Boş Bırakılamaz");
		nameError.setForeground(Color.RED);
		nameError.setBounds(170, 119, 146, 16);
		layeredPane.add(nameError);
		nameError.setVisible(false);
		
		JLabel mailError = new JLabel("Mail En Az 11 Haneli Olmalıdır");
		mailError.setForeground(Color.RED);
		mailError.setBounds(444, 209, 194, 26);
		layeredPane.add(mailError);
		mailError.setVisible(false);
		
		JLabel surnameError = new JLabel("Soyad Boş Bırakılamaz");
		surnameError.setForeground(Color.RED);
		surnameError.setBounds(160, 201, 156, 16);
		layeredPane.add(surnameError);
		surnameError.setVisible(false);

		
		passwordTF = new JTextField();
		passwordTF.setToolTipText("Adınızı Giriniz");
		passwordTF.setColumns(10);
		passwordTF.setBounds(160, 255, 147, 26);
		layeredPane.add(passwordTF);
		
		JLabel passwordText = new JLabel("  Şifre :");
		passwordText.setForeground(Color.WHITE);
		passwordText.setBounds(107, 258, 50, 16);
		layeredPane.add(passwordText);
		
		JLabel mailText = new JLabel("Mail :");
		mailText.setForeground(Color.WHITE);
		mailText.setBounds(424, 183, 61, 16);
		layeredPane.add(mailText);
		
		tcTF = new JTextField();
		tcTF.setToolTipText("T.C. No Giriniz");
		tcTF.setColumns(10);
		tcTF.setBounds(468, 95, 147, 26);
		layeredPane.add(tcTF);
		
		JLabel tcError = new JLabel("T.C. No 11 Haneli Olmalıdır");
		tcError.setForeground(Color.RED);
		tcError.setBounds(451, 121, 173, 16);
		layeredPane.add(tcError);
		tcError.setVisible(false);
		//String duzey = duzeyTF.getText();

		
		JLabel lblNewLabel_1_1 = new JLabel("T.C. No :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(402, 100, 68, 16);
		layeredPane.add(lblNewLabel_1_1);
		
		
		JLabel secError = new JLabel("Güvenlik Sorusu Boş Bırakılamaz");
		secError.setForeground(Color.RED);
		secError.setBounds(421, 314, 204, 16);
		layeredPane.add(secError);
		secError.setVisible(false);

		
		nameTF = new JTextField();
		nameTF.setToolTipText("Adınızı Giriniz");
		nameTF.setBounds(160, 95, 147, 26);
		layeredPane.add(nameTF);
		nameTF.setColumns(10);

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
				if(secTF.getText().length() <= 0){
					secError.setVisible(true);
				}else{
					secError.setVisible(false);
				}
				//---------
				if(passwordTF.getText().length() > 4 && tcTF.getText().length() == 11 && nameTF.getText().length() != 0 && surnameTF.getText().length() != 0 && mailTF.getText().length() >= 11 && secTF.getText().length() > 0) {
					System.out.println("dataya gönderme işlemi bekleniyor");
					student frame2 = new student();
					frame2.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(228, 382, 117, 29);
		layeredPane.add(btnNewButton);
		
		surnameTF = new JTextField();
		surnameTF.setToolTipText("Soyadınızı Giriniz");
		surnameTF.setColumns(10);
		surnameTF.setBounds(160, 175, 147, 26);
		layeredPane.add(surnameTF);

		JLabel title = new JLabel("Kayıt Ol");
		title.setFont(new Font("Mukta Mahee", Font.PLAIN, 35));
		title.setForeground(Color.WHITE);
		title.setBounds(279, 0, 163, 77);
		layeredPane.add(title);
		
		JLabel lblNewLabel = new JLabel("Soyad :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(107, 178, 50, 16);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ad :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(127, 100, 35, 16);
		layeredPane.add(lblNewLabel_1);
		
		JButton back = new JButton("Geri");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				student frame3 = new student();
				frame3.setVisible(true);
				dispose();
			}
		});
		back.setBounds(386, 382, 117, 29);
		layeredPane.add(back);
		
		JComboBox comboBox = new JComboBox(secQuestions);
		comboBox.setBounds(402, 259, 235, 27);
		layeredPane.add(comboBox);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 725, 431);
		layeredPane.add(label);
		label.setIcon(img);

	}
}