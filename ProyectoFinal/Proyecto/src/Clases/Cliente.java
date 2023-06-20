package Clases;

public class Cliente {
	private int codigoCliente;
	private String nombres, apellidos, correo, telefono, dni, contraseña;
	
	public Cliente(int codigoCliente,  String nombress, String apellidos, String correo, String telefono, String dni, String contraseña) {
		this.codigoCliente = codigoCliente;
		this.telefono = telefono;
		this.dni = dni;
		this.nombres = nombress;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getnombres() {
		return nombres;
	}

	public void setnombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
}
