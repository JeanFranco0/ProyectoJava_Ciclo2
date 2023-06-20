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

public class Productos extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField txtCantidad;
	public static JTextField txtCantidad2;
	public static JTextField txtCantidad3;
	public static JTextField txtCantidad4;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	private JButton btnSiguiente;
	public static int estado=0;
	public static float totalpr1;
	public static float totalpr2;
	public static float totalpr3;
	public static float totalpr4;
	public static int cantPr1;
	public static int cantPr2;
	public static int cantPr3;
	public static int cantPr4;
	public static boolean valorpr1 = false;
	public static boolean valorpr2 = false;
	public static boolean valorpr3 = false;
	public static boolean valorpr4 = false;
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
					Productos frame = new Productos();
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
	public Productos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Productos.class.getResource("/iconos32/productos 32.png")));
		setTitle("Productos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Productos.class.getResource("/imagenes/conejos/balancin.jpg")));
		label.setBounds(10, 11, 235, 179);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Productos.class.getResource("/imagenes/Gatos/camas para gatos.jpg")));
		label_1.setBounds(345, 11, 239, 179);
		getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("Precio: ");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(10, 237, 67, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Balancin para conejos");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(20, 209, 213, 23);
		getContentPane().add(label_4);
		
		JLabel label_6 = new JLabel("Precio: ");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_6.setBounds(344, 237, 67, 14);
		getContentPane().add(label_6);
		
		JLabel lblCamaParaGatos = new JLabel("Cama para gatos");
		lblCamaParaGatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCamaParaGatos.setBounds(354, 209, 213, 23);
		getContentPane().add(lblCamaParaGatos);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Productos.class.getResource("/imagenes/peces/bola de musgo.jpg")));
		label_5.setBounds(10, 292, 235, 179);
		getContentPane().add(label_5);
		
		JLabel label_8 = new JLabel("Precio: ");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBounds(10, 510, 67, 14);
		getContentPane().add(label_8);
		
		JLabel lblBolaDeMusgo = new JLabel("Bola de musgo (Peces)");
		lblBolaDeMusgo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBolaDeMusgo.setBounds(20, 482, 213, 23);
		getContentPane().add(lblBolaDeMusgo);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(Productos.class.getResource("/imagenes/Perros/pelotas de tenis.jpg")));
		label_7.setBounds(345, 292, 239, 179);
		getContentPane().add(label_7);
		
		JLabel label_10 = new JLabel("Precio: ");
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(355, 510, 67, 14);
		getContentPane().add(label_10);
		
		JLabel lblPelotasDeTenis = new JLabel("Pelotas de tenis para perros");
		lblPelotasDeTenis.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPelotasDeTenis.setBounds(365, 482, 213, 23);
		getContentPane().add(lblPelotasDeTenis);
		
		JLabel lblCant = new JLabel("Cant.");
		lblCant.setBounds(144, 262, 46, 14);
		getContentPane().add(lblCant);
		
		JLabel label_9 = new JLabel("Cant.");
		label_9.setBounds(138, 541, 46, 14);
		getContentPane().add(label_9);
		
		JLabel label_11 = new JLabel("Cant.");
		label_11.setBounds(477, 261, 46, 14);
		getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Cant.");
		label_12.setBounds(477, 539, 46, 14);
		getContentPane().add(label_12);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(177, 259, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtCantidad2 = new JTextField();
		txtCantidad2.setColumns(10);
		txtCantidad2.setBounds(508, 259, 86, 20);
		contentPane.add(txtCantidad2);
		
		txtCantidad3 = new JTextField();
		txtCantidad3.setColumns(10);
		txtCantidad3.setBounds(177, 536, 86, 20);
		contentPane.add(txtCantidad3);
		
		txtCantidad4 = new JTextField();
		txtCantidad4.setColumns(10);
		txtCantidad4.setBounds(508, 536, 86, 20);
		contentPane.add(txtCantidad4);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio.setBounds(87, 235, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio1.setColumns(10);
		txtPrecio1.setBounds(403, 235, 86, 20);
		contentPane.add(txtPrecio1);
		
		txtPrecio2 = new JTextField();
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio2.setColumns(10);
		txtPrecio2.setBounds(70, 508, 86, 20);
		contentPane.add(txtPrecio2);
		
		txtPrecio3 = new JTextField();
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio3.setColumns(10);
		txtPrecio3.setBounds(403, 508, 86, 20);
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
		btnA3.setBounds(10, 535, 127, 23);
		getContentPane().add(btnA3);
		
		btnA4 = new JButton("A\u00F1adir al carrito");
		btnA4.addActionListener(this);
		btnA4.setForeground(Color.BLACK);
		btnA4.setBackground(Color.GREEN);
		btnA4.setBounds(345, 535, 127, 23);
		getContentPane().add(btnA4);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(this);
		btnSiguiente.setBounds(246, 508, 89, 23);
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
		if(e.getSource() == btnSiguiente) {
			actionEventPerformedbtnSiguiente(e);
		}
	}
	protected void actionEventPerformedbtnA1(ActionEvent arg0){
		if(txtCantidad.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(12);
			cantPr1 = Integer.parseInt(txtCantidad.getText().trim());
			if(cantPr1 < c.getCantPr()){
				valorpr1 = true;
				if(valorpr1 == true) {
					totalpr1 = c.getPrecioPr() * cantPr1;
					c.setCantPr(c.getCantPr() - cantPr1);
					ac.actualizarArchivo();
					pr.estado=8;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad);
			}
			if(valorpr1 == false) {
				totalpr1 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCantidad);
		}
		
	}
	protected void actionEventPerformedbtnA2(ActionEvent arg0) {
		if(txtCantidad2.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(4);
			cantPr2 = Integer.parseInt(txtCantidad2.getText().trim());
			if(cantPr2 < c.getCantPr()){
				valorpr2 = true;
				if(valorpr2 == true) {
					totalpr2 = c.getPrecioPr() * cantPr2;
					c.setCantPr(c.getCantPr() - cantPr2);
					ac.actualizarArchivo();
					pr.estado=8;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad2);
			}
			if(valorpr2 == false) {
				totalpr2 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCantidad2);
		}
		
	}
	protected void actionEventPerformedbtnA3(ActionEvent arg0) {
		if(txtCantidad3.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(8);
			cantPr3 = Integer.parseInt(txtCantidad3.getText().trim());
			if(cantPr3 < c.getCantPr()){
				valorpr3 = true;
				if(valorpr3 == true) {
					totalpr3 = c.getPrecioPr() * cantPr3;
					c.setCantPr(c.getCantPr() - cantPr3);
					ac.actualizarArchivo();
					pr.estado=8;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad3);
			}
			if(valorpr3 == false) {
				totalpr3 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtCantidad3);
		}
	}
	protected void actionEventPerformedbtnA4(ActionEvent arg0) {
		if(txtCantidad4.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(3);
			cantPr4 = Integer.parseInt(txtCantidad4.getText().trim());
			if(cantPr4 < c.getCantPr()){
				valorpr4 = true;
				if(valorpr4 == true) {
					totalpr4 = c.getPrecioPr() * cantPr4;
					c.setCantPr(c.getCantPr() - cantPr4);
					ac.actualizarArchivo();
					pr.estado=8;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCantidad4);
			}
			if(valorpr4 == false) {
				totalpr4= 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtCantidad4);
		}
	}
	protected void actionEventPerformedbtnSiguiente(ActionEvent arg0) {
		Productos2 pr2 = new Productos2();
		pr2.setVisible(true);
		dispose();
	}
	void precio() {
		txtPrecio.setEditable(false);
		txtPrecio1.setEditable(false);
		txtPrecio2.setEditable(false);
		txtPrecio3.setEditable(false);
		
		c = ac.obtener(12);
		txtPrecio.setText("S/. "+c.getPrecioPr());
		
		c = ac.obtener(4);
		txtPrecio1.setText("S/. "+c.getPrecioPr());
	
		c = ac.obtener(8);
		txtPrecio2.setText("S/. "+c.getPrecioPr());
		
		c = ac.obtener(3);
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
