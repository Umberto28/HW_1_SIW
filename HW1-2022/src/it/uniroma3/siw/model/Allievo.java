package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Allievo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long matricola;
	private String nome; 
	private String cognome; 
	private String email;
	private LocalDate nascita;
	private String luogoNascita;
	
	@ManyToMany
	private List<Corso> corsi;
	
	//potrebbe essere utile tenere l'informazione relativa alla
	//società di un determinato allievo e, in caso modificarla
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Azienda societa;

	public Long getMatricola() {
		return matricola;
	}

	public void setMatricola(Long matricola) {
		this.matricola = matricola;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascita() {
		return nascita;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public Azienda getSocieta() {
		return societa;
	}

	public void setSocieta(Azienda societa) {
		this.societa = societa;
	}

	
}
