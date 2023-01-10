package com.lt.note.dal;

import java.util.List;

import com.lt.note.dal.exception.DAOException;
import com.lt.note.entity.Note;

public interface NotesDAO {

	List<Note> load() throws DAOException;
	
	void save(Note note) throws DAOException;
	
}
