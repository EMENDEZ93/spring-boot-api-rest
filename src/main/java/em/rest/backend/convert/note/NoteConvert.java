package em.rest.backend.convert.note;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import em.rest.backend.entity.note.NoteEntity;
import em.rest.backend.model.note.NoteModel;

@Component("noteConvert")
public class NoteConvert {

	public List<NoteModel> noteEntityConvertNoteModel( List<NoteEntity> notaEntities ){
		
		List<NoteModel> noteModels = new ArrayList<>();
		
		notaEntities.stream().forEach( noteEntity -> {
			noteModels.add( new NoteModel(noteEntity) );
		});
		
		return noteModels;
	}
	
}
