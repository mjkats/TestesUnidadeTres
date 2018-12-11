package lux;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JButton;

public class RegisterPage {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	/**
	 * @param dF 
	 * @wbp.parser.entryPoint
	 */
	public RegisterPage() {
		frame = new JFrame();
		frame.setTitle("Register");
		frame.setSize(600,450);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		JLabel lblnccdigo = new JLabel("12NC/C\u00F3digo:");
		lblnccdigo.setBounds(52, 46, 89, 32);
		frame.getContentPane().add(lblnccdigo);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o: ");
		lblDescrio.setBounds(52, 107, 89, 32);
		frame.getContentPane().add(lblDescrio);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(71, 246, 56, 16);
		frame.getContentPane().add(lblValor);
		
		textField = new JTextField();
		textField.setBounds(169, 49, 161, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 112, 355, 100);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 241, 101, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		

		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(144, 336, 97, 25);
		frame.getContentPane().add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String text2 = textField_2.getText();
				float value = Float.valueOf(text2);
				String TwelveNC = textField_1.getText();
				String description = textField.getText();
				java.util.Date today = new java.util.Date();
				java.sql.Date tod = new java.sql.Date(today.getTime());
				System.out.println("rodou");
				
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(291, 336, 97, 25);
		frame.getContentPane().add(btnCancelar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
