package Guis;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import Conexao.Dao.ClienteDao;
import Models.Cliente;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes extends JInternalFrame {
	private JTextField textFieldCodCliente;
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private JTextField textFieldEndereco;
	private JTextField textFieldRg;
	private JTextField textFieldBairro;
	private JTextField textFieldTelefone;
	private JTextField textFieldCep;
	private JTable table;
	private JTextField textFieldEmail;
	private JTextField textFieldCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setClosable(true);
		setFrameIcon(new ImageIcon(Clientes.class.getResource("/Icones/cliente.png")));
		setTitle("Gestão de Clientes");
		setBounds(100, 100, 767, 416);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clientes");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(318, 0, 132, 51);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 47, 749, 320);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCodCliente = new JLabel("Cod_Cliente:");
		lblCodCliente.setBounds(10, 25, 81, 20);
		lblCodCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblCodCliente);
		
		textFieldCodCliente = new JTextField();
		textFieldCodCliente.setBounds(101, 25, 55, 20);
		textFieldCodCliente.setColumns(10);
		textFieldCodCliente.setBackground(new Color(225, 225, 225));
		panel.add(textFieldCodCliente);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(179, 25, 63, 20);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(227, 23, 288, 20);
		textFieldNome.setColumns(10);
		textFieldNome.setBackground(new Color(225, 225, 225));
		panel.add(textFieldNome);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(525, 25, 89, 18);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(557, 26, 168, 20);
		textFieldCpf.setColumns(10);
		textFieldCpf.setBackground(new Color(225, 225, 225));
		panel.add(textFieldCpf);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(277, 61, 448, 20);
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBackground(new Color(225, 225, 225));
		panel.add(textFieldEndereco);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(209, 60, 89, 20);
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblEndereco);
		
		textFieldRg = new JTextField();
		textFieldRg.setBounds(48, 60, 132, 20);
		textFieldRg.setColumns(10);
		textFieldRg.setBackground(new Color(225, 225, 225));
		panel.add(textFieldRg);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(10, 60, 104, 20);
		lblRg.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblRg);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 91, 46, 20);
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblBairro);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setBounds(58, 91, 221, 20);
		textFieldBairro.setColumns(10);
		textFieldBairro.setBackground(new Color(225, 225, 225));
		panel.add(textFieldBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(301, 92, 89, 18);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblCidade);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(258, 125, 148, 20);
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBackground(new Color(225, 225, 225));
		panel.add(textFieldTelefone);
		
		textFieldCep = new JTextField();
		textFieldCep.setBounds(48, 125, 132, 20);
		textFieldCep.setColumns(10);
		textFieldCep.setBackground(new Color(225, 225, 225));
		panel.add(textFieldCep);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(10, 124, 104, 20);
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblCep);
		
		JComboBox comboBox_Uf = new JComboBox();
		comboBox_Uf.setModel(new DefaultComboBoxModel(new String[] {"", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"}));
		comboBox_Uf.setBounds(599, 92, 126, 22);
		panel.add(comboBox_Uf);
		
		JLabel lblQuantidade_1_1 = new JLabel("UF:");
		lblQuantidade_1_1.setBounds(574, 92, 55, 18);
		lblQuantidade_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblQuantidade_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 156, 716, 114);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				ClienteDao clienteDao = new ClienteDao();
				
				cliente.setNome_cliente(textFieldNome.getText());
				cliente.setCpf_cliente(textFieldCep.getText());
				cliente.setRg_cliente(textFieldRg.getText());
				cliente.setEmail_cliente(textFieldEmail.getText());
				cliente.setTelefone_cliente(textFieldTelefone.getText());
				cliente.setEndereco_cliente(textFieldEndereco.getText());
				cliente.setBairro_cliente(textFieldBairro.getText());
				cliente.setCidade_cliente(textFieldCidade.getText());
				cliente.setUf_cliente(comboBox_Uf.getSelectedItem().toString());
				cliente.setCep_cliente(textFieldCep.getText());
					
				clienteDao.inserirCliente(cliente);
				
			}
		});
		btnGravar.setBounds(227, 286, 89, 23);
		panel.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(407, 286, 89, 23);
		panel.add(btnLimpar);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(190, 125, 71, 18);
		panel.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(426, 125, 71, 18);
		panel.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBackground(new Color(225, 225, 225));
		textFieldEmail.setBounds(472, 125, 253, 20);
		panel.add(textFieldEmail);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		textFieldCidade.setBackground(new Color(225, 225, 225));
		textFieldCidade.setBounds(358, 92, 192, 20);
		panel.add(textFieldCidade);

	}
}
