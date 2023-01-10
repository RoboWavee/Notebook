package com.lt.note.dal;

import com.lt.note.dal.exception.DAOException;
import com.lt.note.dal.impl.FileNotesDAO;

public final class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private NotesDAO notesDAO;

	private DAOProvider() {

		try {

			notesDAO = new FileNotesDAO();

		}

		catch (DAOException ex) {

			throw new RuntimeException();
		}

	}

	public NotesDAO getNotesDAO() {
		return notesDAO;
	}

	public static DAOProvider getInstance() {
		return instance;
	}

}
