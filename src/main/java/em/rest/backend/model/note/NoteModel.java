package em.rest.backend.model.note;

import em.rest.backend.entity.note.NoteEntity;

public class NoteModel {

	private int id;

	private String name;

	private String title;

	private String description;

	public NoteModel() {
	}

	public NoteModel(NoteEntity notaEntity) {
		this.id = notaEntity.getId();
		this.name = notaEntity.getName();
		this.title = notaEntity.getTitle();
		this.description = notaEntity.getDescription();
	}
	
	public NoteModel(int id, String name, String title, String description) {
		this.id = id;
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
