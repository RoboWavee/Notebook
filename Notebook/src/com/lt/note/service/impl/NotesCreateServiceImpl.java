package com.lt.note.service.impl;

import com.lt.note.dal.DAOProvider;
import com.lt.note.dal.NotesDAO;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.entity.Note;
import com.lt.note.service.NotesCreateService;
import com.lt.note.service.exception.ServiceException;

public class NotesCreateServiceImpl implements NotesCreateService {

	@Override
	public void add(Note note) throws ServiceException {

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		if (note == null) {

			throw new ServiceException("No records");

		}

		try {

			notesDAO.save(note);

		}

		catch (DAOException ex) {

			throw new ServiceException(ex);

		}

	}

}
