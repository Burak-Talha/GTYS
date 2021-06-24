package forgot_password;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.boss;
import login.Student;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class change_password extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				forgot_password frame;
					try {
						frame = new forgot_password();
						frame.setVisible(true);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}			
			}
		});
	}


	public change_password() throws InterruptedException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 300, 536, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblGrselTabanl = new JLabel("Görsel Tabanlı");
		lblGrselTabanl.setForeground(SystemColor.window);
		lblGrselTabanl.setFont(new Font("Mukta Mahee", Font.BOLD, 18));
		lblGrselTabanl.setBounds(16, 6, 226, 63);
		layeredPane.add(lblGrselTabanl);
		
		JLabel lblSistemi = new JLabel("Yerleştirme Sistemi");
		lblSistemi.setForeground(SystemColor.window);
		lblSistemi.setFont(new Font("Mukta Mahee", Font.BOLD, 18));
		lblSistemi.setBounds(16, 36, 226, 63);
		layeredPane.add(lblSistemi);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		
		JButton btnNewButton_2 = new JButton("Geri");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Student frame = new Student();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(419, 264, 117, 29);
		layeredPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(260, 113, 130, 26);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Yeni Şifre :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(188, 118, 67, 16);
		layeredPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(260, 151, 130, 26);
		layeredPane.add(textField_1);
		
		JLabel lblYeniifreTekrar = new JLabel("Yeni Şifre  Tekrar :");
		lblYeniifreTekrar.setForeground(Color.WHITE);
		lblYeniifreTekrar.setBounds(138, 156, 117, 16);
		layeredPane.add(lblYeniifreTekrar);
		
		JButton btnNewButton = new JButton("Gönder");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(textField.getText().length() > 4 && textField.getText() == textField_1.getText()) {
					System.out.println("şifre değişkliği bekleniyor");
				}else if(textField.getText().length() <= 4 && textField.getText() != textField_1.getText()){
					JOptionPane.showMessageDialog(null,
						    "Şifreleri Kontrol Ediniz (Şifre En Az 5 Haneli Olmalıdır)",
						    "Hata",
						    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(201, 189, 189, 29);
		layeredPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 536, 293);
		layeredPane.add(label);
		label.setIcon(img);
		
	}
}