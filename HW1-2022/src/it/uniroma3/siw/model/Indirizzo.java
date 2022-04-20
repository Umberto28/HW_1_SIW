package it.uniroma3.siw.model;

public class Indirizzo {

	private String via;
	private int civico;
	private String comune;
	private int cap;
	private String provincia;
	
	public Indirizzo(String via, int civico, String comune, int cap, String provincia) {
		
		setVia(via);
		setCivico(civico);
		setComune(comune);
		setCap(cap);
		setProvincia(provincia);		
	}
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getCivico() {
		return civico;
	}
	public void setCivico(int civico) {
		this.civico = civico;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
