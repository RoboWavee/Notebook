package com.lt.note.controller.comand;

import com.lt.note.controller.CommandResponse;

public interface Command {

	public CommandResponse execute(String request);



}
