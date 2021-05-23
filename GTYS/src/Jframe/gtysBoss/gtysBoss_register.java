package gtysBoss;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;


public class gtysBoss_register extends JFrame {

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
					gtysBoss_register frame = new gtysBoss_register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public gtysBoss_register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1050, 300, 567, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		String[] duzeyler = {"Düzey Seçiniz","5. Sınıf","6. Sınıf","7. Sınıf","8. Sınıf","9. Sınıf","10. Sınıf","11. Sınıf","12. Sınıf",};
		
		mailTF = new JTextField();
		mailTF.setBounds(369, 149, 147, 26);
		layeredPane.add(mailTF);
		mailTF.setColumns(10);
		String mail = mailTF.getText();
		
		JLabel passwordError = new JLabel("Şifre En Az 5 Haneli Olmalıdır");
		passwordError.setForeground(Color.RED);
		passwordError.setBounds(78, 220, 194, 16);
		layeredPane.add(passwordError);
		passwordError.setVisible(false);
		
		JLabel nameError = new JLabel("Ad Boş Bırakılamaz");
		nameError.setForeground(Color.RED);
		nameError.setBounds(110, 121, 146, 16);
		layeredPane.add(nameError);
		nameError.setVisible(false);
		
		JLabel mailError = new JLabel("Mail En Az 11 Haneli Olmalıdır");
		mailError.setForeground(Color.RED);
		mailError.setBounds(345, 177, 194, 26);
		layeredPane.add(mailError);
		mailError.setVisible(false);
		
		JLabel surnameError = new JLabel("Soyad Boş Bırakılamaz");
		surnameError.setForeground(Color.RED);
		surnameError.setBounds(100, 172, 156, 16);
		layeredPane.add(surnameError);
		surnameError.setVisible(false);

		
		passwordTF = new JTextField();
		passwordTF.setToolTipText("Adınızı Giriniz");
		passwordTF.setColumns(10);
		passwordTF.setBounds(100, 195, 147, 26);
		layeredPane.add(passwordTF);
		String password = passwordTF.getText();
		
		JLabel passwordText = new JLabel("  Şifre :");
		passwordText.setForeground(Color.WHITE);
		passwordText.setBounds(52, 200, 50, 16);
		layeredPane.add(passwordText);
		
		JLabel mailText = new JLabel("Mail :");
		mailText.setForeground(Color.WHITE);
		mailText.setBounds(325, 151, 61, 16);
		layeredPane.add(mailText);
		
		tcTF = new JTextField();
		tcTF.setToolTipText("T.C. No Giriniz");
		tcTF.setColumns(10);
		tcTF.setBounds(369, 95, 147, 26);
		layeredPane.add(tcTF);
		String tc = tcTF.getText();
		
		JLabel tcError = new JLabel("T.C. No 11 Haneli Olmalıdır");
		tcError.setForeground(Color.RED);
		tcError.setBounds(352, 121, 173, 16);
		layeredPane.add(tcError);
		tcError.setVisible(false);
		//String duzey = duzeyTF.getText();

		
		JLabel lblNewLabel_1_1 = new JLabel("T.C. No :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(303, 100, 68, 16);
		layeredPane.add(lblNewLabel_1_1);

		
		nameTF = new JTextField();
		nameTF.setToolTipText("Adınızı Giriniz");
		nameTF.setBounds(100, 97, 147, 26);
		layeredPane.add(nameTF);
		nameTF.setColumns(10);
		String name = nameTF.getText();

		JButton btnNewButton = new JButton("Kayıt Ol");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
					gtysBoss frame2 = new gtysBoss();
					frame2.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(210, 243, 117, 29);
		layeredPane.add(btnNewButton);
		
		surnameTF = new JTextField();
		surnameTF.setToolTipText("Soyadınızı Giriniz");
		surnameTF.setColumns(10);
		surnameTF.setBounds(100, 146, 147, 26);
		layeredPane.add(surnameTF);
		String surname = surnameTF.getText();

		
		JLabel title = new JLabel("Kayıt Ol");
		title.setForeground(Color.WHITE);
		title.setBounds(236, 0, 809, 77);
		layeredPane.add(title);
		
		JLabel lblNewLabel = new JLabel("Soyad :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(52, 151, 50, 16);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ad :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(67, 102, 35, 16);
		layeredPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 690, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);

	}
}
