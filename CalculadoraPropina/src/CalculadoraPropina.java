import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class CalculadoraPropina {

	private JFrame frmCalculadoraDePropinas;
	private JTextField txt_importe;
	private JTextField txt_propina;
	private JTextField txt_total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraPropina window = new CalculadoraPropina();
					window.frmCalculadoraDePropinas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraPropina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDePropinas = new JFrame();
		frmCalculadoraDePropinas.setTitle("Calculadora de propinas");
		frmCalculadoraDePropinas.setResizable(false);
		frmCalculadoraDePropinas.setBounds(100, 100, 270, 380);
		frmCalculadoraDePropinas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDePropinas.getContentPane().setLayout(null);
		//para que aparezca la ventana en el centro de la pantalla
		frmCalculadoraDePropinas.setLocationRelativeTo(null);
		
		JLabel etiqueta_importe = new JLabel("AÑADIR IMPORTE");
		etiqueta_importe.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta_importe.setFont(new Font("Calibri", Font.BOLD, 16));
		etiqueta_importe.setBounds(114, 11, 130, 26);
		frmCalculadoraDePropinas.getContentPane().add(etiqueta_importe);
		
		txt_importe = new JTextField();
		txt_importe.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_importe.setForeground(Color.WHITE);
		txt_importe.setFont(new Font("Calibri", Font.BOLD, 16));
		txt_importe.setBackground(Color.DARK_GRAY);
		txt_importe.setBounds(10, 48, 234, 44);
		frmCalculadoraDePropinas.getContentPane().add(txt_importe);
		txt_importe.setColumns(10);
		
		JRadioButton boton_10porciento = new JRadioButton("10%");
		boton_10porciento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double valorImporte;
				double propina;
				double totalAbonar;
				String input = txt_importe.getText();
				valorImporte = Double.parseDouble(input);
				propina = valorImporte * 0.10;
				txt_propina.setText(String.format("%.2f",propina)+ " €");
				totalAbonar = valorImporte + propina;
				txt_total.setText(String.format("%.2f",totalAbonar)+ " €");
				
			}
		});
		boton_10porciento.setBounds(20, 147, 49, 23);
		frmCalculadoraDePropinas.getContentPane().add(boton_10porciento);
		
		JRadioButton boton_15porciento = new JRadioButton("15%");
		boton_15porciento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double valorImporte;
				double propina;
				double totalAbonar;
				String input = txt_importe.getText();
				valorImporte = Double.parseDouble(input);
				propina = valorImporte * 0.15;
				txt_propina.setText(String.format("%.2f",propina)+ " €");
				totalAbonar = valorImporte + propina;
				txt_total.setText(String.format("%.2f",totalAbonar)+ " €");
			}
		});
		boton_15porciento.setBounds(102, 147, 49, 23);
		frmCalculadoraDePropinas.getContentPane().add(boton_15porciento);
		
		JRadioButton boton_20porciento = new JRadioButton("20%");
		boton_20porciento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double valorImporte;
				double propina;
				double totalAbonar;
				String input = txt_importe.getText();
				valorImporte = Double.parseDouble(input);
				propina = valorImporte * 0.20;
				txt_propina.setText(String.format("%.2f",propina)+ " €");
				totalAbonar = valorImporte + propina;
				txt_total.setText(String.format("%.2f",totalAbonar)+ " €");
			}
		});
		boton_20porciento.setBounds(180, 147, 49, 23);
		frmCalculadoraDePropinas.getContentPane().add(boton_20porciento);
		
		JLabel etiqueta_marcar_porcentaje = new JLabel("MARQUE EL % DESEADO");
		etiqueta_marcar_porcentaje.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta_marcar_porcentaje.setFont(new Font("Calibri", Font.BOLD, 16));
		etiqueta_marcar_porcentaje.setBounds(10, 114, 234, 26);
		frmCalculadoraDePropinas.getContentPane().add(etiqueta_marcar_porcentaje);
		
		txt_propina = new JTextField();
		txt_propina.setEditable(false);
		txt_propina.setFont(new Font("Calibri", Font.BOLD, 14));
		txt_propina.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_propina.setForeground(Color.WHITE);
		txt_propina.setBackground(Color.DARK_GRAY);
		txt_propina.setBounds(134, 209, 95, 26);
		frmCalculadoraDePropinas.getContentPane().add(txt_propina);
		txt_propina.setColumns(10);
		
		txt_total = new JTextField();
		txt_total.setForeground(Color.WHITE);
		txt_total.setBackground(Color.DARK_GRAY);
		txt_total.setHorizontalAlignment(SwingConstants.CENTER);
		txt_total.setFont(new Font("Calibri", Font.BOLD, 16));
		txt_total.setBounds(10, 286, 234, 44);
		frmCalculadoraDePropinas.getContentPane().add(txt_total);
		txt_total.setColumns(10);
		
		JLabel etiqueta_cantidad_propina = new JLabel("SU PROPINA SON:");
		etiqueta_cantidad_propina.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta_cantidad_propina.setFont(new Font("Calibri", Font.BOLD, 14));
		etiqueta_cantidad_propina.setBounds(112, 180, 112, 18);
		frmCalculadoraDePropinas.getContentPane().add(etiqueta_cantidad_propina);
		
		JLabel etiqueta_total = new JLabel("TOTAL A ABONAR");
		etiqueta_total.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta_total.setFont(new Font("Calibri", Font.BOLD, 16));
		etiqueta_total.setBounds(114, 259, 130, 26);
		frmCalculadoraDePropinas.getContentPane().add(etiqueta_total);
		
		JButton boton_limpiar = new JButton("Limpiar");
		boton_limpiar.setForeground(Color.BLUE);
		boton_limpiar.setBackground(Color.LIGHT_GRAY);
		boton_limpiar.setFont(new Font("Calibri", Font.BOLD, 12));
		boton_limpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_importe.setText("");
				txt_propina.setText("");
				txt_total.setText("");
			}
		});
		boton_limpiar.setBounds(20, 209, 89, 38);
		frmCalculadoraDePropinas.getContentPane().add(boton_limpiar);
	}
}
