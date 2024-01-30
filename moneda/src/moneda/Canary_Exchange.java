package moneda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Canary_Exchange extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_importe;
	private JLabel lblNewLabel;
	private JTextField txt_cambio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Canary_Exchange frame = new Canary_Exchange();
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
	public Canary_Exchange() {
		setTitle("Canary Exchange");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//para que aparezca la ventana en el centro de la pantalla
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta_importe = new JLabel("AÑADIR IMPORTE");
		etiqueta_importe.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta_importe.setForeground(SystemColor.textText);
		etiqueta_importe.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		etiqueta_importe.setBounds(77, 11, 197, 29);
		contentPane.add(etiqueta_importe);
		
		txt_importe = new JTextField();
		txt_importe.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		txt_importe.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_importe.setBackground(SystemColor.textText);
		txt_importe.setForeground(SystemColor.text);
		txt_importe.setBounds(10, 36, 264, 50);
		contentPane.add(txt_importe);
		txt_importe.setColumns(10);
		
		lblNewLabel = new JLabel("CAMBIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(191, 106, 83, 29);
		contentPane.add(lblNewLabel);
		
		txt_cambio = new JTextField();
		txt_cambio.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		txt_cambio.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_cambio.setForeground(SystemColor.text);
		txt_cambio.setColumns(10);
		txt_cambio.setBackground(SystemColor.textText);
		txt_cambio.setBounds(10, 133, 264, 50);
		contentPane.add(txt_cambio);
		
		JButton boton_dolar = new JButton("DOLAR $");
		boton_dolar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporte;
				double cambiom;
				double dolar = 0.92;
				String input = txt_importe.getText();
				if (input.matches("\\d+")) {
					valorImporte = Integer.parseInt(input);
					cambiom = valorImporte * dolar;
					txt_cambio.setText(String.format("%.2f",cambiom)+ " €");
				}else {
					txt_cambio.setText("Ingrese un importe válido");
				}
			}
		});
		boton_dolar.setBackground(SystemColor.textHighlightText);
		boton_dolar.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		boton_dolar.setBounds(10, 197, 112, 43);
		contentPane.add(boton_dolar);
		
		JButton boton_libras = new JButton("LIBRAS £");
		boton_libras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporte;
				double cambiom;
				double libras = 1.12;
				String input = txt_importe.getText();
				if (input.matches("\\d+")) {
					valorImporte = Integer.parseInt(input);
					cambiom = valorImporte * libras;
					txt_cambio.setText(String.format("%.2f",cambiom)+ " €");
				}else {
					txt_cambio.setText("Ingrese un importe válido");
				}
			}
		});
		boton_libras.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		boton_libras.setBackground(SystemColor.textHighlightText);
		boton_libras.setBounds(162, 197, 112, 43);
		contentPane.add(boton_libras);
		
		JButton boton_rublos = new JButton("RUBLOS ₽");
		boton_rublos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporte;
				double cambiom;
				double rublos = 0.010;
				String input = txt_importe.getText();
				if (input.matches("\\d+")) {
					valorImporte = Integer.parseInt(input);
					cambiom = valorImporte * rublos;
					txt_cambio.setText(String.format("%.2f",cambiom)+ " €");
				}else {
					txt_cambio.setText("Ingrese un importe válido");
				}
			}
		});
		boton_rublos.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		boton_rublos.setBackground(SystemColor.textHighlightText);
		boton_rublos.setBounds(10, 268, 112, 43);
		contentPane.add(boton_rublos);
		
		JButton boton_yenes = new JButton("YENES ¥");
		boton_yenes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorImporte;
				double cambiom;
				double yenes = 0.0062;
				String input = txt_importe.getText();
				try {
					valorImporte = Integer.parseInt(input);
					cambiom = valorImporte * yenes;
					txt_cambio.setText(String.format("%.2f", cambiom)+ " €");
				}catch (NumberFormatException ex){
					txt_cambio.setText("Ingrese un importe válido");
				}
			
			}
		});
		boton_yenes.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		boton_yenes.setBackground(SystemColor.textHighlightText);
		boton_yenes.setBounds(162, 268, 112, 43);
		contentPane.add(boton_yenes);
	}
}
