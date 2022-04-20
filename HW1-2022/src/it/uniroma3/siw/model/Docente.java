package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome; 
	private String cognome;
	private String luogoNascita;
	private LocalDate nascita;
	private float iva;
	
	//potrebbe essere utile tenere l'informazione relativa alla
	//lista di insegnamenti di un determinato docente e, in caso modificarla
	@OneToMany (mappedBy = "responsabile", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Corso> insegnamenti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public LocalDate getNascita() {
		return nascita;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public List<Corso> getInsegnamenti() {
		return insegnamenti;
	}

	public void setInsegnamenti(List<Corso> insegnamenti) {
		this.insegnamenti = insegnamenti;
	}

	
}
