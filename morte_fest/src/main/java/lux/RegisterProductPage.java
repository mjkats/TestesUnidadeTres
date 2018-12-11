package lux;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JButton;
import java.awt.Color;

public class RegisterProductPage {
	private JFrame frame;

	
	/**
	 * @param dF 
	 * @wbp.parser.entryPoint
	 */
	public RegisterProductPage() {
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
		
		final JTextField textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(169, 49, 161, 27);
		frame.getContentPane().add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setName("textFieldCodigo");
		
		final JTextField textFieldDescricao = new JTextField();
		textFieldDescricao.setBounds(167, 112, 355, 100);
		textFieldDescricao.setName("textFieldDescricao");
		frame.getContentPane().add(textFieldDescricao);
		textFieldDescricao.setColumns(10);
		
		final JTextField textFieldValor = new JTextField();
		textFieldValor.setBounds(162, 241, 101, 27);
		textFieldValor.setName("textFieldValor");
		frame.getContentPane().add(textFieldValor);
		textFieldValor.setColumns(10);
		

		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(144, 336, 97, 25);
		btnSalvar.setName("btnSalvar");
		frame.getContentPane().add(btnSalvar);
		
		final JLabel lblCampoVazio = new JLabel("");
		lblCampoVazio.setEnabled(false);
		lblCampoVazio.setForeground(Color.RED);
		lblCampoVazio.setBounds(144, 294, 101, 16);
		lblCampoVazio.setText("lblCampoVazio");
		frame.getContentPane().add(lblCampoVazio);

		final JLabel labelok = new JLabel("");
		labelok.setBounds(265, 295, 46, 14);
		labelok.setEnabled(false);
		labelok.setName("labelok");
		frame.getContentPane().add(labelok);

		final JLabel formatValorlabel = new JLabel("");
		formatValorlabel.setEnabled(false);
		formatValorlabel.setBackground(Color.RED);
		formatValorlabel.setBounds(322, 247, 46, 14);
		formatValorlabel.setName("formatValorlabel");
		frame.getContentPane().add(formatValorlabel);
		
		
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String text2 = textFieldValor.getText();
				try {
				float value = Float.valueOf(text2);
				}
				
				catch(NumberFormatException e1){
					formatValorlabel.setText("Digite valor no tipo float!");
					formatValorlabel.setEnabled(true);
				}
				
				finally {
				
				String TwelveNC = textFieldDescricao.getText();
				String description = textFieldCodigo.getText();
				
				if(text2.equals("") || TwelveNC.equals("") || description.equals("")) {
					lblCampoVazio.setText("Campo vazio!");
					lblCampoVazio.setEnabled(true);
				}
				else {
					labelok.setText("Ok!");
					labelok.setEnabled(true);
				}
			}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(291, 336, 97, 25);
		frame.getContentPane().add(btnCancelar);
		
		
		
	}

	public JFrame ReturnFrame() {
		return frame;
	}
}
