package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Collaborateur {

	private Long id;
	private String firstName;
	private String lastName;
	
	private String email;
	
	private List<Fiche> fiches = new ArrayList<Fiche>();

	public Collaborateur() {
		super();
	}

	public Collaborateur(String email,String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "collaborateur", cascade = CascadeType.PERSIST)
	public List<Fiche> getFiches() {
		return fiches;
	}
	
	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	

}
