package em.rest.backend.repository.note;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import em.rest.backend.entity.note.NoteEntity;

public interface NoteJpaRepository extends JpaRepository<NoteEntity, Serializable> {

	public abstract NoteEntity findByName(String name);
	
}
