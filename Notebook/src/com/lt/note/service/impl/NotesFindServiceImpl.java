package com.lt.note.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.lt.note.dal.DAOProvider;
import com.lt.note.dal.NotesDAO;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.entity.Note;
import com.lt.note.service.NotesFindService;
import com.lt.note.service.exception.ServiceException;

public class NotesFindServiceImpl implements NotesFindService {

	private final static DAOProvider provider = DAOProvider.getInstance();

	private final static NotesDAO notesDAO = provider.getNotesDAO();

	private final static NotesDataValidationImpl isNotesValid = new NotesDataValidationImpl();

	@Override
	public List<Note> findByContent(String content) throws ServiceException {

		List<Note> resultNote = new ArrayList<>();

		try {

			List<Note> sourceList = notesDAO.load();

			for (Note nt : sourceList) {

				if (isNotesValid.isContentNotEmpty(nt.getContent())) {

					if (nt.getContent().contains(content)) {

						resultNote.add(nt);
					}
				}
			}

		} catch (DAOException ex) {

			throw new ServiceException(ex);

		}

		return resultNote;
	}

	@Override
	public List<Note> findByDate(LocalDateTime date) throws ServiceException {

		List<Note> resultData = new ArrayList<>();

		try {

			List<Note> sourceList = notesDAO.load();

			for (Note nt : sourceList) {

				if (nt.getDate().equals(date)) {

					resultData.add(nt);
				}
			}

		} catch (DAOException ex) {

			throw new ServiceException(ex);

		}

		return resultData;
	}

}
