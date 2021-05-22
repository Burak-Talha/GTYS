package Jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JComboBox;


public class student_register extends JFrame {

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField surnameTF;
	private JTextField tcTF;
	private JTextField textField;


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


	public student_register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(950, 300, 567, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		String[] duzeyler = {"Düzey Seçiniz","5. Sınıf","6. Sınıf","7. Sınıf","8. Sınıf","9. Sınıf","10. Sınıf","11. Sınıf","12. Sınıf",};
		
		textField = new JTextField();
		textField.setToolTipText("Adınızı Giriniz");
		textField.setColumns(10);
		textField.setBounds(100, 195, 147, 26);
		layeredPane.add(textField);
		
		JLabel passwordText = new JLabel("  �?ifre :");
		passwordText.setForeground(Color.WHITE);
		passwordText.setBounds(52, 200, 50, 16);
		layeredPane.add(passwordText);
		JComboBox duzeyTF = new JComboBox(duzeyler);
		duzeyTF.setToolTipText("Sınıf Düzeyinizi Seçin");
		duzeyTF.setBounds(369, 145, 147, 27);
		layeredPane.add(duzeyTF);
		
		tcTF = new JTextField();
		tcTF.setToolTipText("T.C. No Giriniz");
		tcTF.setColumns(10);
		tcTF.setBounds(369, 95, 147, 26);
		layeredPane.add(tcTF);
		String tc = tcTF.getText();
		
		JLabel label2 = new JLabel("T.C. No Boş Olamaz");
		label2.setForeground(Color.RED);
		label2.setBounds(379, 118, 150, 16);
		layeredPane.add(label2);
		label2.setVisible(false);

		
		JLabel lblNewLabel_2 = new JLabel("Sınıf Düzeyi :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(279, 149, 92, 16);
		layeredPane.add(lblNewLabel_2);
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
				if(tcTF.getText().length() < 11) {
					label2.setVisible(true);
				}else {
					// sıkıntı yoksa devam bloğu :
					label2.setVisible(false);
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
