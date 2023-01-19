package com.lt.note.controller.comand.impl;

import com.lt.note.controller.CommandResponse;
import com.lt.note.controller.comand.Command;
import com.lt.note.service.NotesFindService;
import com.lt.note.service.ServiceProvider;
import com.lt.note.service.exception.ServiceException;

public class FindByDate implements Command {


	@Override
	public CommandResponse execute(String request) {

	
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		NotesFindService notesFindService = serviceProvider.getNotesFindService();

		try {

			return new CommandResponse(notesFindService.findByDate(null));

		} catch (ServiceException ex) {

			return new CommandResponse("Note not found ");
		}

	}

}
