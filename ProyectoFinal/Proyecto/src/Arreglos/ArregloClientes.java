package Arreglos;

import java.io.*;
import java.util.ArrayList;

import Clases.Cliente;

public class ArregloClientes {
	private ArrayList <Cliente> cliente;
	
	public ArregloClientes() {
		cliente = new ArrayList <Cliente>();
		cargarClientes();
	}
	
	public void adicionar(Cliente x) {
		cliente.add(x);
		grabarClientes();
	}
	public int tamanio() {
		return cliente.size();
	}
	public Cliente obtener(int i) {
		return cliente.get(i);
	}
	public Cliente buscar(int codigoCliente) {
		for(int i=0; i<tamanio();i++) {
			if(obtener(i).getCodigoCliente() == codigoCliente) {
				return obtener(i);
			}
		}
		return null;
	}
	public void eliminar(Cliente x) {
		cliente.remove(x);
		grabarClientes();
	}
	public void actualizarArchivo() {
		grabarClientes();
	}
	private void grabarClientes() {
		try {
			PrintWriter pw;
			String linea;
			Cliente x;
			pw = new PrintWriter(new FileWriter("clientes.txt"));
			for(int i=0; i<tamanio();i++) {
				x = obtener(i);
				linea = x.getCodigoCliente() + ";" +
						x.getnombres() + ";" +
						x.getApellidos() + ";" +
						x.getCorreo() + ";" +
						x.getTelefono() + ";"+
						x.getDni() + ";" +
						x.getContraseña();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e) {
		}
	}
	private void cargarClientes() {
		try {
			BufferedReader br;
			String linea;
			String [] s;
			int codigoCliente;
			String nombres, apellidos, correo, telefono, dni, contra;
			br = new BufferedReader(new FileReader("clientes.txt"));
			while((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoCliente = Integer.parseInt(s[0].trim());
				nombres = s[1].trim();
				apellidos = s[2].trim();
				correo = s[3].trim();
				telefono = s[4].trim();
				dni = s[5].trim();
				contra = s[6].trim();
				adicionar(new Cliente(codigoCliente, nombres, apellidos, correo, telefono, dni, contra));
			}
			br.close();
		}
		catch(Exception e) {
		}
	}
	public int codigoCorrelativo() {
		if(tamanio()==0) {
			return 1001;
		}
		else {
			return obtener(tamanio()-1).getCodigoCliente()+1;
		}
	}
}
