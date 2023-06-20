package Arreglos;

import java.io.*;
import java.util.*;

import Clases.Desc;

public class ArregloDescuento {
	private ArrayList <Desc> desc;
	
	public ArregloDescuento() {
		desc = new ArrayList <Desc>();
		cargarDescuento();
	}
	public void adicionar(Desc x) {
		desc.add(x);
		grabarDescuento();
	}
	public int tamanio() {
		return desc.size();
	}
	public Desc obtener(int i) {
		return desc.get(i);
	}
	public Desc buscar(int cod) {
		for(int i=0; i<tamanio();i++) {
			if(obtener(i).getCod() == cod) {
				return obtener(i);
			}
		}
		return null;
	}
	public void eliminar(Desc x) {
		desc.remove(x);
		grabarDescuento();
	}
	public void actualizarArchivo() {
		grabarDescuento();
	}
	
	private void grabarDescuento() {
		try {
			PrintWriter pw;
			String linea;
			Desc x;
			pw = new PrintWriter(new FileWriter("descuento.txt"));
			for(int i=0;i<tamanio();i++) {
				x = obtener(i);
				linea = x.getCod() + ";"+
						x.getCodDesc() + ";"+
						x.getDescuento();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e) {
		}
	}
	private void cargarDescuento() {
		try {
			BufferedReader br;
			String linea;
			String [] s;
			String codDesc;
			float descuento;
			int cod;
			br = new BufferedReader(new FileReader("descuento.txt"));
			while((linea = br.readLine()) != null) {
				s = linea.split(";");
				cod = Integer.parseInt(s[0].trim());
				codDesc = s[1].trim();
				descuento = Float.parseFloat(s[2].trim());
				adicionar(new Desc(cod,codDesc, descuento));
			}
			br.close();
		}
		catch(Exception e) {
		}
	}
	public int codigoCorrelativo() {
		if(tamanio() == 0) {
			return 10;
		}
		else {
			return obtener(tamanio()-1).getCod()+1;
		}
	}
}
