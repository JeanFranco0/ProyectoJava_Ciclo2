package GuisPrincipal;

import Clases.Desc;
import Arreglos.ArregloDescuento;

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

public class Descuento extends JDialog implements ActionListener, KeyListener, MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCodDesc;
	private JTextField txtDesc;
	private JTable tblDescuento;
	private JButton btnAceptar;
	private JButton btnAdicionar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JLabel lblText2;
	private DefaultTableModel modelo;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblCodDesc;
	private JLabel lblDesc;
	private JLabel lblText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Descuento dialog = new Descuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Descuento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Descuento.class.getResource("/iconos16/descuentos.png")));
		setTitle("Configuracion | Descuento");
		setBounds(100, 100, 430, 453);
		getContentPane().setLayout(null);
		
		lblCodDesc = new JLabel("Codigo Descuento:");
		lblCodDesc.setBounds(10, 43, 123, 14);
		getContentPane().add(lblCodDesc);
		
		txtCodDesc = new JTextField();
		txtCodDesc.setBounds(126, 40, 77, 20);
		getContentPane().add(txtCodDesc);
		txtCodDesc.setColumns(10);
		
		lblDesc = new JLabel("Descuento:");
		lblDesc.setBounds(10, 68, 86, 14);
		getContentPane().add(lblDesc);
		
		txtDesc = new JTextField();
		txtDesc.setBounds(92, 65, 55, 20);
		getContentPane().add(txtDesc);
		txtDesc.setColumns(10);
		
		lblText = new JLabel("Nota: El codigo varia entre 1-3, es de 3 digitos ,");
		lblText.setForeground(Color.RED);
		lblText.setBounds(10, 96, 299, 30);
		getContentPane().add(lblText);
		
		lblText2 = new JLabel("el descuento maximo es de 30% ");
		lblText2.setForeground(Color.RED);
		lblText2.setBounds(10, 117, 361, 30);
		getContentPane().add(lblText2);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 15, 56, 14);
		getContentPane().add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(76, 12, 42, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.addMouseListener(this);
		btnAceptar.setForeground(Color.GREEN);
		btnAceptar.setBounds(169, 11, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.addMouseListener(this);
		btnAdicionar.setForeground(Color.BLUE);
		btnAdicionar.setBounds(319, 11, 89, 23);
		getContentPane().add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.addMouseListener(this);
		btnModificar.setForeground(Color.CYAN);
		btnModificar.setBounds(319, 43, 89, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.addMouseListener(this);
		btnEliminar.setForeground(Color.RED);
		btnEliminar.setBounds(319, 83, 89, 23);
		getContentPane().add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 143, 382, 260);
		getContentPane().add(scrollPane);
		
		tblDescuento = new JTable();
		scrollPane.setViewportView(tblDescuento);
		tblDescuento.setFillsViewportHeight(true);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("Cod. Descuento");
		modelo.addColumn("Descuento %");
		
		tblDescuento.setModel(modelo);
		
		txtCodigo.setEditable(false);
		
		habilitarEntradas(false);
		ajustarAnchoColumnas();
		listar();
		editarFila(); 
		this.setLocationRelativeTo(null);
	}
	
	ArregloDescuento ad = new ArregloDescuento();
	
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
		int cod = leerCodigo();
		String codDesc = leerCodDesc();
		
		if(codDesc.length() > 0 && codDesc.matches("[1-3]{1,3}")) {
			if(txtDesc.getText().matches("[0-9]{1,2}") && leerDescuento() < 30) {
				float descuento = leerDescuento();
				if(btnAdicionar.isEnabled() == false) {
					Desc nuevo = new Desc(cod,codDesc, descuento);
					ad.adicionar(nuevo);
					btnAdicionar.setEnabled(true);
				}
				if(btnModificar.isEnabled() == false) {
					Desc d = ad.buscar(cod);
					d.setCodDesc(codDesc);
					d.setDescuento(descuento);
					ad.actualizarArchivo();
					btnModificar.setEnabled(true);
				}
				listar();
				habilitarEntradas(false);
			}
			else {
				error("Ingresa un descuento que cumpla los requisitos", txtDesc);
			}
		}
		else {
			error("Ingresa el codigo correctamente", txtCodDesc);
		}	
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		btnAdicionar.setEnabled(false);
		btnModificar.setEnabled(true);
		btnAceptar.setEnabled(true);
		limpieza();
		habilitarEntradas(true);
		txtCodDesc.requestFocus();
	}
	protected void actionarPerformedBtnModificar(ActionEvent arg0) {
		btnAdicionar.setEnabled(true);
		btnModificar.setEnabled(false);
		if(ad.tamanio() == 0) {
			btnAceptar.setEnabled(false);
			habilitarEntradas(false);
			mensaje("No existen descuentos");
		}
		else {
			editarFila();
			btnAceptar.setEnabled(true);
			habilitarEntradas(true);
			txtCodDesc.requestFocus();
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		btnAdicionar.setEnabled(true);
		btnModificar.setEnabled(true);
		btnAceptar.setEnabled(true);
		if(ad.tamanio() == 0) {
			error("No existen descuentos", txtCodDesc);
		}
		else {
			editarFila();
			habilitarEntradas(false);
			int confir = confirmar("¿ Desea eliminar el descuento ?");
			if(confir == 0) {
				ad.eliminar(ad.buscar(leerCodigo()));
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
		if(arg0.getSource() == tblDescuento) {
			mouseClickedTblDescuento(arg0);
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
		if(arg0.getSource() == tblDescuento) {
			mouseEnteredTblDescuento(arg0);
		}
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedTblDescuento(MouseEvent arg0) {
		habilitarEntradas(false);
		habilitarBotones(true);
		editarFila();
	}
	protected void mouseEnteredTblDescuento(MouseEvent arg0) {
		tblDescuento.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
		TableColumnModel tcm = tblDescuento.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna(10));
		tcm.getColumn(1).setPreferredWidth(anchoColumna(20));
		tcm.getColumn(2).setPreferredWidth(anchoColumna(20));
	}
	void listar() {
		int posFila =0;
		if(modelo.getRowCount() > 0) 
			posFila = tblDescuento.getSelectedRow();
		if(modelo.getRowCount() == ad.tamanio() -1) 
			posFila = ad.tamanio() -1;
		if(posFila == ad.tamanio()) 
			posFila --;
		modelo.setRowCount(0);
		Desc d;
		for(int i=0; i< ad.tamanio(); i++) {
			d = ad.obtener(i);
			Object[] fila = { d.getCod(),
							 d.getCodDesc(),
							 d.getDescuento() + " %"};
			    modelo.addRow(fila);
		}
		if(ad.tamanio() > 0) {
			tblDescuento.getSelectionModel().setSelectionInterval(posFila, posFila);
		}
	}
	void editarFila() {
		if(ad.tamanio() == 0) {
			limpieza();
		}
		else {
			Desc d = ad.obtener(tblDescuento.getSelectedRow());
			txtCodigo.setText(""+d.getCod());
			txtCodDesc.setText(d.getCodDesc());
			txtDesc.setText(""+d.getDescuento());
		}
	}
	void limpieza() {
		txtCodigo.setText("" + ad.codigoCorrelativo());
		txtCodDesc.setText("");
		txtDesc.setText("");
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
		txtCodDesc.setEnabled(sino);
		txtDesc.setEnabled(sino);
	}
	void habilitarBotones(boolean sino) {
		btnAdicionar.setEnabled(sino);
		btnModificar.setEnabled(sino);
	}
	int anchoColumna(int porcentaje) {
		return porcentaje * scrollPane.getWidth()/100;
	}
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta",0,1,null);
	}
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	String leerCodDesc() {
		return txtCodDesc.getText().trim();
	}
	float leerDescuento() {
		return Float.parseFloat(txtDesc.getText().trim());
	}
}
