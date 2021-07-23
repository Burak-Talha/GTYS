package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.boss_login;
import login.student_login;

import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class choose_screen extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					choose_screen frame;
					try {
						frame = new choose_screen();
						frame.setVisible(true);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}			
			}
		});
	}


	public choose_screen() throws InterruptedException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 300, 536, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Müdür Girişi");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				boss_login g2 = new boss_login();
				g2.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblGrselTabanl = new JLabel("Görsel Tabanlı");
		lblGrselTabanl.setForeground(SystemColor.window);
		lblGrselTabanl.setFont(new Font("Mukta Mahee", Font.BOLD, 25));
		lblGrselTabanl.setBounds(40, 79, 226, 63);
		layeredPane.add(lblGrselTabanl);
		btnNewButton_1.setBounds(317, 152, 135, 36);
		layeredPane.add(btnNewButton_1);
		
		JLabel lblSistemi = new JLabel("Yerleştirme Sistemi");
		lblSistemi.setForeground(SystemColor.window);
		lblSistemi.setFont(new Font("Mukta Mahee", Font.BOLD, 25));
		lblSistemi.setBounds(40, 125, 226, 63);
		layeredPane.add(lblSistemi);
		
		JButton btnNewButton = new JButton("Öğrenci Girişi");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				student_login g = new student_login();
				g.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(317, 106, 137, 36);
		layeredPane.add(btnNewButton);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 536, 293);
		layeredPane.add(label);
		label.setIcon(img);
		
	}
}