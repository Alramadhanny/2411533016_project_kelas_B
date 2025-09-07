package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLaudnry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLaudnry = new JTextField();
		txtLaudnry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtLaudnry.setForeground(Color.RED);
		txtLaudnry.setText("Laundry Apps");
		txtLaudnry.setBounds(10, 32, 200, 34);
		contentPane.add(txtLaudnry);
		txtLaudnry.setColumns(10);
		
		JButton btnNewButton = new JButton("PESANAN");
		btnNewButton.setBounds(10, 77, 134, 63);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LAYANAN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(169, 77, 134, 63);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PELANGGAN");
		btnNewButton_2.setBounds(330, 77, 134, 63);
		contentPane.add(btnNewButton_2);
		
		JButton btnPengguna = new JButton("PENGGUNA");
		btnPengguna.setBounds(10, 151, 134, 63);
		contentPane.add(btnPengguna);
		
		JButton btnNewButton_1_1 = new JButton("LAPORAN");
		btnNewButton_1_1.setBounds(169, 151, 134, 63);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("PROFILE");
		btnNewButton_2_1.setBounds(330, 151, 134, 63);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("KELUAR");
		btnNewButton_1_1_1.setBounds(10, 225, 454, 51);
		contentPane.add(btnNewButton_1_1_1);
	}
}
