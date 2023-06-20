package Clases;

public class Desc {
	private int cod;
	private String codDesc;
	private float descuento;
	
	public Desc( int cod, String codDesc, float descuento) {
		this.cod=cod;
		this.codDesc = codDesc;
		this.descuento = descuento;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCodDesc() {
		return codDesc;
	}

	public void setCodDesc(String codDesc) {
		this.codDesc = codDesc;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	
}
