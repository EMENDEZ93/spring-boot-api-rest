package em.rest.backend.service.note;

import java.util.List;

import em.rest.backend.entity.note.NoteEntity;
import em.rest.backend.model.note.NoteModel;

public interface NoteService {

	public NoteModel postNoteEntity(NoteEntity noteEntity); 

	public NoteModel getFindByName(String name);
	
	public List<NoteModel> getAllNoteEntity();
	
}
