package IniciarSesion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inicio.inicio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class IniciarSesion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField JPassClave;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
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
	public IniciarSesion() {
	
		setIconImage(Toolkit.getDefaultToolkit().getImage(IniciarSesion.class.getResource("/iconos32/iniciar sesion 32.png")));
		setTitle("INICIAR SESION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 269);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblLogin = new JLabel("INICIAR SESION");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblLogin.setBounds(87, 22, 176, 25);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.BLACK);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuario.setBounds(28, 86, 56, 14);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(108, 84, 140, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.BLACK);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContrasea.setBounds(28, 119, 80, 14);
		contentPane.add(lblContrasea);
		
		JPassClave = new JPasswordField();
		JPassClave.setBounds(108, 115, 140, 25);
		contentPane.add(JPassClave);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String contra = JPassClave.getText();
				String nombre = txtUsuario.getText();
				
				if(contra.contains("123") && nombre.contains("admin")){
					dispose();
					JOptionPane.showMessageDialog(null,"Bienvenido al sistema", "INGRESASTE",JOptionPane.INFORMATION_MESSAGE);
					inicio i = new inicio();
					i.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null, "Usuario o Contrase�a incorrectos", "ERROR",JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					JPassClave.setText("");
					txtUsuario.requestFocus();
				}
			
			}
		});
		btnIngresar.setBounds(124, 167, 100, 33);
		contentPane.add(btnIngresar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(IniciarSesion.class.getResource("/iconos32/iniciar sesion 32.png")));
		label.setBounds(40, 11, 43, 47);
		contentPane.add(label);
	}
}
