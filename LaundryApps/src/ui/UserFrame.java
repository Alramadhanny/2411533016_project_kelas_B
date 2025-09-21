package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import DAO.UserRepo;
import Table.TableUser;
import model.User;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class UserFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTable tableUsers;
	UserRepo usr = new UserRepo();
	List<User> ls;
	public String id;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
					frame.setVisible(true);
					frame.loadTable();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void reset() {
		txtName.setText("");
		txtUsername.setText("");
		txtPassword.setText("");
	}
	
	public void loadTable() {
		ls = usr.show();
		TableUser tu = new TableUser(ls);
		tableUsers.setModel(tu);
		tableUsers.getTableHeader().setVisible(true);
	}
	
	
	/**
	 * Create the frame.
	 */
	public UserFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(47, 40, 49, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(47, 78, 92, 32);
		contentPane.add(lblUsername);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(47, 116, 70, 32);
		contentPane.add(lblNewLabel_1_1);
		
		txtName = new JTextField();
		txtName.setBounds(126, 44, 371, 28);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(126, 82, 371, 28);
		contentPane.add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(126, 120, 371, 28);
		contentPane.add(txtPassword);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.setNama(txtName.getText());
				user.setUsername(txtUsername.getText());
				user.setPassword(txtPassword.getText());
				usr.save(user);
				reset();
			}
		});
		btnSave.setForeground(new Color(0, 0, 0));
		btnSave.setBounds(126, 159, 75, 32);
		contentPane.add(btnSave);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.setNama(txtName.getText());
				user.setUsername(txtUsername.getText());
				user.setPassword(txtPassword.getText());
				user.setId(id);
				usr.update(user);
				reset();
				loadTable();
			}
		});
		btnUpdate.setBounds(207, 159, 92, 32);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id != null) {
				    usr.delete(id);
				    reset();
				    loadTable();
				} else {
				    JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan di hapus");
				}
			}
		});
		btnDelete.setBounds(306, 159, 92, 32);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(405, 159, 92, 32);
		contentPane.add(btnCancel);
		
		tableUsers = new JTable();
		tableUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id = tableUsers.getValueAt(tableUsers.getSelectedRow(),0).toString();
				txtName.setText(tableUsers.getValueAt(tableUsers.getSelectedRow(),1).toString());
				txtUsername.setText(tableUsers.getValueAt(tableUsers.getSelectedRow(),2).toString());
				txtPassword.setText(tableUsers.getValueAt(tableUsers.getSelectedRow(),3).toString());
			}
		});
		tableUsers.setBounds(21, 222, 500, 316);
		contentPane.add(tableUsers);
	}
}
