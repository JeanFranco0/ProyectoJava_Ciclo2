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

public class ProductosPerros extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCamaPerro;
	private JTextField txtCuerdaPerro;
	private JTextField txtDiscosPerro;
	private JTextField txtPelotasTenisPerro;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	public static int estado=0;
	public static float totalprPerro1;
	public static float totalprPerro2;
	public static float totalprPerro3;
	public static float totalprPerro4;
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
					ProductosPerros frame = new ProductosPerros();
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
	
	
	public ProductosPerros() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductosPerros.class.getResource("/iconos16/perros.png")));
		setTitle("Productos para perros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ProductosPerros.class.getResource("/imagenes/Perros/camas.jpg")));
		label.setBounds(10, 11, 234, 188);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ProductosPerros.class.getResource("/imagenes/Perros/cuerda de juguete.jpg")));
		label_1.setBounds(368, 11, 245, 188);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ProductosPerros.class.getResource("/imagenes/Perros/discos voladores.jpg")));
		label_2.setBounds(10, 269, 234, 233);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ProductosPerros.class.getResource("/imagenes/Perros/pelotas de tenis.jpg")));
		label_3.setBounds(368, 269, 245, 233);
		contentPane.add(label_3);
		
		JLabel lblCa = new JLabel("Cama para perro");
		lblCa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCa.setBounds(10, 203, 170, 22);
		contentPane.add(lblCa);
		
		JLabel lblCant = new JLabel("Cant.");
		lblCant.setBounds(155, 244, 46, 14);
		contentPane.add(lblCant);
		
		txtCamaPerro = new JTextField();
		txtCamaPerro.setBounds(184, 238, 86, 20);
		contentPane.add(txtCamaPerro);
		txtCamaPerro.setColumns(10);
		
		JLabel label_5 = new JLabel("Cant.");
		label_5.setBounds(499, 247, 46, 14);
		contentPane.add(label_5);
		
		txtCuerdaPerro = new JTextField();
		txtCuerdaPerro.setColumns(10);
		txtCuerdaPerro.setBounds(528, 245, 86, 20);
		contentPane.add(txtCuerdaPerro);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setForeground(Color.RED);
		lblPrecio.setBounds(137, 214, 52, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblCuerdaDeJuguete = new JLabel("Cuerda de juguete ");
		lblCuerdaDeJuguete.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCuerdaDeJuguete.setBounds(359, 210, 170, 22);
		contentPane.add(lblCuerdaDeJuguete);
		
		JLabel lblPrecio_1 = new JLabel("Precio:");
		lblPrecio_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio_1.setForeground(Color.RED);
		lblPrecio_1.setBounds(499, 214, 52, 22);
		contentPane.add(lblPrecio_1);
		
		JLabel label_7 = new JLabel("Precio:");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(155, 528, 52, 22);
		contentPane.add(label_7);
		
		JLabel lblDiscosVoladores = new JLabel("Discos voladores");
		lblDiscosVoladores.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiscosVoladores.setBounds(10, 526, 130, 22);
		contentPane.add(lblDiscosVoladores);
		
		txtDiscosPerro = new JTextField();
		txtDiscosPerro.setColumns(10);
		txtDiscosPerro.setBounds(184, 564, 86, 20);
		contentPane.add(txtDiscosPerro);
		
		JLabel label_10 = new JLabel("Cant.");
		label_10.setBounds(155, 567, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_4 = new JLabel("Precio:");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(493, 528, 52, 22);
		contentPane.add(label_4);
		
		txtPelotasTenisPerro = new JTextField();
		txtPelotasTenisPerro.setColumns(10);
		txtPelotasTenisPerro.setBounds(528, 563, 86, 20);
		contentPane.add(txtPelotasTenisPerro);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(190, 210, 69, 20);
		contentPane.add(txtPrecio);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio1.setColumns(10);
		txtPrecio1.setBounds(550, 214, 69, 20);
		contentPane.add(txtPrecio1);
		
		txtPrecio2 = new JTextField();
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio2.setColumns(10);
		txtPrecio2.setBounds(204, 530, 69, 20);
		contentPane.add(txtPrecio2);
		
		txtPrecio3 = new JTextField();
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio3.setColumns(10);
		txtPrecio3.setBounds(544, 530, 69, 20);
		contentPane.add(txtPrecio3);
		
		JLabel label_9 = new JLabel("Cant.");
		label_9.setBounds(499, 567, 46, 14);
		contentPane.add(label_9);

		JLabel lblPelotasDeTenis = new JLabel("Pelotas de tenis");
		lblPelotasDeTenis.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPelotasDeTenis.setBounds(354, 525, 130, 22);
		contentPane.add(lblPelotasDeTenis);
		
		btnA1 = new JButton("A\u00F1adir al carrito");
		btnA1.addActionListener(this);
		btnA1.setBackground(Color.GREEN);
		btnA1.setBounds(10, 236, 135, 23);
		contentPane.add(btnA1);
		
		btnA2 = new JButton("A\u00F1adir al carrito");
		btnA2.addActionListener(this);
		btnA2.setBackground(Color.GREEN);
		btnA2.setBounds(354, 243, 135, 23);
		contentPane.add(btnA2);
		
		btnA3 = new JButton("A\u00F1adir al carrito");
		btnA3.addActionListener(this);
		btnA3.setBackground(Color.GREEN);
		btnA3.setBounds(10, 562, 135, 23);
		contentPane.add(btnA3);
		
		btnA4 = new JButton("A\u00F1adir al carrito");
		btnA4.addActionListener(this);
		btnA4.setBackground(Color.GREEN);
		btnA4.setBounds(354, 561, 135, 23);
		contentPane.add(btnA4);
		
		precio();
		setResizable(false);
		this.setLocationRelativeTo(null);
		
	}
	ArregloConfiguracion ac = new ArregloConfiguracion();
	Config c;
	
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
		if(txtCamaPerro.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(0);
			cantPr1 = Integer.parseInt(txtCamaPerro.getText().trim());
			if(cantPr1 < c.getCantPr()){
				valorpr1 = true;
				if(valorpr1 == true) {
					totalprPerro1 = c.getPrecioPr() * cantPr1;
					c.setCantPr(c.getCantPr() - cantPr1);
					ac.actualizarArchivo();
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCamaPerro);
			}
			if(valorpr1 == false) {
				totalprPerro1 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCamaPerro);
		}
		
	}
	protected void actionEventPerformedbtnA2(ActionEvent arg0) {
		if(txtCuerdaPerro.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(1);
			cantPr2 = Integer.parseInt(txtCuerdaPerro.getText().trim());
			if(cantPr2 < c.getCantPr()){
				valorpr2 = true;
				if(valorpr2 == true) {
					totalprPerro2 = c.getPrecioPr() * cantPr2;
					c.setCantPr(c.getCantPr() - cantPr2);
					ac.actualizarArchivo();
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCuerdaPerro);
			}
			if(valorpr2 == false) {
				totalprPerro2 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCuerdaPerro);
		}
		
	}
	protected void actionEventPerformedbtnA3(ActionEvent arg0) {
		if(txtDiscosPerro.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(2);
			cantPr3 = Integer.parseInt(txtDiscosPerro.getText().trim());
			if(cantPr3 < c.getCantPr()){
				valorpr3 = true;
				if(valorpr3 == true) {
					totalprPerro3 = c.getPrecioPr() * cantPr3;
					c.setCantPr(c.getCantPr() - cantPr3);
					ac.actualizarArchivo();
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtDiscosPerro);
			}
			if(valorpr3 == false) {
				totalprPerro3 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtDiscosPerro);
		}
	}
	protected void actionEventPerformedbtnA4(ActionEvent arg0) {
		if(txtPelotasTenisPerro.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(3);
			cantPr4 = Integer.parseInt(txtPelotasTenisPerro.getText().trim());
			if(cantPr4 < c.getCantPr()){
				valorpr4 = true;
				if(valorpr4 == true) {
					totalprPerro4 = c.getPrecioPr() * cantPr4;
					c.setCantPr(c.getCantPr() - cantPr4);
					ac.actualizarArchivo();
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtPelotasTenisPerro);
			}
			if(valorpr4 == false) {
				totalprPerro4 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtPelotasTenisPerro);
		}
	}
	void precio() {
		txtPrecio.setEditable(false);
		txtPrecio1.setEditable(false);
		txtPrecio2.setEditable(false);
		txtPrecio3.setEditable(false);
		
		for(int i=0; i<4;i++) {
			c = ac.obtener(i);
			if(i==0) {
				txtPrecio.setText("S/. "+c.getPrecioPr());
			}
			if(i==1) {
				txtPrecio1.setText("S/. "+c.getPrecioPr());
			}
			if(i==2) {
				txtPrecio2.setText("S/. "+c.getPrecioPr());
			}
			if(i==3) {
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
