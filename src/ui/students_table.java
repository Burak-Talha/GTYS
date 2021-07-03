package demo.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import demo.Student;
import demo.db.dbHelper.CRUD_Transactions.Student_db;

import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class students_table extends JFrame {
	
    DefaultTableModel modelim = new DefaultTableModel();

    Object[] kolonlar = {"Ýsim","Soyisim","ID"};

    Object[] satirlar = new Object[10];
    
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTable table;
	private JTable tablo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					students_table frame = new students_table();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public students_table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		Student_db student_db = new Student_db();
		ArrayList<Student> student = new ArrayList<Student>();
		student = student_db.ReadStudent();
		layeredPane = new JLayeredPane();
		
		for(Student student1 : student) {
			tablo = new JTable();
			modelim.setColumnIdentifiers(kolonlar);
			
			
			
	            satirlar[0] = student1.getName();
	            satirlar[1] = student1.getLastName();
	            satirlar[2] = student1.getId();
				modelim.addRow(satirlar);
			
			scrollPane.setViewportView(tablo);
			tablo.setModel(modelim);
		}			
	}
}
