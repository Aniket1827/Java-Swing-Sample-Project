import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class First extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
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
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUpForm = new JLabel("Sign Up Form");
		lblSignUpForm.setForeground(Color.DARK_GRAY);
		lblSignUpForm.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblSignUpForm.setBounds(144, 11, 140, 33);
		contentPane.add(lblSignUpForm);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblName.setBounds(31, 75, 65, 23);
		contentPane.add(lblName);
		
		JLabel lblEmailId = new JLabel("Email id : ");
		lblEmailId.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblEmailId.setBounds(31, 109, 105, 23);
		contentPane.add(lblEmailId);
		
		JLabel lblContactNo = new JLabel("City : ");
		lblContactNo.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblContactNo.setBounds(31, 146, 105, 19);
		contentPane.add(lblContactNo);
		
		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblUsername.setBounds(31, 176, 105, 19);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblPassword.setBounds(31, 206, 80, 23);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(138, 76, 146, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 110, 146, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 175, 146, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(138, 207, 146, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Consolas", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"New York", "California", "New Delhi", "Melbourne", "Sydney", "Mumbai", "Hyderabad"}));
		comboBox.setBounds(138, 144, 146, 20);
		contentPane.add(comboBox);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane p = new JOptionPane();
						p.showMessageDialog(null,"Signed Up Successfully! :)");
						
					}
				});
		btnSignUp.setFont(new Font("Consolas", Font.PLAIN, 13));
		btnSignUp.setBounds(306, 228, 105, 23);
		contentPane.add(btnSignUp);
	}
}
