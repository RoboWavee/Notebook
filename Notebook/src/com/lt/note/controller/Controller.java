package com.lt.note.controller;

import com.lt.note.controller.comand.Command;


public class Controller {

	private final CommandProvider provider = new CommandProvider();

	private final char paramDelimeter = ' ';

	public CommandResponse executeTask(String request) {

		String commandName;
		Command executionCommand;

		commandName = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(commandName);

		CommandResponse response;
		response = executionCommand.execute(request);

		return response;
	}

}
