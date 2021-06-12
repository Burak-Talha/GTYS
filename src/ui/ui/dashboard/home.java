package dashboard;

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
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;


public class home extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public home() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 300, 1053, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
				
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profile frame = new profile();
				frame.setVisible(true);
				dispose();
			}
		});
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				sss frame = new sss();
				frame.setVisible(true);
				dispose();
			}
		});
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(48, 340, 91, 31);
		layeredPane.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("S.S.S");
		panel_2_1.add(lblNewLabel_1_1);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(48, 233, 91, 31);
		layeredPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Profil");
		panel_2.add(lblNewLabel_1);
		
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
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(48, 126, 91, 31);
		layeredPane.add(panel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ana Sayfa");
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
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
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1053, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);

	}
}
