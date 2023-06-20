package Arreglos;

import java.io.*;
import java.util.*;

import Clases.Config;

public class ArregloConfiguracion {
	private ArrayList <Config> configuracion;
	
	public ArregloConfiguracion() {
		configuracion = new ArrayList <Config>();
		cargarConfiguracion();
	}
	public void adicionar(Config x) {
		configuracion.add(x);
		grabarConfiguracion();
	}
	public int tamanio() {
		return configuracion.size();
	}
	public Config obtener(int i) {
		return configuracion.get(i);
	}
	public Config buscar(int idPr) {
		for(int i=0; i<tamanio();i++) {
			if(obtener(i).getIdPr() == idPr) {
				return obtener(i);
			}
		}
		return null;
	}
	public void eliminar(Config x) {
		configuracion.remove(x);
		grabarConfiguracion();
	}
	 public void actualizarArchivo(){
	 		grabarConfiguracion();
	}
	private void grabarConfiguracion() {
		try {
			PrintWriter pw;
			String linea;
			Config x;
			pw = new PrintWriter(new FileWriter("configuracion.txt"));
			for(int i=0; i<tamanio();i++) {
				x = obtener(i);
				linea = x.getIdPr() + ";"+
						x.getNombrePr() + ";"+
						x.getPrecioPr() + ";"+
						x.getCantPr();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e) {
		}
	}
	private void cargarConfiguracion() {
		try {
			BufferedReader br;
			String linea;
			String [] s;
			int precioPr, idPr, cantPr;
			String nombrePr;
			br = new BufferedReader(new FileReader("configuracion.txt"));
			while((linea = br.readLine()) != null){
				s = linea.split(";");
				idPr = Integer.parseInt(s[0].trim());
				nombrePr = s[1].trim();
				precioPr= Integer.parseInt(s[2].trim());
				cantPr = Integer.parseInt(s[3].trim());
				adicionar(new Config(idPr, nombrePr, precioPr, cantPr));
			}
			br.close();
		}
		catch(Exception e) {
		}
	}
	public int idCorrelativo() {
		if(tamanio() == 0) {
			return 101;
		}
		else {
			return obtener(tamanio()-1).getIdPr() + 1;
		}
	}
	
}
