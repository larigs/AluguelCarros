package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

import veiculo.Carro;
import Sistema.BancoDados;

public class Alugar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Construtor(Carro carro) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alugar frame = new Alugar(carro);
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
	public Alugar(Carro carro) {
		
		setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(210, 11, 247, 489);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTarifasAdicionais = new JLabel("TARIFAS ADICIONAIS");
		lblTarifasAdicionais.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarifasAdicionais.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTarifasAdicionais.setBounds(10, 11, 227, 25);
		panel.add(lblTarifasAdicionais);
		
		JComboBox comboSeguro = new JComboBox();
		comboSeguro.setBounds(10, 98, 227, 22);
		panel.add(comboSeguro);
		
		JButton btnDetalharSeguro = new JButton("Detalhar");
		btnDetalharSeguro.setBounds(10, 131, 227, 23);
		panel.add(btnDetalharSeguro);
		
		JComboBox comboCadeira = new JComboBox();
		comboCadeira.setBounds(10, 219, 227, 22);
		panel.add(comboCadeira);
		
		JButton btnDetalharCadeira = new JButton("Detalhar");
		btnDetalharCadeira.setBounds(10, 252, 227, 23);
		panel.add(btnDetalharCadeira);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cadeira crian\u00E7a");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(10, 189, 227, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxSeguro = new JCheckBox("Seguro");
		chckbxSeguro.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxSeguro.setBounds(10, 68, 227, 23);
		panel.add(chckbxSeguro);
		
		JCheckBox chckbxWifi = new JCheckBox("Wi-fi");
		chckbxWifi.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxWifi.setBounds(10, 318, 227, 23);
		panel.add(chckbxWifi);
		
		JButton btnNewButton_3 = new JButton("Valor total das tarifas");
		btnNewButton_3.setBounds(10, 455, 227, 23);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 11, 190, 246);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("RETIRADA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 11, 170, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblAgencia_2 = new JLabel("Agencia");
		lblAgencia_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencia_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAgencia_2.setBounds(10, 53, 170, 16);
		panel_1.add(lblAgencia_2);
		
		JComboBox comboRetirada = new JComboBox();
		comboRetirada.setBounds(10, 80, 170, 22);
		panel_1.add(comboRetirada);
		
		JButton btnEnderecoRetirada = new JButton("Endere\u00E7o");
		btnEnderecoRetirada.setBounds(10, 113, 170, 23);
		panel_1.add(btnEnderecoRetirada);
		
		JLabel lblDataRetirada_2 = new JLabel("Dia");
		lblDataRetirada_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataRetirada_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDataRetirada_2.setBounds(10, 147, 45, 16);
		panel_1.add(lblDataRetirada_2);
		
		JLabel lblMs_2 = new JLabel("M\u00EAs");
		lblMs_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMs_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMs_2.setBounds(65, 147, 45, 16);
		panel_1.add(lblMs_2);
		
		JLabel lblAno_2 = new JLabel("Ano");
		lblAno_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAno_2.setBounds(120, 147, 60, 16);
		panel_1.add(lblAno_2);
		
		JComboBox comboAnoRetirada = new JComboBox();
		comboAnoRetirada.setBounds(120, 174, 60, 22);
		panel_1.add(comboAnoRetirada);
		
		JComboBox comboMesRetirada = new JComboBox();
		comboMesRetirada.setBounds(65, 174, 45, 22);
		panel_1.add(comboMesRetirada);
		
		JComboBox comboDiaRetirada = new JComboBox();
		comboDiaRetirada.setBounds(10, 174, 45, 22);
		panel_1.add(comboDiaRetirada);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1.setBackground(SystemColor.menu);
		panel_1_1.setBounds(10, 268, 190, 232);
		contentPane.add(panel_1_1);
		
		JLabel lblEntrega_1_1 = new JLabel("ENTREGA");
		lblEntrega_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrega_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEntrega_1_1.setBounds(10, 11, 170, 25);
		panel_1_1.add(lblEntrega_1_1);
		
		JLabel lblAgencia_1_1_1 = new JLabel("Agencia");
		lblAgencia_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencia_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAgencia_1_1_1.setBounds(10, 53, 170, 16);
		panel_1_1.add(lblAgencia_1_1_1);
		
		JComboBox comboEntrega = new JComboBox();
		comboEntrega.setBounds(10, 80, 170, 22);
		panel_1_1.add(comboEntrega);
		
		JButton btnEnderecoEntrega = new JButton("Endere\u00E7o");
		btnEnderecoEntrega.setBounds(10, 113, 170, 23);
		panel_1_1.add(btnEnderecoEntrega);
		
		JLabel lblDataRetirada_1_1_1 = new JLabel("Dia");
		lblDataRetirada_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataRetirada_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDataRetirada_1_1_1.setBounds(10, 147, 45, 16);
		panel_1_1.add(lblDataRetirada_1_1_1);
		
		JLabel lblMs_1_1_1 = new JLabel("M\u00EAs");
		lblMs_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMs_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMs_1_1_1.setBounds(65, 147, 45, 16);
		panel_1_1.add(lblMs_1_1_1);
		
		JLabel lblAno_1_1_1 = new JLabel("Ano");
		lblAno_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAno_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAno_1_1_1.setBounds(120, 147, 60, 16);
		panel_1_1.add(lblAno_1_1_1);
		
		JComboBox comboAnoEntrega = new JComboBox();
		comboAnoEntrega.setBounds(120, 174, 60, 22);
		panel_1_1.add(comboAnoEntrega);
		
		JComboBox comboMesEntrega = new JComboBox();
		comboMesEntrega.setBounds(65, 174, 45, 22);
		panel_1_1.add(comboMesEntrega);
		
		JComboBox comboDiaEntrega = new JComboBox();
		comboDiaEntrega.setBounds(10, 174, 45, 22);
		panel_1_1.add(comboDiaEntrega);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBackground(new Color(240, 255, 240));
		panel_2.setBounds(467, 158, 257, 342);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel carroEscolhido = new JLabel(carro.getModelo());
		carroEscolhido.setHorizontalAlignment(SwingConstants.CENTER);
		carroEscolhido.setFont(new Font("Tahoma", Font.BOLD, 16));
		carroEscolhido.setBounds(10, 11, 237, 38);
		panel_2.add(carroEscolhido);
		
		JButton btnNewButton = new JButton("Confirmar Aluguel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 277, 237, 54);
		panel_2.add(btnNewButton);
		
		JButton btnPreoTotal = new JButton("Revis\u00E3o");
		btnPreoTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPreoTotal.setBounds(10, 212, 237, 54);
		panel_2.add(btnPreoTotal);
		
		JLabel nomeUsuario = new JLabel(BancoDados.cadastrarUsuario[BancoDados.pos].getNome());
		nomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		nomeUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		nomeUsuario.setBounds(10, 60, 237, 30);
		panel_2.add(nomeUsuario);
		
		JLabel emailUsuario = new JLabel(BancoDados.cadastrarUsuario[BancoDados.pos].getEmail());
		emailUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		emailUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		emailUsuario.setBounds(10, 101, 237, 30);
		panel_2.add(emailUsuario);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(467, 11, 257, 136);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblFidelidade = new JLabel("FIDELIDADE");
		lblFidelidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblFidelidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFidelidade.setBounds(10, 11, 237, 25);
		panel_3.add(lblFidelidade);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Desconto");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox_1.setBounds(10, 70, 97, 23);
		panel_3.add(chckbxNewCheckBox_1);
		
		JComboBox comboDesconto = new JComboBox();
		comboDesconto.setBounds(10, 100, 97, 22);
		panel_3.add(comboDesconto);
	}
}