package com.lt.note.service;

import com.lt.note.entity.Note;
import com.lt.note.service.exception.ServiceException;

public interface NotesCreateService {

	void add(Note note) throws ServiceException;

}
