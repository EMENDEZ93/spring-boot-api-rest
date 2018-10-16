package em.rest.backend.controller.note;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import em.rest.backend.entity.note.NoteEntity;
import em.rest.backend.model.note.NoteModel;
import em.rest.backend.service.note.NoteService;

@RestController
public class NoteController {

	@Autowired
	@Qualifier("noteService")
	private NoteService noteService;
	
	@PostMapping("/post/note")
	public NoteModel postNoteEntity(@Valid @RequestBody NoteEntity noteEntity) {
		return noteService.postNoteEntity(noteEntity);
	}

	@GetMapping("/notes")
	public List<NoteModel> getAllNotes(){
		return noteService.getAllNoteEntity();
	}
	
	@GetMapping("/get/find/by/name/{name}")
	public NoteModel getFindByName(@PathVariable(value="name") String name){
		return noteService.getFindByName(name);
	}	
	
}
