package dashboard_student;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.boss;
import login.Student; 

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;


public class profile extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile frame = new profile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public profile() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 300, 1053, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				sss frame = new sss();
				frame.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("*tc");
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1.setBounds(642, 357, 100, 42);
		layeredPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("*mail");
		lblNewLabel_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_3_1.setBounds(599, 305, 91, 42);
		layeredPane.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("T.C. No :");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_1_2.setBounds(543, 357, 84, 42);
		layeredPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Mail :");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(543, 306, 60, 42);
		layeredPane.add(lblNewLabel_3_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(554, 85, 135, 4);
		layeredPane.add(panel_3);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("*student_school");
		lblNewLabel_3_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_2_1_1.setBounds(625, 258, 154, 42);
		layeredPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("*surname");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(630, 197, 100, 42);
		layeredPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("*name");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(607, 143, 91, 42);
		layeredPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Okulu :");
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_2_1.setBounds(543, 258, 70, 42);
		layeredPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Soyadı :");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(543, 200, 75, 42);
		layeredPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("PROFİL");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(573, 31, 100, 58);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adı :");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(543, 143, 52, 42);
		layeredPane.add(lblNewLabel_3);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(48, 339, 91, 31);
		layeredPane.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("S.S.S");
		panel_2_1.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(48, 232, 91, 31);
		layeredPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Profil");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				home frame2 = new home();
				frame2.setVisible(true);
				dispose();
			}
		});
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(48, 125, 91, 31);
		layeredPane.add(panel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ana Sayfa");
		panel_2_2.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Çıkış Yap");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, 
			            "Çıkış Yapmak İstediğinden Emin Misin?", "Çıkış?", 
			            JOptionPane.YES_NO_OPTION,
			            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
			            System.exit(0);
			        }
			}
		});
		btnNewButton.setBounds(37, 524, 117, 29);
		layeredPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(48, 57, 91, 4);
		layeredPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(189, 0, 4, 559);
		layeredPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(64, 31, 59, 24);
		layeredPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1053, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);

	}
}