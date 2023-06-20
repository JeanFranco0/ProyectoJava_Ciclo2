package ProductosAnimales;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloConfiguracion;
import Clases.Config;

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

public class ProductosPeces extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMusgoPeces;
	private JTextField txtPlantasPeces;
	private JTextField txtTroncoFlotantePeces;
	private JTextField txtTroncoHundidoPeces;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	public static int estado=0;
	public static float totalprPeces1;
	public static float totalprPeces2;
	public static float totalprPeces3;
	public static float totalprPeces4;
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
					ProductosPeces frame = new ProductosPeces();
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
	public ProductosPeces() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductosPeces.class.getResource("/iconos16/peces.png")));
		setTitle("Productos para peces");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 685, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ProductosPeces.class.getResource("/imagenes/peces/bola de musgo.jpg")));
		label.setBounds(10, 11, 250, 229);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ProductosPeces.class.getResource("/imagenes/peces/plantas de decoracion.jpg")));
		label_1.setBounds(402, 11, 250, 229);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ProductosPeces.class.getResource("/imagenes/peces/tronco flotante.jpg")));
		label_2.setBounds(10, 312, 250, 209);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ProductosPeces.class.getResource("/imagenes/peces/tronco hundido.jpg")));
		label_3.setBounds(402, 312, 250, 209);
		contentPane.add(label_3);
		
		txtMusgoPeces = new JTextField();
		txtMusgoPeces.setColumns(10);
		txtMusgoPeces.setBounds(184, 280, 86, 20);
		contentPane.add(txtMusgoPeces);
		
		JLabel lblBolaDeMusgo = new JLabel("Bola de musgo");
		lblBolaDeMusgo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBolaDeMusgo.setBounds(15, 245, 170, 22);
		contentPane.add(lblBolaDeMusgo);
		
		JLabel label_6 = new JLabel("Cant.");
		label_6.setBounds(155, 282, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Precio:");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(155, 247, 52, 22);
		contentPane.add(label_7);
		
		JLabel lblPlantasDeDecoracion = new JLabel("Plantas de decoracion");
		lblPlantasDeDecoracion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlantasDeDecoracion.setBounds(370, 251, 170, 22);
		contentPane.add(lblPlantasDeDecoracion);
		
		JLabel label_8 = new JLabel("Precio:");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBounds(532, 253, 52, 22);
		contentPane.add(label_8);
		
		txtPlantasPeces = new JTextField();
		txtPlantasPeces.setColumns(10);
		txtPlantasPeces.setBounds(561, 286, 86, 20);
		contentPane.add(txtPlantasPeces);
		
		JLabel label_9 = new JLabel("Cant.");
		label_9.setBounds(532, 288, 46, 14);
		contentPane.add(label_9);
		
		JLabel lblTroncoFlotante = new JLabel("Tronco flotante");
		lblTroncoFlotante.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTroncoFlotante.setBounds(15, 532, 170, 22);
		contentPane.add(lblTroncoFlotante);
		
		JLabel label_10 = new JLabel("Precio:");
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(155, 534, 52, 22);
		contentPane.add(label_10);
		
		txtTroncoFlotantePeces = new JTextField();
		txtTroncoFlotantePeces.setColumns(10);
		txtTroncoFlotantePeces.setBounds(184, 567, 86, 20);
		contentPane.add(txtTroncoFlotantePeces);
		
		JLabel label_11 = new JLabel("Cant.");
		label_11.setBounds(155, 569, 46, 14);
		contentPane.add(label_11);
		
		JLabel lblTroncoHundido = new JLabel("Tronco hundido");
		lblTroncoHundido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTroncoHundido.setBounds(375, 531, 170, 22);
		contentPane.add(lblTroncoHundido);
		
		JLabel label_12 = new JLabel("Precio:");
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_12.setBounds(515, 533, 52, 22);
		contentPane.add(label_12);
		
		txtTroncoHundidoPeces = new JTextField();
		txtTroncoHundidoPeces.setColumns(10);
		txtTroncoHundidoPeces.setBounds(544, 566, 86, 20);
		contentPane.add(txtTroncoHundidoPeces);
		
		JLabel label_13 = new JLabel("Cant.");
		label_13.setBounds(515, 568, 46, 14);
		contentPane.add(label_13);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio.setBounds(205, 249, 65, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio1.setColumns(10);
		txtPrecio1.setBounds(587, 254, 65, 20);
		contentPane.add(txtPrecio1);
		
		txtPrecio2 = new JTextField();
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio2.setColumns(10);
		txtPrecio2.setBounds(205, 535, 65, 20);
		contentPane.add(txtPrecio2);
		
		txtPrecio3 = new JTextField();
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio3.setColumns(10);
		txtPrecio3.setBounds(582, 535, 65, 20);
		contentPane.add(txtPrecio3);
		
		btnA1 = new JButton("A\u00F1adir al carrito");
		btnA1.addActionListener(this);
		btnA1.setBackground(Color.GREEN);
		btnA1.setBounds(10, 278, 135, 23);
		contentPane.add(btnA1);
		
		btnA2 = new JButton("A\u00F1adir al carrito");
		btnA2.addActionListener(this);
		btnA2.setBackground(Color.GREEN);
		btnA2.setBounds(387, 284, 135, 23);
		contentPane.add(btnA2);
		
		btnA3 = new JButton("A\u00F1adir al carrito");
		btnA3.addActionListener(this);
		btnA3.setBackground(Color.GREEN);
		btnA3.setBounds(10, 565, 135, 23);
		contentPane.add(btnA3);
		
		btnA4 = new JButton("A\u00F1adir al carrito");
		btnA4.addActionListener(this);
		btnA4.setBackground(Color.GREEN);
		btnA4.setBounds(370, 564, 135, 23);
		contentPane.add(btnA4);
		
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
	}
	protected void actionEventPerformedbtnA1(ActionEvent arg0){
		if(txtMusgoPeces.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(8);
			cantPr1 = Integer.parseInt(txtMusgoPeces.getText().trim());
			if(cantPr1 < c.getCantPr()){
				valorpr1 = true;
				if(valorpr1 == true) {
					totalprPeces1 = c.getPrecioPr() * cantPr1;
					c.setCantPr(c.getCantPr() - cantPr1);
					ac.actualizarArchivo();
					pr.estado=3;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtMusgoPeces);
			}
			if(valorpr1 == false) {
				totalprPeces1 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtMusgoPeces);
		}
		
	}
	protected void actionEventPerformedbtnA2(ActionEvent arg0) {
		if(txtPlantasPeces.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(9);
			cantPr2 = Integer.parseInt(txtPlantasPeces.getText().trim());
			if(cantPr2 < c.getCantPr()){
				valorpr2 = true;
				if(valorpr2 == true) {
					totalprPeces2 = c.getPrecioPr() * cantPr2;
					c.setCantPr(c.getCantPr() - cantPr2);
					ac.actualizarArchivo();
					pr.estado=3;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtPlantasPeces);
			}
			if(valorpr2 == false) {
				totalprPeces2 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtPlantasPeces);
		}
		
	}
	protected void actionEventPerformedbtnA3(ActionEvent arg0) {
		if(txtTroncoFlotantePeces.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(10);
			cantPr3 = Integer.parseInt(txtTroncoFlotantePeces.getText().trim());
			if(cantPr3 < c.getCantPr()){
				valorpr3 = true;
				if(valorpr3 == true) {
					totalprPeces3 = c.getPrecioPr() * cantPr3;
					c.setCantPr(c.getCantPr() - cantPr3);
					ac.actualizarArchivo();
					pr.estado=3;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtTroncoFlotantePeces);
			}
			if(valorpr3 == false) {
				totalprPeces3 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtTroncoFlotantePeces);
		}
	}
	protected void actionEventPerformedbtnA4(ActionEvent arg0) {
		if(txtTroncoHundidoPeces.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(11);
			cantPr4 = Integer.parseInt(txtTroncoHundidoPeces.getText().trim());
			if(cantPr4 < c.getCantPr()){
				valorpr4 = true;
				if(valorpr4 == true) {
					totalprPeces4 = c.getPrecioPr() * cantPr4;
					c.setCantPr(c.getCantPr() - cantPr4);
					ac.actualizarArchivo();
					pr.estado=2;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtTroncoHundidoPeces);
			}
			if(valorpr4 == false) {
				totalprPeces4 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtTroncoHundidoPeces);
		}
	}
	void precio() {
		txtPrecio.setEditable(false);
		txtPrecio1.setEditable(false);
		txtPrecio2.setEditable(false);
		txtPrecio3.setEditable(false);
		
		for(int i=8; i<12;i++) {
			c = ac.obtener(i);
			if(i==8) {
				txtPrecio.setText("S/. "+c.getPrecioPr());
			}
			if(i==9) {
				txtPrecio1.setText("S/. "+c.getPrecioPr());
			}
			if(i==10) {
				txtPrecio2.setText("S/. "+c.getPrecioPr());
			}
			if(i==11) {
				txtPrecio3.setText("S/. "+c.getPrecioPr());
			}	
		}
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
