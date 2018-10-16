package em.rest.backend.service.note.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import em.rest.backend.convert.note.NoteConvert;
import em.rest.backend.entity.note.NoteEntity;
import em.rest.backend.model.note.NoteModel;
import em.rest.backend.repository.note.NoteJpaRepository;
import em.rest.backend.service.note.NoteService;

@Service("noteService")
public class NoteServiceImpl implements NoteService {

	@Autowired
	@Qualifier("noteJpaRepository")
	private NoteJpaRepository noteJpaRepository;	

	@Autowired
	@Qualifier("noteConvert")
	private NoteConvert noteConvert;

	@Override
	public NoteModel postNoteEntity(NoteEntity noteEntity) {
		return noteConvert.noteEntityConvertNoteModel(noteJpaRepository.save(noteEntity));
	}

	@Override
	public NoteModel getFindByName(String name) {
		return noteConvert.noteEntityConvertNoteModel(noteJpaRepository.findByName(name));
	}

	@Override
	public List<NoteModel> getAllNoteEntity() {
		return noteConvert.noteEntityListConvertNoteModelList(noteJpaRepository.findAll());
	}	
	
	
}
