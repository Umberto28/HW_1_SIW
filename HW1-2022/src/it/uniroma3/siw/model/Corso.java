package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Corso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private LocalDate inizio;
	private Long durata;
	
	@ManyToMany (mappedBy = "corsi")
	private List<Allievo> allievi;
	
	//potrebbe essere utile tenere l'informazione relativa al 
	//docente di un determinato corso e, in caso modificarla
	@ManyToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Docente responsabile;

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

	public LocalDate getInizio() {
		return inizio;
	}

	public void setInizio(LocalDate inizio) {
		this.inizio = inizio;
	}

	public Long getDurata() {
		return durata;
	}

	public void setDurata(Long durata) {
		this.durata = durata;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public Docente getResponsabile() {
		return responsabile;
	}

	public void setResponsabile(Docente responsabile) {
		this.responsabile = responsabile;
	}
}
