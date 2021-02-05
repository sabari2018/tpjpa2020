package Entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@Entity
public class Fiche {

	
	private Long id;
	private String name;
	private Date deadline;
	private Collaborateur collaborateur;
	private int estimatedTime;
	private List<Tag> tags = new ArrayList<Tag>();
	private String location;
	private String url;
	private String note;
	private Section section;

	
	public Fiche() {
		super();
	}
	
	public Fiche(String name) {
		this.name = name;
	}
	
	
	public Fiche(String name, Date deadline, int estimatedTime, List<Tag> tags, String location, String url,
			String note, Collaborateur collaborateur,Section section) {
		super();
		this.name = name;
		this.deadline = deadline;
		this.estimatedTime = estimatedTime;
		this.tags = tags;
		this.location = location;
		this.url = url;
		this.note = note;
		this.collaborateur = collaborateur;
		this.section = section;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "fiche", cascade = CascadeType.PERSIST)
	public List<Tag> getTags(){
		return this.tags;
	}
	
	@ManyToOne
	public Collaborateur getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}
	
	@ManyToOne
	public Section getSection() {
		return section;
	}
	
	public void setSection(Section section) {
		this.section = section;
	}
	
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public int getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
