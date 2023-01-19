package com.lt.note.controller.comand.impl;

import com.lt.note.controller.CommandResponse;
import com.lt.note.controller.comand.Command;
import com.lt.note.entity.Note;
import com.lt.note.service.NotesCreateService;
import com.lt.note.service.ServiceProvider;
import com.lt.note.service.exception.ServiceException;

public class SaveNote implements Command {

	private final char paramDelimeter = ' ';

	@Override
	public CommandResponse execute(String request) {

		String req = request.substring(request.indexOf(paramDelimeter));

		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		NotesCreateService notesCreateService = serviceProvider.getNotesCreateService();

		Note note = new Note(null, req);

		try {

			notesCreateService.add(note);

			return new CommandResponse("Note saved");

		}

		catch (ServiceException ex) {

			return new CommandResponse("Note not saved ");

		}
	}
}
