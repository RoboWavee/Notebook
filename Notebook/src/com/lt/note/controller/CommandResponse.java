package com.lt.note.controller;

import java.util.List;

import com.lt.note.entity.Note;

public class CommandResponse {

	private String commandResponse;

	public CommandResponse(List<Note> list) {

	}

	public CommandResponse(String commandResponse) {

		this.commandResponse = commandResponse;

	}

	public String getCommandResponse() {
		return commandResponse;
	}

	public void setCommandResponse(String commandResponse) {
		this.commandResponse = commandResponse;
	}

}
