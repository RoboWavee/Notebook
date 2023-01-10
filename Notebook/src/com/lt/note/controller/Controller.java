package com.lt.note.controller;

import com.lt.note.controller.comand.Command;
import com.lt.note.dal.exception.DAOException;
import com.lt.note.service.exception.ServiceException;

public final class Controller {

	private final CommandProvider provider = new CommandProvider();

	private final char paramDelimeter = ' ';

	public CommandResponse executeTask(String request) throws DAOException, ServiceException {

		String commandName;
		Command executionCommand;

		commandName = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(commandName);

		CommandResponse response;
		response = executionCommand.execute(request);

		return response;
	}

}
