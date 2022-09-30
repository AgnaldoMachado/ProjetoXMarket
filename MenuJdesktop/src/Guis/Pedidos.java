package Guis;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.beans.PropertyVetoException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class Pedidos extends JInternalFrame {
	private JTextField textFieldCod;
	private JTextField textFieldProduto;
	private JTextField textFieldQuantidade;
	private JTextField textFieldCompra;
	private JTextField textFieldCompra_1;
	private JTable table;
	private JTextField textFieldViewMarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedidos frame = new Pedidos();
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
	public Pedidos() {
		try {
			setMaximum(false);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setClosable(true);
		setFrameIcon(new ImageIcon(Pedidos.class.getResource("/Icones/produtos.png")));
		setTitle("Gestão de Pedidos");
		setBounds(100, 100, 769, 417);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Pedidos");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(302, 0, 154, 48);
		getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 46, 739, 321);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblCodProduto = new JLabel("Cod:");
		lblCodProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodProduto.setBounds(23, 15, 46, 20);
		panel.add(lblCodProduto);

		textFieldCod = new JTextField();
		textFieldCod.setBackground(new Color(225, 225, 225));
		textFieldCod.setBounds(61, 15, 86, 20);
		panel.add(textFieldCod);
		textFieldCod.setColumns(10);

		textFieldProduto = new JTextField();
		textFieldProduto.setColumns(10);
		textFieldProduto.setBackground(new Color(225, 225, 225));
		textFieldProduto.setBounds(240, 13, 288, 20);
		panel.add(textFieldProduto);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProduto.setBounds(179, 15, 63, 20);
		panel.add(lblProduto);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantidade.setBounds(538, 15, 89, 18);
		panel.add(lblQuantidade);

		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setColumns(10);
		textFieldQuantidade.setBackground(new Color(225, 225, 225));
		textFieldQuantidade.setBounds(627, 13, 89, 20);
		panel.add(textFieldQuantidade);

		JLabel lblPrecoC = new JLabel("Preço Compra:");
		lblPrecoC.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecoC.setBounds(23, 72, 104, 20);
		panel.add(lblPrecoC);

		textFieldCompra = new JTextField();
		textFieldCompra.setEditable(false);
		textFieldCompra.setColumns(10);
		textFieldCompra.setBackground(new Color(225, 225, 225));
		textFieldCompra.setBounds(116, 72, 77, 20);
		panel.add(textFieldCompra);

		JLabel lblPrecoV = new JLabel("Preço Venda:");
		lblPrecoV.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecoV.setBounds(203, 72, 89, 20);
		panel.add(lblPrecoV);

		textFieldCompra_1 = new JTextField();
		textFieldCompra_1.setEditable(false);
		textFieldCompra_1.setColumns(10);
		textFieldCompra_1.setBackground(new Color(225, 225, 225));
		textFieldCompra_1.setBounds(290, 72, 77, 20);
		panel.add(textFieldCompra_1);

		JLabel lblCodMarca = new JLabel("Cod_Marca:");
		lblCodMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodMarca.setBounds(420, 72, 89, 20);
		panel.add(lblCodMarca);

		JComboBox comboBox_CodMarca = new JComboBox();
		comboBox_CodMarca.setModel(
				new DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox_CodMarca.setBounds(506, 72, 46, 22);
		panel.add(comboBox_CodMarca);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 124, 693, 147);
		panel.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(UIManager.getColor("Button.light"));
		table.setForeground(SystemColor.activeCaption);

		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);

		textFieldViewMarca = new JTextField();
		textFieldViewMarca.setBackground(new Color(225, 225, 225));
		textFieldViewMarca.setBounds(587, 73, 129, 20);
		panel.add(textFieldViewMarca);
		textFieldViewMarca.setColumns(10);

		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.setBounds(222, 287, 89, 23);
		panel.add(btnNewButton);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(402, 287, 89, 23);
		panel.add(btnLimpar);

	}
}
