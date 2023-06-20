package Clases;

public class Config {
	private int precioPr, idPr, cantPr;
	private String nombrePr;
	
	public Config(int idPr, String nombrePr, int precioPr,int cantPr) {
		this.precioPr = precioPr;
		this.idPr = idPr;
		this.nombrePr = nombrePr;
		this.cantPr = cantPr;
	}

	public int getCantPr() {
		return cantPr;
	}

	public void setCantPr(int cantPr) {
		this.cantPr = cantPr;
	}

	public int getPrecioPr() {
		return precioPr;
	}

	public void setPrecioPr(int precioPr) {
		this.precioPr = precioPr;
	}

	public int getIdPr() {
		return idPr;
	}

	public void setIdPr(int idPr) {
		this.idPr = idPr;
	}

	public String getNombrePr() {
		return nombrePr;
	}

	public void setNombrePr(String nombrePr) {
		this.nombrePr = nombrePr;
	}
	
	

	
	
	
}
