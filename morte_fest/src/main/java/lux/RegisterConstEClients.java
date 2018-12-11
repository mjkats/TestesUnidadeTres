package lux;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class RegisterConstEClients {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public RegisterConstEClients() {
		frame = new JFrame();
		frame.setTitle("Register");
		frame.setSize(600,450);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmpresa = new JLabel("Empresa: ");
		lblEmpresa.setBounds(91, 79, 59, 28);
		frame.getContentPane().add(lblEmpresa);
		
		JLabel lblObra = new JLabel("Obra:");
		lblObra.setBounds(91, 136, 56, 16);
		frame.getContentPane().add(lblObra);
		
		JLabel lblLocalDaObra = new JLabel("Local da Obra:");
		lblLocalDaObra.setBounds(74, 220, 90, 16);
		frame.getContentPane().add(lblLocalDaObra);
		
		JLabel lblPrioridade = new JLabel("Prioridade: ");
		lblPrioridade.setBounds(91, 271, 73, 16);
		frame.getContentPane().add(lblPrioridade);
		
		textField = new JTextField();
		textField.setName("textEmpresa");
		textField.setBounds(162, 79, 304, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setName("textObra");
		textField_1.setBounds(143, 124, 220, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCadastroDeObras = new JLabel("Cadastro de Obras");
		lblCadastroDeObras.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblCadastroDeObras.setBounds(177, 13, 304, 40);
		frame.getContentPane().add(lblCadastroDeObras);
		
		textField_2 = new JTextField();
		textField_2.setName("textLocal");
		textField_2.setColumns(10);
		textField_2.setBounds(189, 214, 292, 28);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setName("textPrioridade");
		textField_3.setColumns(10);
		textField_3.setBounds(176, 265, 220, 28);
		frame.getContentPane().add(textField_3);
		
		JLabel lblResponsvel = new JLabel("Respons\u00E1vel");
		lblResponsvel.setBounds(74, 177, 76, 16);
		frame.getContentPane().add(lblResponsvel);
		
		textField_4 = new JTextField();
		textField_4.setName("textResponsavel");
		textField_4.setColumns(10);
		textField_4.setBounds(177, 165, 220, 28);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_3.setName("textAnotacoes");
		textField_5.setBounds(91, 310, 410, 47);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAnotaes = new JLabel("Anota\u00E7\u00F5es");
		lblAnotaes.setBounds(12, 317, 67, 32);
		frame.getContentPane().add(lblAnotaes);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setText("btnSalvar");
		btnSalvar.setBounds(137, 370, 97, 25);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setText("btnCancelar");
		btnCancelar.setBounds(284, 370, 97, 25);
		frame.getContentPane().add(btnCancelar);
	}
	
	public JFrame returnFrame() {
		return frame;
	}
}
