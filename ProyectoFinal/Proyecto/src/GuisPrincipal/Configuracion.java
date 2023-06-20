package GuisPrincipal;

import Clases.Config;
import Arreglos.ArregloConfiguracion;

import java.awt.Cursor;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Configuracion extends JDialog implements ActionListener, KeyListener, MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTable tblConfiguracion;
	private JLabel lblNombre;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblPrecio;
	private JButton btnAceptar;
	private DefaultTableModel modelo;
	private JLabel lblId;
	private JTextField txtId;
	private JScrollPane scrollPane;
	private JLabel lblCantidad;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configuracion dialog = new Configuracion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configuracion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Configuracion.class.getResource("/iconos16/configuracion.png")));
		setTitle("Configuracion | Precios");
		this.setLocationRelativeTo(null);
		setBounds(100, 100, 750, 405);
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre del producto:");
		lblNombre.setBounds(10, 11, 129, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 30, 176, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setForeground(Color.BLUE);
		btnAdicionar.addActionListener(this);
		btnAdicionar.addMouseListener(this);
		btnAdicionar.setBounds(635, 11, 89, 23);
		getContentPane().add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setForeground(Color.CYAN);
		btnModificar.addActionListener(this);
		btnModificar.addMouseListener(this);
		btnModificar.setBounds(635, 45, 89, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.RED);
		btnEliminar.addActionListener(this);
		btnEliminar.addMouseListener(this);
		btnEliminar.setBounds(635, 79, 89, 23);
		getContentPane().add(btnEliminar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(0, 255, 0));
		btnAceptar.addActionListener(this);
		btnAceptar.addMouseListener(this);
		btnAceptar.setBounds(318, 29, 89, 23);
		getContentPane().add(btnAceptar);
		
		lblPrecio = new JLabel("Precio del producto:");
		lblPrecio.setBounds(10, 61, 142, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(10, 80, 176, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblId = new JLabel("Id");
		lblId.setBounds(207, 33, 46, 14);
		getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(230, 30, 46, 20);
		getContentPane().add(txtId);
		txtId.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(196, 83, 80, 14);
		getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(253, 80, 66, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 714, 238);
		getContentPane().add(scrollPane);
		
		tblConfiguracion = new JTable();
		scrollPane.setViewportView(tblConfiguracion);
		tblConfiguracion.setFillsViewportHeight(true);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Id");
		modelo.addColumn("Nombre");
		modelo.addColumn("Precio S/.");
		modelo.addColumn("Cantidad");
		
		tblConfiguracion.setModel(modelo);
		
		txtId.setEditable(false);
		
		
		habilitarEntradas(false);
		ajustarAnchoColumnas();
		listar();
		editarFila(); 
		this.setLocationRelativeTo(null);
	}
	
	ArregloConfiguracion ac = new ArregloConfiguracion();
	
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if(arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if(arg0.getSource() == btnModificar) {
			actionarPerformedBtnModificar(arg0);
		}
		if(arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		int id = leerId();
		String nombre = leerNombre();
		if(nombre.length() > 0) {
			if(txtPrecio.getText().matches("[0-9]{1,2}")) {
				int precio = leerPrecio();
					if(txtCantidad.getText().matches("[0-9]{1,3}") && leerCantidad() <= 500) {
						int cantidad = leerCantidad();
						if(btnAdicionar.isEnabled() == false) {
							Config nuevo = new Config(id, nombre, precio, cantidad);
							ac.adicionar(nuevo);
							btnAdicionar.setEnabled(true);
						}
						if(btnModificar.isEnabled() == false) {
							Config c = ac.buscar(id);
							c.setNombrePr(nombre);
							c.setPrecioPr(precio);
							c.setCantPr(cantidad);
							ac.actualizarArchivo();
							btnModificar.setEnabled(true);
						}
						listar();
						habilitarEntradas(false);
					}
					else {
						error("Ingresa la cantidad correctamente", txtCantidad);
					}
			}
			else {
				error("Ingresa el precio correctamente", txtId);
			}
		}
		else {
			error("Ingresa el nombre correctamente", txtNombre);
		}
		
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		btnAdicionar.setEnabled(false);
		btnModificar.setEnabled(true);
		btnAceptar.setEnabled(true);
		limpieza();
		habilitarEntradas(true);
		txtNombre.requestFocus();
	}
	protected void actionarPerformedBtnModificar(ActionEvent arg0) {
		btnAdicionar.setEnabled(true);
		btnModificar.setEnabled(false);
		if(ac.tamanio() == 0) {
			btnAceptar.setEnabled(false);
			habilitarEntradas(false);
			mensaje("No existen productos");
		}
		else {
			editarFila();
			btnAceptar.setEnabled(true);
			habilitarEntradas(true);
			txtNombre.requestFocus();
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		btnAdicionar.setEnabled(true);
		btnModificar.setEnabled(true);
		btnAceptar.setEnabled(false);
		if(ac.tamanio() == 0) {
			error("No existen productos", txtNombre);
		}
		else {
			editarFila();
			habilitarEntradas(false);
			int confir = confirmar("¿Desea eliminar el producto ?");
			if(confir == 0) {
				ac.eliminar(ac.buscar(leerId()));
				listar();
				editarFila();
			}
		}
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		arg0.consume();
		editarFila();
	}
	public void keyTyped(KeyEvent arg0) {
	}
	public void mouseClicked(MouseEvent arg0) {
		if(arg0.getSource() == tblConfiguracion) {
			mouseClickedTblConfiguracion(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
		if(arg0.getSource() == btnAceptar) {
			mouseEnteredBtnAceptar(arg0);
		}
		if(arg0.getSource() == btnAdicionar) {
			mouseEnteredBtnAdicionar(arg0);
		}
		if(arg0.getSource() == btnModificar) {
			mouseEnteredBtnModificar(arg0);
		}
		if(arg0.getSource() == btnEliminar) {
			mouseEnteredBtnEliminar(arg0);
		}
		if(arg0.getSource() == tblConfiguracion) {
			mouseEnteredTblConfiguracion(arg0);
		}
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedTblConfiguracion(MouseEvent arg0) {
		habilitarEntradas(false);
		habilitarBotones(true);
		editarFila();
	}
	protected void mouseEnteredTblConfiguracion(MouseEvent arg0) {
		tblConfiguracion.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnAceptar(MouseEvent arg0) {
		btnAceptar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnAdicionar(MouseEvent arg0) {
		btnAdicionar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnModificar(MouseEvent arg0) {
		btnModificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnEliminar(MouseEvent arg0) {
		btnEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	} 
	
	void ajustarAnchoColumnas() {
		TableColumnModel tcm = tblConfiguracion.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna(10));
		tcm.getColumn(1).setPreferredWidth(anchoColumna(40));
		tcm.getColumn(2).setPreferredWidth(anchoColumna(20));
		tcm.getColumn(3).setPreferredWidth(anchoColumna(20));
	}
	void listar() {
		int posFila =0;
		if(modelo.getRowCount() > 0) 
			posFila = tblConfiguracion.getSelectedRow();
		if(modelo.getRowCount() == ac.tamanio() -1) 
			posFila = ac.tamanio() -1;
		if(posFila == ac.tamanio()) 
			posFila --;
		modelo.setRowCount(0);
		Config c;
		for(int i=0; i< ac.tamanio(); i++) {
			c = ac.obtener(i);
			Object[] fila = { c.getIdPr(),
							 c.getNombrePr(),
							 "S/. " + c.getPrecioPr() + ".00",
							 c.getCantPr()};
			    modelo.addRow(fila);
		}
		if(ac.tamanio() > 0) {
			tblConfiguracion.getSelectionModel().setSelectionInterval(posFila, posFila);
		}
	}
	
	void editarFila() {
		if(ac.tamanio() ==0) {
			limpieza();
		}
		else {
			Config c = ac.obtener(tblConfiguracion.getSelectedRow());
			txtId.setText("" + c.getIdPr());
			txtNombre.setText(c.getNombrePr());
			txtPrecio.setText(""+c.getPrecioPr());
			txtCantidad.setText(""+c.getCantPr()); 
		}
	}
	
	void limpieza() {
		txtId.setText("" + ac.idCorrelativo()); 
		txtNombre.setText("");
		txtPrecio.setText("");
		txtCantidad.setText("");
	}
	
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s, "Informacion", 0);
	}
	void error(String s, JTextField txt) {
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	void habilitarEntradas(boolean sino) {
		btnAceptar.setEnabled(sino);
		txtNombre.setEditable(sino);
		txtPrecio.setEditable(sino);
		txtCantidad.setEditable(sino);
	}
	void habilitarBotones(boolean sino) {
		btnAdicionar.setEnabled(sino);
		btnModificar.setEnabled(sino);
	}
	int leerId() {
		return Integer.parseInt(txtId.getText().trim());
	}
	String leerNombre() {
		return txtNombre.getText().trim();
	}
	int leerPrecio() {
		return Integer.parseInt(txtPrecio.getText().trim());
	}
	int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText().trim());
	}
	int anchoColumna(int porcentaje) {
		return porcentaje * scrollPane.getWidth()/100;
	}
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta",0,1,null);
	}
}
