package com.lt.note.service.impl;

import com.lt.note.dal.DAOProvider;
import com.lt.note.dal.NotesDAO;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.entity.Note;
import com.lt.note.service.NotesCreateService;
import com.lt.note.service.exception.ServiceException;

public class NotesCreateServiceImpl implements NotesCreateService {

	private final static DAOProvider provider = DAOProvider.getInstance();

	private final static NotesDAO notesDAO = provider.getNotesDAO();

	private final static NotesDataValidationImpl isNotesValid = new NotesDataValidationImpl();

	@Override
	public void add(Note note) throws ServiceException {

		if (isNotesValid.isContentNotEmpty(note.getContent())) {

			try {

				notesDAO.save(note);

			}

			catch (DAOException ex) {

				throw new ServiceException(ex);

			}

		}

	}
}
