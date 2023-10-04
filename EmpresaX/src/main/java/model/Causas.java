package model;

public class Causas {
	private int idCausas;
	private String tipoCausas;
	
	
	public Causas(int idCausas, String tipoCausas) {
		super();
		this.idCausas = idCausas;
		this.tipoCausas = tipoCausas;
	}


	public int getIdCausas() {
		return idCausas;
	}


	public void setIdCausas(int idCausas) {
		this.idCausas = idCausas;
	}


	public String getTipoCausas() {
		return tipoCausas;
	}


	public void setTipoCausas(String tipoCausas) {
		this.tipoCausas = tipoCausas;
	}
	
	
	
	
}
