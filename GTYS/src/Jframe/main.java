package Jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					main frame;
					try {
						frame = new main();
						frame.setVisible(true);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}			
			}
		});
	}


	public main() throws InterruptedException {
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
				gtysBoss g2 = new gtysBoss();
				g2.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(284, 203, 117, 29);
		layeredPane.add(btnNewButton_1);
		
		JLabel text = new JLabel("Görsel Tabanlı Yerleştirme");
		text.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 35));
		text.setForeground(UIManager.getColor("CheckBox.background"));
		text.setBounds(65, 0, 422, 177);
		layeredPane.add(text);
		
		JLabel lblSistemi = new JLabel("Sistemi");
		lblSistemi.setForeground(SystemColor.window);
		lblSistemi.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 35));
		lblSistemi.setBounds(200, 114, 136, 63);
		layeredPane.add(lblSistemi);
		
		JButton btnNewButton = new JButton("Öğrenci Girişi");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gtysV1 g = new gtysV1();
				g.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(128, 203, 117, 29);
		layeredPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 690, 2000);
		layeredPane.add(label);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/wallpaper.jpeg"));
		label.setIcon(img);
		
	}
}
