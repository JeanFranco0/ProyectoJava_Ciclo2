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

public class ProductosRoedores extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBolaEjercicioRoedores;
	private JTextField txtCajasArenaRoedores;
	private JTextField txtRuedaRoedores;
	private JTextField txtTunelesRoedores;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	public static int estado=0;
	public static float totalprRoedores1;
	public static float totalprRoedores2;
	public static float totalprRoedores3;
	public static float totalprRoedores4;
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
					ProductosRoedores frame = new ProductosRoedores();
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
	public ProductosRoedores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductosRoedores.class.getResource("/iconos16/roedores.png")));
		setTitle("Productos para roedores");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 688, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ProductosRoedores.class.getResource("/imagenes/hamster/bola de ejercicio.jpg")));
		label.setBounds(10, 11, 250, 217);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ProductosRoedores.class.getResource("/imagenes/hamster/cajas de arena.jpg")));
		label_1.setBounds(411, 11, 250, 217);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(ProductosRoedores.class.getResource("/imagenes/hamster/rueda.jpg")));
		label_2.setBounds(10, 310, 250, 217);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ProductosRoedores.class.getResource("/imagenes/hamster/tuneles.jpg")));
		label_3.setBounds(411, 310, 250, 217);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("Precio:");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBounds(155, 241, 52, 22);
		contentPane.add(label_5);
		
		txtBolaEjercicioRoedores = new JTextField();
		txtBolaEjercicioRoedores.setColumns(10);
		txtBolaEjercicioRoedores.setBounds(184, 274, 86, 20);
		contentPane.add(txtBolaEjercicioRoedores);
		
		JLabel label_6 = new JLabel("Cant.");
		label_6.setBounds(155, 276, 46, 14);
		contentPane.add(label_6);
		
		JLabel lblBolaDeEjercicio = new JLabel("Bola de ejercicio");
		lblBolaDeEjercicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBolaDeEjercicio.setBounds(15, 239, 170, 22);
		contentPane.add(lblBolaDeEjercicio);
		
		JLabel label_7 = new JLabel("Precio:");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(533, 241, 52, 22);
		contentPane.add(label_7);
		
		txtCajasArenaRoedores = new JTextField();
		txtCajasArenaRoedores.setColumns(10);
		txtCajasArenaRoedores.setBounds(562, 274, 86, 20);
		contentPane.add(txtCajasArenaRoedores);
		
		JLabel label_8 = new JLabel("Cant.");
		label_8.setBounds(533, 276, 46, 14);
		contentPane.add(label_8);
		
		JLabel lblCajasDeArena = new JLabel("Cajas de arena");
		lblCajasDeArena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCajasDeArena.setBounds(393, 239, 170, 22);
		contentPane.add(lblCajasDeArena);
		
		JLabel label_9 = new JLabel("Precio:");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_9.setBounds(155, 547, 52, 22);
		contentPane.add(label_9);
		
		txtRuedaRoedores = new JTextField();
		txtRuedaRoedores.setColumns(10);
		txtRuedaRoedores.setBounds(184, 580, 86, 20);
		contentPane.add(txtRuedaRoedores);
		
		JLabel label_10 = new JLabel("Cant.");
		label_10.setBounds(155, 582, 46, 14);
		contentPane.add(label_10);
		
		JLabel lblRuedaParaHamster = new JLabel("Rueda para hamster");
		lblRuedaParaHamster.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRuedaParaHamster.setBounds(10, 538, 170, 22);
		contentPane.add(lblRuedaParaHamster);
		
		JLabel label_11 = new JLabel("Precio:");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds(533, 547, 52, 22);
		contentPane.add(label_11);
		
		txtTunelesRoedores = new JTextField();
		txtTunelesRoedores.setColumns(10);
		txtTunelesRoedores.setBounds(562, 580, 86, 20);
		contentPane.add(txtTunelesRoedores);
		
		JLabel label_12 = new JLabel("Cant.");
		label_12.setBounds(533, 582, 46, 14);
		contentPane.add(label_12);
		
		JLabel lblTunelesParaHamster = new JLabel("Tuneles para hamster");
		lblTunelesParaHamster.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTunelesParaHamster.setBounds(370, 528, 170, 22);
		contentPane.add(lblTunelesParaHamster);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio.setBounds(206, 243, 68, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtPrecio1 = new JTextField();
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio1.setColumns(10);
		txtPrecio1.setBounds(595, 243, 68, 20);
		contentPane.add(txtPrecio1);
		
		txtPrecio2 = new JTextField();
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio2.setColumns(10);
		txtPrecio2.setBounds(206, 549, 68, 20);
		contentPane.add(txtPrecio2);
		
		txtPrecio3 = new JTextField();
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio3.setColumns(10);
		txtPrecio3.setBounds(593, 549, 68, 20);
		contentPane.add(txtPrecio3);
		
		btnA1 = new JButton("A\u00F1adir al carrito");
		btnA1.addActionListener(this);
		btnA1.setBackground(Color.GREEN);
		btnA1.setBounds(10, 272, 135, 23);
		contentPane.add(btnA1);
		
		btnA2 = new JButton("A\u00F1adir al carrito");
		btnA2.addActionListener(this);
		btnA2.setBackground(Color.GREEN);
		btnA2.setBounds(388, 272, 135, 23);
		contentPane.add(btnA2);
		
		btnA3 = new JButton("A\u00F1adir al carrito");
		btnA3.addActionListener(this);
		btnA3.setBackground(Color.GREEN);
		btnA3.setBounds(10, 578, 135, 23);
		contentPane.add(btnA3);
		
		btnA4 = new JButton("A\u00F1adir al carrito");
		btnA4.addActionListener(this);
		btnA4.setBackground(Color.GREEN);
		btnA4.setBounds(388, 578, 135, 23);
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
		if(txtBolaEjercicioRoedores.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(16);
			cantPr1 = Integer.parseInt(txtBolaEjercicioRoedores.getText().trim());
			if(cantPr1 < c.getCantPr()){
				valorpr1 = true;
				if(valorpr1 == true) {
					totalprRoedores1 = c.getPrecioPr() * cantPr1;
					c.setCantPr(c.getCantPr() - cantPr1);
					ac.actualizarArchivo();
					pr.estado=5;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtBolaEjercicioRoedores);
			}
			if(valorpr1 == false) {
				totalprRoedores1 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtBolaEjercicioRoedores);
		}
		
	}
	protected void actionEventPerformedbtnA2(ActionEvent arg0) {
		if(txtCajasArenaRoedores.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(17);
			cantPr2 = Integer.parseInt(txtCajasArenaRoedores.getText().trim());
			if(cantPr2 < c.getCantPr()){
				valorpr2 = true;
				if(valorpr2 == true) {
					totalprRoedores2 = c.getPrecioPr() * cantPr2;
					c.setCantPr(c.getCantPr() - cantPr2);
					ac.actualizarArchivo();
					pr.estado=5;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtCajasArenaRoedores);
			}
			if(valorpr2 == false) {
				totalprRoedores2 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamente", txtCajasArenaRoedores);
		}
		
	}
	protected void actionEventPerformedbtnA3(ActionEvent arg0) {
		if(txtRuedaRoedores.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(18);
			cantPr3 = Integer.parseInt(txtRuedaRoedores.getText().trim());
			if(cantPr3 < c.getCantPr()){
				valorpr3 = true;
				if(valorpr3 == true) {
					totalprRoedores3 = c.getPrecioPr() * cantPr3;
					c.setCantPr(c.getCantPr() - cantPr3);
					ac.actualizarArchivo();
					pr.estado=5;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtRuedaRoedores);
			}
			if(valorpr3 == false) {
				totalprRoedores3 = 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtRuedaRoedores);
		}
	}
	protected void actionEventPerformedbtnA4(ActionEvent arg0) {
		if(txtTunelesRoedores.getText().matches("[0-9]{1,3}")) {
			c = ac.obtener(19);
			cantPr4 = Integer.parseInt(txtTunelesRoedores.getText().trim());
			if(cantPr4 < c.getCantPr()){
				valorpr4 = true;
				if(valorpr4 == true) {
					totalprRoedores4 = c.getPrecioPr() * cantPr4;
					c.setCantPr(c.getCantPr() - cantPr4);
					ac.actualizarArchivo();
					pr.estado=5;
					estado=1;
				}
			}
			else {
				error("No hay tantos productos en stock", txtTunelesRoedores);
			}
			if(valorpr4 == false) {
				totalprRoedores4= 0;
			}
		}
		else {
			error("Ingresa la cantidad correctamentes", txtTunelesRoedores);
		}
	}
	void precio() {
		txtPrecio.setEditable(false);
		txtPrecio1.setEditable(false);
		txtPrecio2.setEditable(false);
		txtPrecio3.setEditable(false);
		
		for(int i=16; i<20;i++) {
			c = ac.obtener(i);
			if(i==16) {
				txtPrecio.setText("S/. "+c.getPrecioPr());
			}
			if(i==17) {
				txtPrecio1.setText("S/. "+c.getPrecioPr());
			}
			if(i==18) {
				txtPrecio2.setText("S/. "+c.getPrecioPr());
			}
			if(i==19) {
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
