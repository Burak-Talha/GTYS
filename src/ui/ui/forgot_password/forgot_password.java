package forgot_password;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.boss;
import login.student;

import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class forgot_password extends JFrame {

	private JPanel contentPane;
	private JTextField tcTF;
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


	public forgot_password() throws InterruptedException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 300, 536, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblKullancAdnzGiriniz = new JLabel("T.C. Numaranızı Giriniz :");
		lblKullancAdnzGiriniz.setBounds(86, 111, 202, 31);
		layeredPane.add(lblKullancAdnzGiriniz);
		lblKullancAdnzGiriniz.setForeground(SystemColor.window);
		lblKullancAdnzGiriniz.setFont(new Font("Mukta Mahee", Font.BOLD, 18));
		
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
		
		tcTF = new JTextField();
		tcTF.setBounds(281, 114, 144, 26);
		layeredPane.add(tcTF);
		tcTF.setColumns(10);
		
		JLabel error = new JLabel("T.C. 11 Haneli Olmalıdır");
		error.setForeground(Color.RED);
		error.setBounds(281, 139, 151, 16);
		layeredPane.add(error);
		error.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("Gönder");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				change_password frame;
				try {
					frame = new change_password();
					frame.setVisible(true);

				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_1.setBounds(210, 236, 117, 29);
		layeredPane.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);
		
		JLabel lblgvenlikSorusu = new JLabel("*güvenlik sorusu*");
		lblgvenlikSorusu.setForeground(SystemColor.window);
		lblgvenlikSorusu.setFont(new Font("Mukta Mahee", Font.BOLD, 18));
		lblgvenlikSorusu.setBounds(101, 167, 144, 31);
		layeredPane.add(lblgvenlikSorusu);
		lblgvenlikSorusu.setVisible(false);

		JButton btnNewButton = new JButton("Ara");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(tcTF.getText().length() != 11){
					error.setVisible(true);
				}else{
					error.setVisible(false);
					lblgvenlikSorusu.setVisible(true);
					textField_1.setVisible(true);
					btnNewButton_1.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(419, 114, 55, 29);
		layeredPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setVisible(false);
		textField_1.setBounds(281, 170, 144, 26);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Geri");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				student frame = new student();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(419, 264, 117, 29);
		layeredPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 536, 293);
		layeredPane.add(label);
		label.setIcon(img);
		
	}
}