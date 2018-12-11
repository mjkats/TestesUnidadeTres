package lux;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginPage extends JFrame {
	private JFrame contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

				        public void run() {
				//            LoginPage page = new LoginPage();
				            // Do what you want when the application is stopping

				        	 	
				        }
					}));
				}catch(Exception E){
					E.printStackTrace();
				}
				finally {
					
				}
				
			}
		});
	}
	
	public LoginPage() {
	
		//setBounds(100, 100, 450, 300);
		contentPane = new JFrame();
		contentPane.setSize(450, 330);
		contentPane.setTitle("Login");
		contentPane.getContentPane().setLayout(null);
		contentPane.setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JLabel lblLux = new JLabel("Lux");
		lblLux.setName("Lux");
		lblLux.setBounds(47, 83, 56, 16);
		contentPane.getContentPane().add(lblLux);
		JTextArea textarea = new JTextArea();
		textField = new JTextField();
		textField.setName("textField");
		textField.setBounds(259, 61, 116, 30);
		contentPane.getContentPane().add(textField);
		textField.setColumns(10);
		textarea.setName("textFields");
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(259, 32, 56, 16);
		contentPane.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(259, 109, 56, 16);
		contentPane.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setName("passwordField");;
		passwordField.setBounds(259, 138, 116, 30);
		contentPane.getContentPane().add(passwordField);
		
		final JLabel lblLoginIncorreto = new JLabel("");
		lblLoginIncorreto.setName("lblLoginIncorreto");
		lblLoginIncorreto.setForeground(Color.RED);
		lblLoginIncorreto.setBounds(100, 145, 116, 16);
		contentPane.getContentPane().add(lblLoginIncorreto);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setName("btnLogin");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("login") && passwordField.getText().equals("login")) {
					try {
						lblLoginIncorreto.setText("Approved");
						contentPane.setVisible(true);
						
						PrincipalPage page = new PrincipalPage();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				else if(!textField.getText().equals("login") && !passwordField.getText().equals("login")) {
					lblLoginIncorreto.setText("Login incorreto!");
				}
				else if(!textField.getText().equals("login")){
					lblLoginIncorreto.setText("Login incorreto!");
				}
				else if(!passwordField.getText().equals("login")){
					lblLoginIncorreto.setText("Senha incorreta!");
				}
			}
		});
		btnLogin.setBounds(260, 196, 115, 30);
		contentPane.getContentPane().add(btnLogin);
	}
	
	public JFrame ReturnFrame() {
		return contentPane;
	}
}