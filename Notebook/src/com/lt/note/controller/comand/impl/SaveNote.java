package com.lt.note.controller.comand.impl;

import com.lt.note.controller.CommandResponse;
import com.lt.note.controller.comand.Command;
import com.lt.note.dal.DAOProvider;
import com.lt.note.dal.NotesDAO;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.entity.Note;
import com.lt.note.service.exception.ServiceException;

public class SaveNote implements Command {

	private final char paramDelimeter = ' ';

	@Override
	public CommandResponse saveNote(String request) throws DAOException {

		String saveNote = request.substring(request.indexOf(paramDelimeter));

		Note note = new Note();

		DAOProvider provider = DAOProvider.getInstance();

		NotesDAO notesDAO = provider.getNotesDAO();

		try {

			notesDAO.save(note);

			return new CommandResponse("Note saved");

		}

		catch (DAOException ex) {

			return new CommandResponse("Note not saved ");

		}

	}
}
