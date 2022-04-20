package it.uniroma3.siw.model;

import javax.persistence.*;

@Entity
public class Azienda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ragione;
	private Indirizzo sede;
	private String telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagione() {
		return ragione;
	}

	public void setRagione(String ragione) {
		this.ragione = ragione;
	}

	public Indirizzo getSede() {
		return sede;
	}

	public void setSede(Indirizzo sede) {
		this.sede = sede;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
