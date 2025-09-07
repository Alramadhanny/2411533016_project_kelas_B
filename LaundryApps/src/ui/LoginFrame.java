package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 11, 135, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(20, 84, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(20, 140, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(20, 109, 185, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(20, 165, 185, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (User.login(txtUsername.getText(), txtPassword.getText())) {
		            new MainFrame().setVisible(true);
		            dispose();
		        } else {
		            JOptionPane.showMessageDialog(null, "Login Gagal");
		        }
			}
		});
		btnLogin.setBounds(22, 196, 183, 23);
		contentPane.add(btnLogin);
		
		JLabel lblMalesAjaNyuci = new JLabel("Males aja nyuci, biar kai cuciin");
		lblMalesAjaNyuci.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblMalesAjaNyuci.setBounds(20, 53, 249, 20);
		contentPane.add(lblMalesAjaNyuci);
	}
}