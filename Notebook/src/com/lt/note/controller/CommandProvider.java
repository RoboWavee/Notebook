package com.lt.note.controller;

import java.util.HashMap;

import com.lt.note.controller.comand.Command;
import com.lt.note.controller.comand.CommandName;
import com.lt.note.controller.comand.impl.FindByContent;
import com.lt.note.controller.comand.impl.FindByDate;
import com.lt.note.controller.comand.impl.SaveNote;
import com.lt.note.controller.comand.impl.WrongRequest;

final class CommandProvider {

	private final HashMap<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {

		repository.put(CommandName.ADD_NEW_NOTE, new SaveNote());
		repository.put(CommandName.FIND_BY_CONTENT, new FindByContent());
		repository.put(CommandName.FIND_BY_DATE, new FindByDate());
		repository.put(CommandName.WRONG_REQUEST, new WrongRequest());

	}

	Command getCommand(String name) {

		CommandName commandName = null;
		Command command = null;

		try {

			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);

		} catch (IllegalArgumentException | NullPointerException e) {

			command = repository.get(CommandName.WRONG_REQUEST);

		}

		return command;

	}

}
