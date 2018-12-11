package lux;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class RegisterConstEClients {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtTextanotacoes;
	private final JLabel lblCampoVazio = new JLabel("");
	
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
		
		final JTextField textFieldEmpresa = new JTextField();
		textFieldEmpresa.setName("textFieldEmpresa");
		textFieldEmpresa.setBounds(162, 79, 304, 28);
		frame.getContentPane().add(textFieldEmpresa);
		textFieldEmpresa.setColumns(10);
		
		final JTextField textFieldObra = new JTextField();
		textFieldObra.setName("textFieldObra");
		textFieldObra.setBounds(143, 124, 220, 28);
		frame.getContentPane().add(textFieldObra);
		textFieldObra.setColumns(10);
		
		final JTextField textFieldLocal = new JTextField();
		textFieldLocal.setName("textFieldLocal");
		textFieldLocal.setBounds(189, 214, 292, 28);
		frame.getContentPane().add(textFieldLocal);
		textFieldLocal.setColumns(10);
		
		final JTextField textFieldPrioridade =   new JTextField();
		textFieldPrioridade.setName("textFieldPrioridade");
		textFieldPrioridade.setBounds(176, 265, 220, 28);
		frame.getContentPane().add(textFieldPrioridade);
		textFieldPrioridade.setColumns(10);
		
		JLabel lblCadastroDeObras = new JLabel("Cadastro de Obras");
		lblCadastroDeObras.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblCadastroDeObras.setBounds(177, 13, 304, 40);
		frame.getContentPane().add(lblCadastroDeObras);
		
		
		
		JLabel lblResponsvel = new JLabel("Respons\u00E1vel");
		lblResponsvel.setBounds(74, 177, 76, 16);
		frame.getContentPane().add(lblResponsvel);
		
		final JTextField textFieldResponsavel = new JTextField();
		textFieldResponsavel.setName("textFieldResponsavel");
		textFieldResponsavel.setColumns(10);
		textFieldResponsavel.setBounds(177, 165, 220, 28);
		frame.getContentPane().add(textFieldResponsavel);
		
		final JTextField txtFieldAnotacoes = new JTextField();
		txtFieldAnotacoes.setName("txtFieldAnotacoes");
		txtFieldAnotacoes.setBounds(91, 310, 410, 47);
		frame.getContentPane().add(txtFieldAnotacoes);
		txtFieldAnotacoes.setColumns(10);
		
		JLabel lblAnotaes = new JLabel("Anota\u00E7\u00F5es");
		lblAnotaes.setBounds(12, 317, 67, 32);
		frame.getContentPane().add(lblAnotaes);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setName("btnSalvar");
		btnSalvar.setBounds(137, 370, 97, 25);
		frame.getContentPane().add(btnSalvar);
		
		
		lblCampoVazio.setEnabled(false);
		lblCampoVazio.setName("lblCampoVazio");
		lblCampoVazio.setForeground(Color.RED);
		lblCampoVazio.setBounds(29, 368, 98, 31);
		frame.getContentPane().add(lblCampoVazio);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(textFieldEmpresa.getText().equals("") || textFieldLocal.getText().equals("") ||
					textFieldObra.getText().equals("") || textFieldPrioridade.getText().equals("") ||
					textFieldResponsavel.getText().equals("") || txtFieldAnotacoes.getText().equals("")) {
					lblCampoVazio.setText("Campo vazio!");
					lblCampoVazio.setEnabled(true);
			}
		}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setName("btnCancelar");
		btnCancelar.setBounds(284, 370, 97, 25);
		frame.getContentPane().add(btnCancelar);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				textFieldEmpresa.setText("");
				textFieldLocal.setText("");
				textFieldObra.setText("");
				textFieldPrioridade.setText("");
				textFieldResponsavel.setText("");
				txtFieldAnotacoes.setText("");
				
			}
		});
	}
	
	public JFrame returnFrame() {
		return this.frame;
	}
}
