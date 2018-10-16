package em.rest.backend.entity.note;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NoteEntity implements Serializable {

	private static final long serialVersionUID = 4885011465247725526L;

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String title;

	private String description;

	public NoteEntity() {}
	
	public NoteEntity(String name, String title, String description) {
		this.name = name;
		this.title = title;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
