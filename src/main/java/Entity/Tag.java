package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tag {

	
	private Long id;
	private String content;
	private Fiche fiche;
	
	public Tag() {
		super();
	}
	
	public Tag(String content, Fiche fiche) {
		this.content = content;
		this.fiche = fiche;
	}
	public Tag(String content) {
		this.content = content;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@ManyToOne
	public Fiche getFiche() {
		return fiche;
	}
	
	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}
	
	@Override
	public String toString() {
	
		return "Tag [id= "+ id +", Fiche = "+ fiche.getName() + "]";
	}
}
