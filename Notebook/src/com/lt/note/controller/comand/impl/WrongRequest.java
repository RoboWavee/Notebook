package com.lt.note.controller.comand.impl;

import com.lt.note.controller.CommandResponse;
import com.lt.note.controller.comand.Command;

public class WrongRequest implements Command {
	
	
	@Override
	public CommandResponse execute (String request)  {
		
		return new CommandResponse ("Request error");
	}

	


	

}
