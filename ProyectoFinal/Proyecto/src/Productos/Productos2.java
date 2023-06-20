package Productos;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloConfiguracion;
import Clases.Config;
import ProductosAnimales.ProductosPerros;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Productos2 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidad5;
	private JTextField txtCantidad6;
	private JTextField txtCantidad7;
	private JTextField txtCantidad8;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	public static int estado=0;
	public static int cantPr5;
	public static int cantPr6;
	public static int cantPr7;
	public static int cantPr8;
	public static float totalpr5;
	public static float totalpr6;
	public static float totalpr7;
	public static float totalpr8;
	public static boolean valorpr5 = false;
	public static boolean valorpr6 = false;
	public static boolean valorpr7 = false;
	public static boolean valorpr8 = false;
	private JTextField txtPrecio;
	private JTextField txtPrecio1;
	private JTextField txtPrecio2;
	private JTextField txtPrecio3;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos2 frame = new Productos2();
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
	public Productos2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Productos2.class.getResource("/iconos32/productos 32.png")));
		setTitle("Productos");
		this.setResizable(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Productos2.class.getResource("/imagenes/Gatos/raton de peluche.jpg")));
		label.setBounds(10, 11, 235, 179);
		getContentPane().add(label);
		
		JLabel lblPelucheRatonPara = new JLabel("Ratones de peluche para gatos");
		lblPelucheRatonPara.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPelucheRatonPara.setBounds(20, 209, 213, 23);
		getContentPane().add(lblPelucheRatonPara);
		
		JLabel label_3 = new JLabel("Precio: ");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(10, 237, 67, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Productos2.class.getResource("/imagenes/Perros/camas.jpg")));
		label_4.setBounds(10, 292, 235, 179);
		getContentPane().add(label_4);
		
		JLabel lblCamaParaPerro = new JLabel("Cama para perro");
		lblCamaParaPerro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCamaParaPerro.setBounds(20, 482, 213, 23);
		getContentPane().add(lblCamaParaPerro);
		
		JLabel label_7 = new JLabel("Precio: ");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(10, 510, 67, 14);
		getContentPane().add(label_7);
		
		JLabel label_9 = new JLabel("Precio: ");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_9.setBounds(355, 510, 67, 14);
		getContentPane().add(label_9);
		
		JLabel lblCasaModernaPara = new JLabel("Rueda para hamster");
		lblCasaModernaPara.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCasaModernaPara.setBounds(365, 482, 213, 23);
		getContentPane().add(lblCasaModernaPara);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(Productos2.class.getResource("/imagenes/hamster/rueda.jpg")));
		label_11.setBounds(345, 292, 239, 179);
		getContentPane().add(label_11);
		
		JLabel label_13 = new JLabel("Precio: ");
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_13.setBounds(344, 237, 67, 14);
		getContentPane().add(label_13);
		
		JLabel lblHamacaParaPajaros = new JLabel("Hamaca para pajaros");
		lblHamacaParaPajaros.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHamacaParaPajaros.setBounds(354, 209, 213, 23);
		getContentPane().add(lblHamacaParaPajaros);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(Productos2.class.getResource("/imagenes/pajaros/hamaca.jpg")));
		label_15.setBounds(345, 11, 239, 179);
		getContentPane().add(label_15);
		
		JLabel label_1 = new JLabel("Cant.");
		label_1.setBounds(138, 538, 46, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Cant.");
		label_2.setBounds(138, 264, 46, 14);
		getContentPane().add(label_2);
		
		JLabel label_5 = new JLabel("Cant.");
		label_5.setBounds(482, 261, 46, 14);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Cant.");
		label_6.setBounds(482, 534, 46, 14);
		getContentPane().add(label_6);
		
		txtCantidad5 = new JTextField();
		txtCantidad5.setBounds(170, 259, 86, 20);
		contentPane.add(txtCantidad5);
		txtCantidad5.setColumns(10);
		
		txtCantidad6 = new JTextField();
		txtCantidad6.setColumns(10);
		txtCantidad6.setBounds(518, 259, 86, 20);
		contentPane.add(txtCantidad6);
		
		txtCantidad7 = new JTextField();
		txtCantidad7.setColumns(10);
		txtCantidad7.setBounds(170, 532, 86, 20);
		contentPane.add(txtCantidad7);
		
		txtCantidad8 = new JTextField();
		txtCantidad8.setColumns(10);
		txtCantidad8.setBounds(518, 532, 86, 20);
		contentPane.add(txtCantidad8);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio.setBounds(75, 235, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio1.setColumns(10);
		txtPrecio1.setBounds(399, 235, 86, 20);
		contentPane.add(txtPrecio1);
		
		txtPrecio2 = new JTextField();
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio2.setColumns(10);
		txtPrecio2.setBounds(75, 508, 86, 20);
		contentPane.add(txtPrecio2);
		
		txtPrecio3 = new JTextField();
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio3.setColumns(10);
		txtPrecio3.setBounds(410, 508, 86, 20);
		contentPane.add(txtPrecio3);

		btnA1 = new JButton("A\u00F1adir al carrito");
		btnA1.addActionListener(this);
		btnA1.setForeground(Color.BLACK);
		btnA1.setBackground(Color.GREEN);
		btnA1.setBounds(10, 258, 127, 23);
		getContentPane().add(btnA1);
		
		btnA2 = new JButton("A\u00F1adir al carrito");
		btnA2.addActionListener(this);
		btnA2.setForeground(Color.BLACK);
		btnA2.setBackground(Color.GREEN);
		btnA2.setBounds(345, 258, 127, 23);
		getContentPane().add(btnA2);
		
		btnA3 = new JButton("A\u00F1adir al carrito");
		btnA3.addActionListener(this);
		btnA3.setForeground(Color.BLACK);
		btnA3.setBackground(Color.GREEN);
		btnA3.setBounds(10, 531, 127, 23);
		getContentPane().add(btnA3);
		
		btnA4 = new JButton("A\u00F1adir al carrito");
		btnA4.addActionListener(this);
		btnA4.setForeground(Color.BLACK);
		btnA4.setBackground(Color.GREEN);
		btnA4.setBounds(345, 531, 127, 23);
		getContentPane().add(btnA4);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(this);
		btnAnterior.setBounds(246, 462, 89, 23);
		getContentPane().add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(this);
		btnSiguiente.setBounds(243, 496, 89, 23);
		getContentPane().add(btnSiguiente);
		
		precio();
		setResizable(false);
		this.setLocationRelativeTo(null);
	}
	
	ArregloConfiguracion ac = new ArregloConfiguracion();
	Config c;
	ProductosPerros pr;
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnA1) {
			actionEventPerformedbtnA1(e);
		}
		if(e.getSource() == btnA2) {
			actionEventPerformedbtnA2(e);
		}
		if(e.getSource() == btnA3) {
			actionEventPerformedbtnA3(e);
		}
		if(e.getSource() == btnA4) {
			actionEventPerformedbtnA4(e);
		}
		if(e.getSource() == btnAnterior) {
			actionEventPerformedbtnAnterior(e);
		}
		if(e.getSource() == btnSiguiente) {
			actionEventPerformedbtnSiguiente(e);
		}
	}
	protected void actionEventPerformedbtnA1(ActionEvent arg0){
		if(txtCantidad5.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(7);
			cantPr5 = Integer.parseInt(txtCantidad5.getText().trim());
			if(cantPr5 < c.getCantPr()){
				valorpr5 = true;
				if(valorpr5 == true) {
					totalpr5 = c.getPrecioPr() * cantPr5;
					c.setCantPr(c.getCantPr() - cantPr5);
					ac.actualizarArchivo();
					pr.estado=9;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad5);
			}
			if(valorpr5 == false) {
				totalpr5 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCantidad5);
		}
		
	}
	protected void actionEventPerformedbtnA2(ActionEvent arg0) {
		if(txtCantidad6.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(27);
			cantPr6 = Integer.parseInt(txtCantidad6.getText().trim());
			if(cantPr6 < c.getCantPr()){
				valorpr6 = true;
				if(valorpr6 == true) {
					totalpr6 = c.getPrecioPr() * cantPr6;
					c.setCantPr(c.getCantPr() - cantPr6);
					ac.actualizarArchivo();
					pr.estado=9;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad6);
			}
			if(valorpr6 == false) {
				totalpr6 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCantidad6);
		}
		
	}
	protected void actionEventPerformedbtnA3(ActionEvent arg0) {
		if(txtCantidad7.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(0);
			cantPr7 = Integer.parseInt(txtCantidad7.getText().trim());
			if(cantPr7 < c.getCantPr()){
				valorpr7 = true;
				if(valorpr7 == true) {
					totalpr7 = c.getPrecioPr() * cantPr7;
					c.setCantPr(c.getCantPr() - cantPr7);
					ac.actualizarArchivo();
					pr.estado=9;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad7);
			}
			if(valorpr7 == false) {
				totalpr7 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtCantidad7);
		}
	}
	protected void actionEventPerformedbtnA4(ActionEvent arg0) {
		if(txtCantidad8.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(18);
			cantPr8 = Integer.parseInt(txtCantidad8.getText().trim());
			if(cantPr8 < c.getCantPr()){
				valorpr8 = true;
				if(valorpr8 == true) {
					totalpr8 = c.getPrecioPr() * cantPr8;
					c.setCantPr(c.getCantPr() - cantPr8);
					ac.actualizarArchivo();
					pr.estado=9;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad8);
			}
			if(valorpr8 == false) {
				totalpr8= 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtCantidad8);
		}
	}
	protected void actionEventPerformedbtnAnterior(ActionEvent arg0) {
		Productos pr = new Productos();
		pr.setVisible(true);
		dispose();
	}
	protected void actionEventPerformedbtnSiguiente(ActionEvent arg0) {
		Productos3 pr3 = new Productos3();
		pr3.setVisible(true);
		dispose();
	}
	void precio() {
		txtPrecio.setEditable(false);
		txtPrecio1.setEditable(false);
		txtPrecio2.setEditable(false);
		txtPrecio3.setEditable(false);
		
		c = ac.obtener(7);
		txtPrecio.setText("S/. "+c.getPrecioPr());
		
		c = ac.obtener(27);
		txtPrecio1.setText("S/. "+c.getPrecioPr());
	
		c = ac.obtener(0);
		txtPrecio2.setText("S/. "+c.getPrecioPr());
		
		c = ac.obtener(18);
		txtPrecio3.setText("S/. "+c.getPrecioPr());
	}

	void error(String s, JTextField txt) {
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s, "Informacion", 0);
	}
	
}
