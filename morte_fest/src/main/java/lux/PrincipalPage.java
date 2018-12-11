package lux;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalPage {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	
	
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @wbp.parser.entryPoint
	 */
	public PrincipalPage() throws ClassNotFoundException{
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.setBounds(400, 200, 1300, 800);
		frame = new JFrame();
		frame.setTitle("Lux");
		frame.setSize(800,700);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		CreatePrincipalPage();
		JLabel lblSra = new JLabel("Sr(a)");
		lblSra.setBounds(66, 58, 56, 16);
		frame.getContentPane().add(lblSra);
		
		textField = new JTextField();
		textField.setName("textNome");
		textField.setBounds(110, 55, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblObra = new JLabel("Obra");
		lblObra.setBounds(66, 86, 56, 16);
		frame.getContentPane().add(lblObra);
		
		textField_1 = new JTextField();
		textField_1.setName("textObra");
		textField_1.setColumns(10);
		textField_1.setBounds(110, 83, 116, 22);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPagamento = new JLabel("Pagamento:");
		lblPagamento.setBounds(268, 58, 69, 16);
		frame.getContentPane().add(lblPagamento);
		
		textField_2 = new JTextField();
		textField_2.setName("textPagamento");
		textField_2.setColumns(10);
		textField_2.setBounds(349, 55, 116, 22);
		frame.getContentPane().add(textField_2);
		
		JLabel label = new JLabel("Frete:");
		label.setBounds(268, 86, 69, 16);
		frame.getContentPane().add(label);
		
		textField_3 = new JTextField();
		textField_3.setName("textFrete");
		textField_3.setColumns(10);
		textField_3.setBounds(349, 83, 116, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setName("textObs");
		textField_4.setBounds(77, 480, 561, 57);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("OBS:");
		lblObservacoes.setBounds(30, 499, 38, 25);
		frame.getContentPane().add(lblObservacoes);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setName("btnSalvar");
		btnSalvar.setBounds(349, 571, 97, 25);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setName("btnCancelar");
		btnCancelar.setBounds(482, 571, 97, 25);
		frame.getContentPane().add(btnCancelar);
		
		
		textField_5 = new JTextField();
		textField_5.setName("textCodigo");
		textField_5.setBounds(154, 153, 90, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(97, 156, 56, 16);
		frame.getContentPane().add(lblCodigo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 203, 561, 201);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setName("table");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
					 "12NC/C\u00F3digo","Descri\u00E7\u00E3o","Pre\u00E7o", "Desconto",
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(97);
		scrollPane.setViewportView(table);
		
		JButton btnExcluirProduto = new JButton("Excluir produto");
		btnExcluirProduto.setBounds(400, 422, 129, 22);
		frame.getContentPane().add(btnExcluirProduto);
		
		btnExcluirProduto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Confirma��o", JOptionPane.YES_NO_OPTION);
				if(answer == JOptionPane.YES_OPTION) {
					
				}
			}
		});
		
		JButton btnAdicionar = new JButton("Adicionar produto");
		btnAdicionar.setName("btnAdicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdicionar.setBounds(261, 152, 139, 22);
		frame.getContentPane().add(btnAdicionar);
		
		btnCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	PrincipalPage principal = new PrincipalPage();
			//		principal.CreatePrincipalPage();
					Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

				        public void run() {
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

	public void CreatePrincipalPage() {
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu file = new JMenu("Lux");
		menuBar.add(file);
		
		JMenu file3 = new JMenu("Obras e Clientes");
		menuBar.add(file3);
		
		JMenuItem FileItem = new JMenuItem("Fazer or�amento");
		file.add(FileItem);
		
		JMenuItem SecondFileItem = new JMenuItem("Ver Or�amentos");
		file.add(SecondFileItem);
		
		JMenuItem FileItem3 = new JMenuItem("Cadastrar");
		file3.add(FileItem3);
		FileItem3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				RegisterConstEClients reg = new RegisterConstEClients();
				
			}
		});
		
		JMenuItem FileItem3_1 = new JMenuItem("Visualizar");
		file3.add(FileItem3_1);
		
		
		file.addSeparator();
		
		JMenuItem FourthFileItem = new JMenuItem ("Salvar e fechar");
		file.add(FourthFileItem);
		
		JMenu file2 = new JMenu("Produtos");

		menuBar.add(file2);
		
		JMenuItem FileItem2 = new JMenuItem("Cadastrar");
		file2.add(FileItem2);
		FileItem2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				RegisterProductPage regprod = new RegisterProductPage();
				
			}
		});
		
		JMenuItem FileItem2_2 = new JMenuItem("Visualizar");
		file2.add(FileItem2_2);
		
		FileItem2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		JMenu file4 = new JMenu ("Sobre");
		menuBar.add(file4);
		
		JMenuItem FileItem4 = new JMenuItem("Projeto Lux");
		file4.add(FileItem4);
	}
	
	public JFrame ReturnFrame() {
		return frame;
	}
}
