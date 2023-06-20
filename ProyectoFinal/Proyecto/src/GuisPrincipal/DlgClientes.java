package GuisPrincipal;

import Clases.Cliente;
import Arreglos.ArregloClientes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

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

public class DlgClientes extends JDialog implements ActionListener, KeyListener, MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCodigo;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtDni;
	private JTextField txtContraseña;
	private JScrollPane scrollPane;
	private JTable tblClientes;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnAceptar;
	private DefaultTableModel modelo;
	private JLabel lblContraseña;
	private JLabel lblDni;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JLabel lblApellidos;
	private JLabel lblNombres;
	private JLabel lblCodigo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgClientes dialog = new DlgClientes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgClientes() {
		setTitle("Clientes");
		setResizable(false);
		setBounds(100, 100, 897, 581);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 16, 46, 14);
		getContentPane().add(lblCodigo);
		
		lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 44, 71, 14);
		getContentPane().add(lblNombres);
		
		 lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 75, 71, 14);
		getContentPane().add(lblApellidos);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(10, 106, 100, 14);
		getContentPane().add(lblCorreo);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 137, 71, 14);
		getContentPane().add(lblTelefono);
		
		lblDni = new JLabel("Dni");
		lblDni.setBounds(286, 109, 46, 14);
		getContentPane().add(lblDni);
		
		lblContraseña = new JLabel("Contraseña");
		lblContraseña.setBounds(218, 137, 89, 14);
		getContentPane().add(lblContraseña);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(85, 13, 71, 20);
		getContentPane().add(txtCodigo);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(83, 41, 186, 20);
		getContentPane().add(txtNombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(83, 72, 183, 20);
		getContentPane().add(txtApellidos);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(83, 106, 186, 20);
		getContentPane().add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(83, 134, 111, 20);
		getContentPane().add(txtTelefono);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(324, 106, 111, 20);
		getContentPane().add(txtDni);

		txtContraseña = new JTextField();
		txtContraseña.setBounds(286, 134, 149, 20);
		getContentPane().add(txtContraseña);
		txtContraseña.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.addMouseListener(this);
		btnAceptar.setForeground(Color.GREEN);
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAceptar.setEnabled(false);
		btnAceptar.setBounds(261, 10, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.addMouseListener(this);
		btnAdicionar.setForeground(Color.BLUE);
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdicionar.setBounds(694, 10, 165, 23);
		getContentPane().add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.addMouseListener(this);
		btnModificar.setForeground(Color.CYAN);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnModificar.setBounds(694, 45, 165, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.addMouseListener(this);
		btnEliminar.setForeground(Color.RED);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEliminar.setBounds(694, 79, 165, 23);
		getContentPane().add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 861, 366);
		getContentPane().add(scrollPane);
		
		tblClientes = new JTable();
		tblClientes.addKeyListener(this);
		tblClientes.addMouseListener(this);
		tblClientes.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblClientes);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombres");
		modelo.addColumn("Apellidos");
		modelo.addColumn("Correo:");
		modelo.addColumn("Telefono");
		modelo.addColumn("Dni");
		
		tblClientes.setModel(modelo);
		
		txtCodigo.setEditable(false);
		
		
		habilitarEntradas(false);
		ajustarAnchoColumnas();
		listar();
		editarFila();
	}

	ArregloClientes ac = new ArregloClientes();
	

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
		int codigoCliente = leerCodigo();
		String nombres = leerNombre();
		if(nombres.length() > 0) {
			String apellidos = leerApellidos();
			if(apellidos.length() >0) {
				String correo = leerCorreo();
				if(correo.length() > 0) {
					String telefono = leerTelefono();
					if(telefono.length() > 0) {
						String dni = leerDni();
						if(dni.length() > 0) {
							String contraseña = leerContraseña();
							if(contraseña.length() > 0) {
								if(btnAdicionar.isEnabled() == false) {
									Cliente nuevo = new Cliente(codigoCliente, nombres, apellidos, correo, telefono, dni, contraseña);
									ac.adicionar(nuevo);
									btnAdicionar.setEnabled(true);
								}
								if(btnModificar.isEnabled() == false) {
									Cliente c = ac.buscar(codigoCliente);
									c.setnombres(nombres);
									c.setApellidos(apellidos);
									c.setCorreo(correo);
									c.setTelefono(telefono);
									c.setDni(dni);
									ac.actualizarArchivo();
									btnModificar.setEnabled(true);
								}
								listar();
								habilitarEntradas(false);
							}
							else {
								error("Ingresa la contraseña correctamente", txtContraseña);
							}
						}
						else {
							error("Ingresa el dni correctamente", txtDni);
						}
					}
					else {
						error("Ingresa el telefono correctamente", txtTelefono);
					}
				}
				else {
					error("Ingresa el correo correctamente", txtCorreo);
				}
			}
			else {
				error("Ingresa los apellidos correctamente", txtApellidos);
			}
		}
		else {
			error("Ingresa el nombre correctamente", txtNombres);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		btnAdicionar.setEnabled(false);
		btnModificar.setEnabled(true);
		btnAceptar.setEnabled(true);
		limpieza();
		habilitarEntradas(true);
		txtNombres.requestFocus();
	}
	protected void actionarPerformedBtnModificar(ActionEvent arg0) {
		btnAdicionar.setEnabled(true);
		btnModificar.setEnabled(false);
		if(ac.tamanio() == 0) {
			btnAceptar.setEnabled(false);
			habilitarEntradas(false);
			mensaje("No existen clientes");
		}
		else {
			editarFila();
			btnAceptar.setEnabled(true);
			habilitarEntradas(true);
			txtNombres.requestFocus();
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		btnAdicionar.setEnabled(true);
		btnModificar.setEnabled(true);
		btnAceptar.setEnabled(false);
		if(ac.tamanio() == 0) {
			error("No existen clientes", txtNombres);
		}
		else {
			editarFila();
			habilitarEntradas(false);
			int confir = confirmar("¿Desea eliminar el registro ?");
			if(confir == 0) {
				ac.eliminar(ac.buscar(leerCodigo()));
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
		if(arg0.getSource() == tblClientes) {
			mouseClickedTblClientes(arg0);
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
		if(arg0.getSource() == tblClientes) {
			mouseEnteredTblClientes(arg0);
		}
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedTblClientes(MouseEvent arg0) {
		habilitarEntradas(false);
		habilitarBotones(true);
		editarFila();
	}
	protected void mouseEnteredTblClientes(MouseEvent arg0) {
		tblClientes.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
		TableColumnModel tcm = tblClientes.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna(10));
		tcm.getColumn(1).setPreferredWidth(anchoColumna(30));
		tcm.getColumn(2).setPreferredWidth(anchoColumna(30));
		tcm.getColumn(3).setPreferredWidth(anchoColumna(20));
		tcm.getColumn(4).setPreferredWidth(anchoColumna(15));
		tcm.getColumn(5).setPreferredWidth(anchoColumna(15));
	}
	
	
	void listar() {
		int posFila =0;
		if(modelo.getRowCount() > 0) 
			posFila = tblClientes.getSelectedRow();
		if(modelo.getRowCount() == ac.tamanio() -1) 
			posFila = ac.tamanio() -1;
		if(posFila == ac.tamanio()) 
			posFila --;
		modelo.setRowCount(0);
		Cliente c;
		for(int i=0; i< ac.tamanio(); i++) {
			c = ac.obtener(i);
			Object[] fila = { c.getCodigoCliente(),
							 c.getnombres(),
							 c.getApellidos(),
							 c.getCorreo(),
							 c.getTelefono(),
							 c.getDni()};
			    modelo.addRow(fila);
		}
		if(ac.tamanio() > 0) {
			tblClientes.getSelectionModel().setSelectionInterval(posFila, posFila);
		}
	}
	
	void editarFila() {
		if(ac.tamanio() ==0) {
			limpieza();
		}
		else {
			Cliente c = ac.obtener(tblClientes.getSelectedRow());
			txtCodigo.setText("" + c.getCodigoCliente());
			txtNombres.setText(c.getnombres());
			txtApellidos.setText(c.getApellidos());
			txtCorreo.setText(c.getCorreo());
			txtTelefono.setText( c.getTelefono());
			txtDni.setText(c.getDni());
		}
	}
	void limpieza() {
		txtCodigo.setText("" + ac.codigoCorrelativo()); 
		txtNombres.setText("");
		txtApellidos.setText("");
		txtTelefono.setText("");
		txtCorreo.setText("");
		txtDni.setText("");
		txtContraseña.setText("");
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
		txtNombres.setEditable(sino);
		txtApellidos.setEditable(sino);
		txtCorreo.setEditable(sino);
		txtTelefono.setEditable(sino);
		txtDni.setEditable(sino);
		txtContraseña.setEditable(sino);
	}
	void habilitarBotones(boolean sino) {
		btnAdicionar.setEnabled(sino);
		btnModificar.setEnabled(sino);
	}
	
	
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	String leerNombre() {
		return txtNombres.getText().trim();
	}
	String leerApellidos() {
		return txtApellidos.getText().trim();
	}
	String leerCorreo() {
		return txtCorreo.getText().trim();
	}
	String leerTelefono() {
		return txtTelefono.getText().trim();
	}
	String leerDni() {
		return txtDni.getText().trim();
	}
	String leerContraseña() {
		return txtContraseña.getText().trim();
	}
	int anchoColumna(int porcentaje) {
		return porcentaje * scrollPane.getWidth()/100;
	}
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta",0,1,null);
	}
}
