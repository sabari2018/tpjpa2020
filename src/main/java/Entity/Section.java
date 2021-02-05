package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Section {

	private Long id;
	private String name;
	
	private List<Fiche> fiches = new ArrayList<Fiche>();
	private Kanban kanban;
	
	
	public Section() {
		super();
	}


	public Section(String name) {
		this.name = name;
	}
	
	public Section(String name, List<Fiche> fiches,Kanban kanban) {
		this.name = name;
		this.fiches = fiches;
		this.kanban = kanban;
	}


	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@OneToMany(mappedBy = "section", cascade = CascadeType.PERSIST)
	public List<Fiche> getFiches() {
		return fiches;
	}
	
	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}
	
	@ManyToOne
	public Kanban getKanban() {
		return kanban;
	}
	
	public void setKanban(Kanban kanban) {
		this.kanban = kanban;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
