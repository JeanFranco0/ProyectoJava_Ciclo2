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

public class ProductosGatos extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCamaGatos;
	private JTextField txtCañaGatos;
	private JTextField txtPelotasGatos;
	private JTextField txtRatonesParaGatos;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	public static int estado=0;
	public static float totalprG1;
	public static float totalprG2;
	public static float totalprG3;
	public static float totalprG4;
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
					ProductosGatos frame = new ProductosGatos();
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
	public ProductosGatos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductosGatos.class.getResource("/iconos16/gatos.png")));
		setTitle("Productos para gatos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ProductosGatos.class.getResource("/imagenes/Gatos/camas para gatos.jpg")));
		label.setBounds(10, 11, 229, 202);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ProductosGatos.class.getResource("/imagenes/Gatos/ca\u00F1itas para gatos.jpg")));
		label_1.setBounds(378, 11, 241, 202);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ProductosGatos.class.getResource("/imagenes/Gatos/pelotas para gato.jpg")));
		label_2.setBounds(10, 295, 229, 202);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ProductosGatos.class.getResource("/imagenes/Gatos/raton de peluche.jpg")));
		label_3.setBounds(378, 295, 241, 202);
		contentPane.add(label_3);
		
		JLabel lblCamaParaGatos = new JLabel("Cama para gatos");
		lblCamaParaGatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCamaParaGatos.setBounds(15, 228, 170, 22);
		contentPane.add(lblCamaParaGatos);
		
		JLabel label_5 = new JLabel("Precio:");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBounds(155, 222, 52, 22);
		contentPane.add(label_5);
		
		txtCamaGatos = new JTextField();
		txtCamaGatos.setColumns(10);
		txtCamaGatos.setBounds(184, 263, 86, 20);
		contentPane.add(txtCamaGatos);
		
		JLabel label_7 = new JLabel("Cant.");
		label_7.setBounds(155, 265, 46, 14);
		contentPane.add(label_7);
		
		JLabel lblCuerdaParaGatos = new JLabel("Ca\u00F1a para gatos");
		lblCuerdaParaGatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCuerdaParaGatos.setBounds(364, 228, 170, 22);
		contentPane.add(lblCuerdaParaGatos);
		
		JLabel label_6 = new JLabel("Precio:");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_6.setBounds(504, 224, 52, 22);
		contentPane.add(label_6);
		
		txtCañaGatos = new JTextField();
		txtCañaGatos.setColumns(10);
		txtCañaGatos.setBounds(533, 263, 86, 20);
		contentPane.add(txtCañaGatos);
		
		JLabel label_9 = new JLabel("Cant.");
		label_9.setBounds(504, 265, 46, 14);
		contentPane.add(label_9);
		
		JLabel lblPelotasParaGatos = new JLabel("Pelotas para gatos");
		lblPelotasParaGatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPelotasParaGatos.setBounds(5, 529, 170, 22);
		contentPane.add(lblPelotasParaGatos);
		
		JLabel label_8 = new JLabel("Precio:");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBounds(145, 523, 52, 22);
		contentPane.add(label_8);
		
		txtPelotasGatos = new JTextField();
		txtPelotasGatos.setColumns(10);
		txtPelotasGatos.setBounds(174, 564, 86, 20);
		contentPane.add(txtPelotasGatos);
		
		JLabel label_11 = new JLabel("Cant.");
		label_11.setBounds(145, 566, 46, 14);
		contentPane.add(label_11);
		
		txtRatonesParaGatos = new JTextField();
		txtRatonesParaGatos.setColumns(10);
		txtRatonesParaGatos.setBounds(533, 563, 86, 20);
		contentPane.add(txtRatonesParaGatos);
		
		JLabel lblRatonesDePeluche = new JLabel("Ratones de peluche para gatos");
		lblRatonesDePeluche.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRatonesDePeluche.setBounds(364, 508, 223, 22);
		contentPane.add(lblRatonesDePeluche);
		
		JLabel label_12 = new JLabel("Cant.");
		label_12.setBounds(504, 565, 46, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Precio:");
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_13.setBounds(477, 530, 52, 22);
		contentPane.add(label_13);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio.setBounds(205, 224, 65, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio1.setColumns(10);
		txtPrecio1.setBounds(554, 224, 65, 20);
		contentPane.add(txtPrecio1);
		
		txtPrecio2 = new JTextField();
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio2.setColumns(10);
		txtPrecio2.setBounds(195, 525, 65, 20);
		contentPane.add(txtPrecio2);
		
		txtPrecio3 = new JTextField();
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio3.setColumns(10);
		txtPrecio3.setBounds(539, 532, 65, 20);
		contentPane.add(txtPrecio3);
		
		btnA1 = new JButton("A\u00F1adir al carrito");
		btnA1.addActionListener(this);
		btnA1.setBackground(Color.GREEN);
		btnA1.setBounds(10, 261, 135, 23);
		contentPane.add(btnA1);
		
		btnA2 = new JButton("A\u00F1adir al carrito");
		btnA2.addActionListener(this);
		btnA2.setBackground(Color.GREEN);
		btnA2.setBounds(359, 261, 135, 23);
		contentPane.add(btnA2);
		
		btnA3 = new JButton("A\u00F1adir al carrito");
		btnA3.addActionListener(this);
		btnA3.setBackground(Color.GREEN);
		btnA3.setBounds(0, 562, 135, 23);
		contentPane.add(btnA3);
		
		btnA4 = new JButton("A\u00F1adir al carrito");
		btnA4.addActionListener(this);
		btnA4.setBackground(Color.GREEN);
		btnA4.setBounds(359, 561, 135, 23);
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
		if(txtCamaGatos.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(4);
			cantPr1 = Integer.parseInt(txtCamaGatos.getText().trim());
			if(cantPr1 < c.getCantPr()){
				valorpr1 = true;
				if(valorpr1 == true) {
					totalprG1 = c.getPrecioPr() * cantPr1;
					c.setCantPr(c.getCantPr() - cantPr1);
					ac.actualizarArchivo();
					pr.estado=2;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCamaGatos);
			}
			if(valorpr1 == false) {
				totalprG1 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCamaGatos);
		}
		
	}
	protected void actionEventPerformedbtnA2(ActionEvent arg0) {
		if(txtCañaGatos.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(5);
			cantPr2 = Integer.parseInt(txtCañaGatos.getText().trim());
			if(cantPr2 < c.getCantPr()){
				valorpr2 = true;
				if(valorpr2 == true) {
					totalprG2 = c.getPrecioPr() * cantPr2;
					c.setCantPr(c.getCantPr() - cantPr2);
					ac.actualizarArchivo();
					pr.estado=2;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCañaGatos);
			}
			if(valorpr2 == false) {
				totalprG2 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCañaGatos);
		}
		
	}
	protected void actionEventPerformedbtnA3(ActionEvent arg0) {
		if(txtPelotasGatos.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(6);
			cantPr3 = Integer.parseInt(txtPelotasGatos.getText().trim());
			if(cantPr3 < c.getCantPr()){
				valorpr3 = true;
				if(valorpr3 == true) {
					totalprG3 = c.getPrecioPr() * cantPr3;
					c.setCantPr(c.getCantPr() - cantPr3);
					ac.actualizarArchivo();
					pr.estado=2;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtPelotasGatos);
			}
			if(valorpr3 == false) {
				totalprG3 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtPelotasGatos);
		}
	}
	protected void actionEventPerformedbtnA4(ActionEvent arg0) {
		if(txtRatonesParaGatos.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(7);
			cantPr4 = Integer.parseInt(txtRatonesParaGatos.getText().trim());
			if(cantPr4 < c.getCantPr()){
				valorpr4 = true;
				if(valorpr4 == true) {
					totalprG4 = c.getPrecioPr() * cantPr4;
					c.setCantPr(c.getCantPr() - cantPr4);
					ac.actualizarArchivo();
					pr.estado=2;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtRatonesParaGatos);
			}
			if(valorpr4 == false) {
				totalprG4 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtRatonesParaGatos);
		}
	}
	void precio() {
		txtPrecio.setEditable(false);
		txtPrecio1.setEditable(false);
		txtPrecio2.setEditable(false);
		txtPrecio3.setEditable(false);
		
		for(int i=4; i<8;i++) {
			c = ac.obtener(i);
			if(i==4) {
				txtPrecio.setText("S/. "+c.getPrecioPr());
			}
			if(i==5) {
				txtPrecio1.setText("S/. "+c.getPrecioPr());
			}
			if(i==6) {
				txtPrecio2.setText("S/. "+c.getPrecioPr());
			}
			if(i==7) {
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
